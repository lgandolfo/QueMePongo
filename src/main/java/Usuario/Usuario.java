package Usuario;


import Guardarropa.Guardarropa;
import Prenda.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Usuario {

    private Set<Prenda> prendas = new HashSet<>();
    private Borrador borrador;
    private List<Guardarropa> guardarropas = new ArrayList<>();

    public void addPrendas(Prenda prenda){
        prendas.add(prenda);
    }

    public Set<Prenda> getPrendas() {
        return prendas;
    }

    public void guardarPrenda()throws CreadorPrendaException {
        this.addPrendas(borrador.crearPrenda());
    }

}
