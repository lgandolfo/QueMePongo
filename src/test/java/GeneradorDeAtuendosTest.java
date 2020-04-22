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
    BuilderPrenda builder;
    TipoPrendaFactory tipoPrendaFactory;
    GeneradorDeAtuendos generadorDeAtuendos;

    @Before
    public void init() throws Exception{

        generadorDeAtuendos = new GeneradorDeAtuendos();

        builder = new BuilderPrenda();

        tipoPrendaFactory = new TipoPrendaFactory();

        remera = tipoPrendaFactory.remera();
        pantalon = tipoPrendaFactory.pantalon();
        lentes = tipoPrendaFactory.anteojo();
        zapatillas = tipoPrendaFactory.zapatillas();

        //remeraNegra
        builder.setTipoPrenda(remera);
        builder.setTela(Tela.algodon);
        builder.setColorPrimario(Color.negro);
        remeraNegra = builder.crearPrenda();

        //remeraBlanca
        builder.setTipoPrenda(remera);
        builder.setTela(Tela.algodon);
        builder.setColorPrimario(Color.blanco);
        remeraBlanca = builder.crearPrenda();

        //pantalon
        builder.setTipoPrenda(pantalon);
        builder.setTela(Tela.gabardina);
        builder.setColorPrimario(Color.negro);
        pantalonNegro = builder.crearPrenda();

        //lentes
        builder.setTipoPrenda(lentes);
        builder.setTela(Tela.plastico);
        builder.setColorPrimario(Color.negro);
        lentesDeSolNegros = builder.crearPrenda();

        //zapatillas
        builder.setTipoPrenda(zapatillas);
        builder.setTela(Tela.lona);
        builder.setColorPrimario(Color.blanco);
        zapatillasBlancas = builder.crearPrenda();

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
