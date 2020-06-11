package Usuario;

import Usuario.*;

import java.util.List;

public class ObserverRecalcular implements Observer {

    @Override
    public void generarAlerta(List<String> alertas){
        RepositorioUsuarios.getInstance().ejecutarSugerencias();
    }
}
