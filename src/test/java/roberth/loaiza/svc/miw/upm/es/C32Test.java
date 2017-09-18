package roberth.loaiza.svc.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import roberth.loaiza.svc.miw.upm.es.C32;

public class C32Test {
    
    @Before
    public void before() {
        
     new C32();

    }
    @Test
    public void testMA() {
        assertEquals("mA", C32.mA());
    }

}


