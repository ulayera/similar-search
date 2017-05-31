package cl.ulayera.redd.service.data;

import cl.ulayera.redd.service.model.Articulo;
import cl.ulayera.redd.service.util.ArticuloUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ulayera on 30-05-2017.
 */
public class ArticulosServiceImpl implements ArticulosService {
    private final String TEST_DATA = "src/main/resources/redd-test-data.json";

    public Map<String, Articulo> consultaArticulos() throws IOException {
        return ArticuloUtil.convert(new ObjectMapper().readValue(new File(TEST_DATA), HashMap.class));
    }
}
