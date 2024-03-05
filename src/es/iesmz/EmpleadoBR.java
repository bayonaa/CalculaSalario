package es.iesmz;

public class EmpleadoBR {
    private static float salario;

    public EmpleadoBR() {

    }

    public static float calculaSalarioBruto(TipoEmpleado tipus, float ventasMes, float horasExtra) {
        if (tipus == null) {
            return salario = -1;
        } else {
            if (tipus == TipoEmpleado.venedor){
                return salario = 1000;
            } else if (tipus == TipoEmpleado.encarregat) {
                return salario = 1500;
            }

            if (ventasMes >= 1000) {
                return salario += 100;
            } else if (ventasMes >= 1500) {
                return salario+= 200;
            }

            if (horasExtra != 0){
                return salario += horasExtra * 20;
            }
        }
        return salario;
    }

    public static float calculaSalarioNeto(float salarioBruto) {
        float ret = 0;
        if (salarioBruto < 0) {
            salarioBruto = -1;
            return salarioBruto;
        } else {
            if (salarioBruto < 1000) {
                return salarioBruto;
            } else if (salarioBruto >= 1000 && salarioBruto < 1500){
                ret = 16;
                return salarioBruto * (1 - (ret/100));
            } else if (salarioBruto >= 1500) {
                ret = 18;
                return salarioBruto * (1 - (ret/100));
            }
        }
        return salarioBruto;
    }


}
