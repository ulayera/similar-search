package cl.ulayera.redd.scratch.data;

import cl.ulayera.redd.scratch.model.Articulo;

import java.io.IOException;
import java.util.List;

/**
 * Created by ulayera on 30-05-2017.
 */
public interface ArticulosService {
    List< Articulo> consultaArticulos() throws IOException;
}
