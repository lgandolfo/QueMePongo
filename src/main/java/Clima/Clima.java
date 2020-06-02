package Clima;

public enum Clima {
    //cada clima tiene un coeficiente para determinar si la sugerencia es apta
    MUCHO_FRIO(30, 35),
    FRIO(25, 30),
    TEMPLADO(20, 25),
    CALOR(15, 20),
    MUCHO_CALOR(10, 15);

    private double minimoCoeficiente;
    private double maximoCoeficiente;

    Clima(double minimoCoeficiente, double maximoCoeficiente) {
        this.minimoCoeficiente = minimoCoeficiente;
        this.maximoCoeficiente = maximoCoeficiente;
    }

    static Clima climaSegunTemperatura(double temperatura) {
        if (estaEntre(temperatura, -10, 5)) {
            return MUCHO_FRIO;
        } else if (estaEntre(temperatura, 5, 13)) {
            return FRIO;
        } else if (estaEntre(temperatura, 13, 18)) {
            return TEMPLADO;
        } else if (estaEntre(temperatura, 18, 25)) {
            return CALOR;
        } else if (estaEntre(temperatura, 25, 35)) {
            return MUCHO_CALOR;
        }
        return TEMPLADO;
    }

    public static boolean estaEntre(double temperatura, double minimo, double maximo) {
        return minimo <= temperatura && temperatura <= maximo;
    }

   public boolean esAcorde(double coeficiente){
        return estaEntre(coeficiente,minimoCoeficiente,maximoCoeficiente);
   }


}

