package roberth.loaiza.svc.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import roberth.loaiza.svc.miw.upm.es.C52;

public class C52Test {

    @Before
    public void Before() {
        new C52();
    }
    @Test
    public void testMA() {
        assertEquals("mA", C52.mA());
    }

}
