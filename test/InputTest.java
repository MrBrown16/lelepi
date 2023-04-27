/*
 * File: InputTest.java
 * Author: Móra Barna
 * Copyright: 2023 Móra Barna
 * Group: Szoft_I_1_N
 * Date: 2023.04.27
 * Github: https://github.com/MrBrown16/lelepi.git
 * Licence: GNU GPL
 */

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


import org.junit.Before;
import org.junit.Test;

import model.MainModel;

public class InputTest {
    MainModel mainModel = new MainModel();

    @Before
    public void setUp(){
        mainModel = new MainModel();
    }

    @Test
    public void testInputCheck1(){
        Boolean res = mainModel.checkInput("a");
        assertFalse(res);
    }
    @Test
    public void testInputCheck2(){
        Boolean res = mainModel.checkInput("1");
        assertTrue(res);
    }
    @Test
    public void testInputCheck3(){
        Boolean res = mainModel.checkInput("-1");
        assertFalse(res);
    }
    @Test
    public void testInputCheck4(){
        Boolean res = mainModel.checkInput("1a");
        assertFalse(res);
    }
    @Test
    public void testInputCheck5(){
        Boolean res = mainModel.checkInput("1.12");
        assertTrue(res);
    }
}
