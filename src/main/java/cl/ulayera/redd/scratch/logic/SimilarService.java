package cl.ulayera.redd.scratch.logic;

import cl.ulayera.redd.scratch.model.Articulo;

import java.util.List;

/**
 * Created by ulayera on 29-06-2017.
 */
public interface SimilarService {
    List<Articulo> obtenerSimilares(Articulo original);
}
