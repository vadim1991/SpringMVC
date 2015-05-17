package com.epam.validator;

import com.epam.entity.Client;
import org.junit.Before;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by swift-seeker-89717 on 14.05.2015.
 */
public class TestValidator {

    private HttpServletRequest request;
    private Validator validator;

    @Before
    public void init() {
        request = mock(HttpServletRequest.class);
        when(request.getParameter("login")).thenReturn("");
        when(request.getParameter("id")).thenReturn("15");
        when(request.getParameter("phone")).thenReturn("1512121221 ");
        when(request.getParameter("password")).thenReturn("15");
        validator = new Validator(request, Client.class);
    }

    @Test
    public void testValidateMethod() {
        EntityFormBean formBean = validator.validate();
        System.out.println(formBean);
    }

}
