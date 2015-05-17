package com.epam.validator;

import com.epam.entity.Client;

/**
 * Created by swift-seeker-89717 on 14.05.2015.
 */
public class Demo {

    public static void main(String[] args) {
        Validator validator = new Validator(Client.class);
        EntityFormBean formBean = validator.validate();
        System.out.println(formBean);
    }

}
