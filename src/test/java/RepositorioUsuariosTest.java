import Atuendo.GeneradorDeAtuendos;
import Guardarropa.Guardarropa;
import Prenda.Prenda;
import Usuario.Usuario;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import Prenda.*;
import Usuario.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RepositorioUsuariosTest {

    Usuario felipe = new Usuario();
    Guardarropa guardarropa;
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
    RepositorioUsuarios repositorioUsuarios;

    @Before
    public void init() throws Exception{

        generadorDeAtuendos = new GeneradorDeAtuendos();

        builder = new Borrador();

        tipoPrendaFactory = new TipoPrendaFactory();

        guardarropa = new Guardarropa();

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

        guardarropa.setPrenda(remeraBlanca);
        guardarropa.setPrenda(remeraNegra);
        guardarropa.setPrenda(pantalonNegro);
        guardarropa.setPrenda(lentesDeSolNegros);
        guardarropa.setPrenda(zapatillasBlancas);

        felipe.setGuardarropas(guardarropa);

        repositorioUsuarios = new RepositorioUsuarios();
        repositorioUsuarios.setUsuariosActivos(felipe);

    }

    @Test
    public void daBien(){
        repositorioUsuarios.ejecutarSugerencias();
        Assert.assertEquals(1,felipe.setSugerenciasDelDia().size());
    }
}
