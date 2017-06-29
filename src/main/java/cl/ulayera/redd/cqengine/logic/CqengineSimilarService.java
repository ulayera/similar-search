package cl.ulayera.redd.cqengine.logic;

import cl.ulayera.redd.cqengine.model.CqengineArticulo;

import java.util.List;

/**
 * Created by ulayera on 30-05-2017.
 */
public interface CqengineSimilarService {
    List<CqengineArticulo> obtenerSimilares(CqengineArticulo original);
}
