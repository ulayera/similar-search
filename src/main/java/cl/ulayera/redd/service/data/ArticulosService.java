package cl.ulayera.redd.service.data;

import cl.ulayera.redd.service.model.Articulo;

import java.io.IOException;
import java.util.Map;

/**
 * Created by ulayera on 30-05-2017.
 */
public interface ArticulosService {
    Map<String, Articulo> consultaArticulos() throws IOException;
}
