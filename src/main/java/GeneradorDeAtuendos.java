import com.google.common.collect.Sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class GeneradorDeAtuendos {


        private static GeneradorDeAtuendos generadorDeAtuendos;
        private ArrayList<Categoria> categoriasObligatorias = new ArrayList<>(Arrays.asList(Categoria.superior,Categoria.inferior,Categoria.calzado));


        public static GeneradorDeAtuendos getSingletonInstance() {
            if (generadorDeAtuendos == null) {
                generadorDeAtuendos = new GeneradorDeAtuendos();
            }
            return generadorDeAtuendos;
        }


        public Set<Atuendo> generarAtuendosValidos(Set<Prenda> prendas){

        Set<Set<Prenda>> todasLasCombinaciones = Sets.powerSet(prendas);

        Set<Set<Prenda>> atuendosValidos = filtrarAtuendosValidos(todasLasCombinaciones);

        Set<Atuendo> atuendos = atuendosValidos.stream().map(atuendo -> new Atuendo(atuendo)).collect(Collectors.toSet());

        return atuendos;
        }

        private boolean esCombinacionValida(Set<Prenda> atuendo){
            return atuendo.stream().allMatch(prenda -> categoriasObligatorias.contains(prenda.categoria()));
        }

        private Set<Set<Prenda>> filtrarAtuendosValidos(Set<Set<Prenda>> todasLasCombinaciones){
            return todasLasCombinaciones.stream().filter(this::esCombinacionValida).collect(Collectors.toSet());
        }

}