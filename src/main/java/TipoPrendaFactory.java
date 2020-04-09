public class TipoPrendaFactory {

    public TipoPrenda remera(){
        return new TipoPrenda(Categoria.superior);
    }

    public TipoPrenda campera(){
        return new TipoPrenda(Categoria.superior);
    }

    public TipoPrenda buzo(){
        return new TipoPrenda(Categoria.superior);
    }

    public TipoPrenda camisa(){
        return new TipoPrenda(Categoria.superior);
    }

    public TipoPrenda pantalon(){
        return new TipoPrenda(Categoria.inferior);
    }

    public TipoPrenda bermuda(){
        return new TipoPrenda(Categoria.inferior);
    }

    public TipoPrenda anteojo(){
        return new TipoPrenda(Categoria.accesorio);
    }

    public TipoPrenda gorra(){
        return new TipoPrenda(Categoria.accesorio);
    }

    public TipoPrenda gorro(){
        return new TipoPrenda(Categoria.accesorio);
    }

    public TipoPrenda zapatos(){
        return new TipoPrenda(Categoria.calzado);
    }

    public TipoPrenda zapatillas(){
        return new TipoPrenda(Categoria.calzado);
    }
}
