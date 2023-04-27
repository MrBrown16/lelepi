import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.beans.Transient;

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
        Double res = mainModel.calcParaVol(10,10,10);
        assertEquals(res, 1000.0);
    }
    @Test
    public void testCalcParaVol5(){
        Double res = mainModel.calcParaVol(10,10,10);
        assertEquals(res, 1000.0);
    }
    @Test
    public void testCalcParaVol6(){
        Double res = mainModel.calcParaVol(10,10,10);
        assertEquals(res, 1000.0);
    }
    
}

