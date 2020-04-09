import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.Test;

public class PrendaTest {

    Prenda remeraAlgodon;

    @Test
    public void creaPrendaCorrectamente()throws Exception{
        remeraAlgodon = new Prenda(new TipoPrendaFactory().remera(),Tela.algodon,Color.blanco,Color.celeste);
        Assert.assertEquals(remeraAlgodon.categoria(), Categoria.superior);
    }

    @Test(expected = CreadorPrendaException.class)
    public void noCreaPrendasConNull() throws Exception {
        Prenda pantalonNegro = new Prenda(null, null, null);
    }

    @Test(expected = CreadorPrendaException.class)
    public void noCreaPrendasConNullColor() throws Exception {
        Prenda pantalonNegro = new Prenda(new TipoPrendaFactory().pantalon(), Tela.algodon, Color.celeste,null);
    }
}
