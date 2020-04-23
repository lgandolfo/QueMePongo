import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GeneradorDeAtuendosTest {

    Usuario felipe = new Usuario();
    Prenda remeraNegra;
    Prenda pantalonNegro;
    Prenda zapatillasBlancas;
    Prenda lentesDeSolNegros;
    Prenda remeraBlanca;
    TipoPrenda remera;
    TipoPrenda pantalon;
    TipoPrenda lentes;
    TipoPrenda zapatillas;
    Borrador builder;
    TipoPrendaFactory tipoPrendaFactory;
    GeneradorDeAtuendos generadorDeAtuendos;

    @Before
    public void init() throws Exception{

        generadorDeAtuendos = new GeneradorDeAtuendos();

        builder = new Borrador();

        tipoPrendaFactory = new TipoPrendaFactory();

        remera = tipoPrendaFactory.remera();
        pantalon = tipoPrendaFactory.pantalon();
        lentes = tipoPrendaFactory.anteojo();
        zapatillas = tipoPrendaFactory.zapatillas();

        //remeraNegra
        remeraNegra = new Borrador().setTipoPrenda(remera).
                setTela(Tela.algodon).
                setColorPrimario(Color.negro).
                crearPrenda();

        //remeraBlanca
        remeraBlanca = new Borrador().
                setTipoPrenda(remera).
                setTela(Tela.algodon).
                setColorPrimario(Color.blanco).
                crearPrenda();

        //pantalon
        pantalonNegro = new Borrador().
            setTipoPrenda(pantalon).
            setTela(Tela.gabardina).
            setColorPrimario(Color.negro).
            crearPrenda();

        //lentes
        lentesDeSolNegros = new Borrador().
                setTipoPrenda(lentes).
                setTela(Tela.plastico).
                setColorPrimario(Color.negro).
                crearPrenda();

        //zapatillas
        zapatillasBlancas = new Borrador().
                setTipoPrenda(zapatillas).
                setTela(Tela.lona).
                setColorPrimario(Color.blanco).
                crearPrenda();

        felipe.addPrendas(remeraBlanca);
        felipe.addPrendas(remeraNegra);
        felipe.addPrendas(pantalonNegro);
        felipe.addPrendas(lentesDeSolNegros);
        felipe.addPrendas(zapatillasBlancas);
    }

    @Test
    public void daBien(){
        Assert.assertEquals(4,generadorDeAtuendos.generarAtuendosValidos(felipe.getPrendas()).size());
    }
}
