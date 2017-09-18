package roberth.loaiza.svc.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import roberth.loaiza.svc.miw.upm.es.C12;

public class C12Test {

    @Before
    public void Before() {
        new C12();
    }
    @Test
    public void testMA() {
        assertEquals("mA", C12.mA());
    }

}
