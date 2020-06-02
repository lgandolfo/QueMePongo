package Guardarropa;

import Prenda.*;

public class AgregarPrenda implements Propuesta {

    private Prenda prenda;

    public AgregarPrenda(Prenda prenda){
        this.prenda = prenda;
    }

    @Override
    public void aplicar(Guardarropa guardarropa){
        guardarropa.agregarPrenda(this.prenda);
    };

    @Override
    public void deshacer(Guardarropa guardarropa){
        guardarropa.quitarPrenda(this.prenda);
    };
}
