package cl.ulayera.redd.scratch.data;

import cl.ulayera.redd.scratch.model.Articulo;
import cl.ulayera.redd.scratch.util.ArticuloUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ulayera on 30-05-2017.
 */
public class ArticulosServiceImpl implements ArticulosService {
    private final String TEST_DATA = "src/main/resources/redd-test-data.json";

    public List<Articulo> consultaArticulos() throws IOException {
        Map map = new ObjectMapper().readValue(new File(TEST_DATA), HashMap.class);
        return ArticuloUtil.convert(map);
    }
}
