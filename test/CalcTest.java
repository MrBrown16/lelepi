/*
 * File: CalcTest.java
 * Author: Móra Barna
 * Copyright: 2023 Móra Barna
 * Group: Szoft_I_1_N
 * Date: 2023.04.27
 * Github: https://github.com/MrBrown16/lelepi.git
 * Licence: GNU GPL
 */


import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.Before;
import org.junit.Test;

import model.MainModel;

public class CalcTest {
    MainModel mainModel = new MainModel();

    @Before
    public void setUp(){
        mainModel = new MainModel();
    }

    @Test
    public void testCalcParaVol1(){
        Double res = mainModel.calcParaVol(10,10,10);
        assertEquals(res, 1000.0);
    }
    @Test
    public void testCalcParaVol2(){
        Double res = mainModel.calcParaVol(-10,10,10);
        assertEquals(res, 1000.0);
    }
    @Test
    public void testCalcParaVol3(){
        Double res = mainModel.calcParaVol(0,100,10);
        assertEquals(res, 0.0);
    }
    @Test
    public void testCalcParaVol4(){
        Double res = mainModel.calcParaVol(345,-600,10);
        assertEquals(res, 2070000.0);
    }
    
}

