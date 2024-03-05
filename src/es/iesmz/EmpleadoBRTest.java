package es.iesmz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class EmpleadoBRTest {
    @Test
    public void calcularSalarioNeto1() {
        assertEquals(1640, EmpleadoBR.calculaSalarioNeto(2000));
    }

    @Test
    public void calcularSalarioNeto2() {
        assertEquals(1230, EmpleadoBR.calculaSalarioNeto(1500));
    }

    @Test
    public void calcularSalarioNeto3() {
        assertEquals(1259.9916f, EmpleadoBR.calculaSalarioNeto(1499.99f), 0.0010f);
    }

    @Test
    public void calcularSalarioNeto4() {
        assertEquals(1050, EmpleadoBR.calculaSalarioNeto(1250), 0.0010f);
    }

    @Test
    public void calcularSalarioNeto5() {
        assertEquals(840, EmpleadoBR.calculaSalarioNeto(1000), 0.0010f);
    }





}
