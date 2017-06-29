package cl.ulayera.redd.scratch.logic;

import cl.ulayera.redd.scratch.data.ArticulosService;
import cl.ulayera.redd.scratch.data.ArticulosServiceImpl;
import cl.ulayera.redd.scratch.model.Articulo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by ulayera on 29-06-2017.
 */
public class SimilarServiceImpl implements SimilarService {
    private final ArticulosService ARTICULO_SERVICE = new ArticulosServiceImpl();

    @Override
    public List<Articulo> obtenerSimilares(Articulo original) {
        List<Articulo> articulos = new ArrayList<>();
        try {
            articulos = ARTICULO_SERVICE.consultaArticulos();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Predicate<Articulo> pA = s -> original.getAttA().equals(s.getAttA());
        Predicate<Articulo> pB = s -> original.getAttB().equals(s.getAttB());
        Predicate<Articulo> pC = s -> original.getAttC().equals(s.getAttC());
        Predicate<Articulo> pD = s -> original.getAttD().equals(s.getAttD());
        Predicate<Articulo> pE = s -> original.getAttE().equals(s.getAttE());
        Predicate<Articulo> pF = s -> original.getAttF().equals(s.getAttF());
        Predicate<Articulo> pG = s -> original.getAttG().equals(s.getAttG());
        Predicate<Articulo> pH = s -> original.getAttH().equals(s.getAttH());
        Predicate<Articulo> pI = s -> original.getAttI().equals(s.getAttI());
        Predicate<Articulo> pJ = s -> original.getAttJ().equals(s.getAttJ());
        articulos.stream().filter(pA).forEach(Articulo::incPuntaje);
        articulos.stream().filter(pB).forEach(Articulo::incPuntaje);
        articulos.stream().filter(pC).forEach(Articulo::incPuntaje);
        articulos.stream().filter(pD).forEach(Articulo::incPuntaje);
        articulos.stream().filter(pE).forEach(Articulo::incPuntaje);
        articulos.stream().filter(pF).forEach(Articulo::incPuntaje);
        articulos.stream().filter(pG).forEach(Articulo::incPuntaje);
        articulos.stream().filter(pH).forEach(Articulo::incPuntaje);
        articulos.stream().filter(pI).forEach(Articulo::incPuntaje);
        articulos.stream().filter(pJ).forEach(Articulo::incPuntaje);
        List<Articulo> resultado = articulos.stream().sorted((a1,a2) -> Long.compare(a1.getPuntaje(), a2.getPuntaje())).collect(Collectors.toList()).subList(0,10);
        return resultado;
    }
}
