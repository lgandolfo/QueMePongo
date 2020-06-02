import Guardarropa.*;
import Prenda.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GuardarropaTest {

    Guardarropa guardarropa;
    Prenda remeraAlgodon;

    @Before
    public void init() throws Exception{
        guardarropa = new Guardarropa();

        Borrador builder = new Borrador();
        TipoPrenda remera = new TipoPrendaFactory().remera();

        builder.setTipoPrenda(remera);
        builder.setTela(Tela.algodon);
        builder.setColorPrimario(Color.celeste);
        builder.setTrama(Trama.lisa);
        remeraAlgodon = builder.crearPrenda();
    }

    @Test
    public void agregarConPropuesta(){
        guardarropa.propuestaAgregar(remeraAlgodon);
        Propuesta propuesta = guardarropa.getPropuestas().get(0);
        guardarropa.aplicarPropuesta(propuesta);
        Assert.assertEquals(remeraAlgodon,guardarropa.getPrendas().get(0));
    }

    @Test
    public void quitarConPropuesta(){
        guardarropa.agregarPrenda(remeraAlgodon);
        guardarropa.propuestaQuitar(remeraAlgodon);
        Propuesta quitar = guardarropa.getPropuestas().get(0);
        guardarropa.aplicarPropuesta(quitar);
        Assert.assertEquals(0,guardarropa.getPrendas().size());
    }

    @Test
    public void deshacerAgregar(){
        guardarropa.propuestaAgregar(remeraAlgodon);
        Propuesta propuesta = guardarropa.getPropuestas().get(0);
        guardarropa.aplicarPropuesta(propuesta);
        guardarropa.deshacerPropuesta(propuesta);
        Assert.assertEquals(0,guardarropa.getPrendas().size());
    }

    @Test
    public void deshacerQuitar(){
        guardarropa.agregarPrenda(remeraAlgodon);
        guardarropa.propuestaQuitar(remeraAlgodon);
        Propuesta quitar = guardarropa.getPropuestas().get(0);
        guardarropa.aplicarPropuesta(quitar);
        guardarropa.deshacerPropuesta(quitar);
        Assert.assertEquals(remeraAlgodon,guardarropa.getPrendas().get(0));
    }
}
