package com.epam.service.user;

import com.epam.dao.GenericHibernateDao;
import com.epam.dao.user.UserDao;
import com.epam.entity.User;
import com.epam.service.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by swift-seeker-89717 on 13.05.2015.
 */
@Service("userService")
public class UserService extends GenericManagerImpl<User, UserDao> implements IUserService<User> {

    @Autowired
    @Qualifier("userDao")
    @Override
    public void setDao(GenericHibernateDao dao) {
        super.setDao(dao);
    }

}
