package Clima;

import Usuario.*;

import java.util.List;

public class ObserverRecalcular implements ObserverClima {

    @Override
    public void generarAlerta(List<String> alertas){
        RepositorioUsuarios.getInstance().ejecutarSugerencias();
    }
}
