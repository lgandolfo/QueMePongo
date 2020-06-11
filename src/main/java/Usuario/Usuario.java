package Usuario;


import Atuendo.Atuendo;
import Guardarropa.Guardarropa;
import Prenda.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Usuario {


    private Borrador borrador;
    private List<Guardarropa> guardarropas = new ArrayList<>();
    private List<Atuendo> sugerenciasDelDia;

    public Usuario(){
        RepositorioUsuarios.getInstance().setUsuariosActivos(this);
    }



    public void obtenerSugerencias(){
         sugerenciasDelDia = guardarropas.stream().map(Guardarropa::obtenerUnAtuendo).collect(Collectors.toList());
    } // Devuelve una sola sugerencia por guardarropa

    public void setGuardarropas(Guardarropa guardarropa){
        guardarropas.add(guardarropa);
    }

    public List<Atuendo> setSugerenciasDelDia(){
        return sugerenciasDelDia;
    }


}
