package roberth.loaiza.svc.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import roberth.loaiza.svc.miw.upm.es.C22;

public class C22Test {
       
    @Before
    public void before() {
    
        new C22();

    }
    @Test
    public void testMA() {
        assertEquals("mA", C22.mA());
    }

}
