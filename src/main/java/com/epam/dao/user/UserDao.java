package com.epam.dao.user;

import com.epam.dao.GenericHibernateDaoImpl;
import com.epam.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by swift-seeker-89717 on 13.05.2015.
 */
@Repository("userDao")
public class UserDao extends GenericHibernateDaoImpl<User> implements IUserDao<User> {

    public UserDao() {
        System.out.println("initial userDao");
        setClass(User.class);
    }
}
