package cl.ulayera.redd.cqengine.data;

import cl.ulayera.redd.cqengine.model.CqengineArticulo;

import java.io.IOException;
import java.util.Map;

/**
 * Created by ulayera on 30-05-2017.
 */
public interface CqengineArticulosService {
    Map<String, CqengineArticulo> consultaArticulos() throws IOException;
}
