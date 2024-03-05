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

    @Test
    public void calcularSalarioNeto6() {
        assertEquals(999.99f, EmpleadoBR.calculaSalarioNeto(999.99f), 0.0010f);
    }

    @Test
    public void calcularSalarioNeto7() {
        assertEquals(0, EmpleadoBR.calculaSalarioNeto(0), 0.0010f);
    }

    @Test
    public void calcularSalarioNeto8() {
        assertEquals(-1, EmpleadoBR.calculaSalarioNeto(-1), 0.0010f);
    }

    @Test
    public void calcularSalarioBruto1() {
        assertEquals(1360, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor,2000, 8), 0.0010f);
    }

    @Test
    public void calcularSalarioBruto2() {
        assertEquals(1260, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor,1500, 3), 0.0010f);
    }

    // Tercer Commit
    @Test
    public void calcularSalarioBruto3() {
        assertEquals(1100, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor,1499.99f, 0), 0.0010f);
    }

    @Test
    public void calcularSalarioBruto4() {
        assertEquals(1760, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat,1250, 8), 0.0010f);
    }

    @Test
    public void calcularSalarioBruto5() {
        assertEquals(1600, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat,1000, 0), 0.0010f);
    }

    @Test
    public void calcularSalarioBruto6() {
        assertEquals(1560, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat,999.99f, 3), 0.0010f);
    }

    @Test
    public void calcularSalarioBruto7() {
        assertEquals(1500, EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat,500, 0), 0.0010f);
    }
    













}
