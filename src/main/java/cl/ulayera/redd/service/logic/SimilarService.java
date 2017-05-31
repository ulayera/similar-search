package cl.ulayera.redd.service.logic;

import cl.ulayera.redd.service.model.Articulo;

import java.util.List;

/**
 * Created by ulayera on 30-05-2017.
 */
public interface SimilarService {
    List<Articulo> obtenerSimilares(Articulo original);
}
