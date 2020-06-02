package Guardarropa;

import Prenda.*;

public class QuitarPrenda implements Propuesta{

    private Prenda prenda;

    public QuitarPrenda(Prenda prenda){
        this.prenda = prenda;
    }

    @Override
    public void aplicar(Guardarropa guardarropa){
        guardarropa.quitarPrenda(this.prenda);
    };

    @Override
    public void deshacer(Guardarropa guardarropa){
        guardarropa.agregarPrenda(this.prenda);
    };

}
