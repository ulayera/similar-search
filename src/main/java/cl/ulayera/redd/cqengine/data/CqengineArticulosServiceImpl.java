package cl.ulayera.redd.cqengine.data;

import cl.ulayera.redd.cqengine.model.CqengineArticulo;
import cl.ulayera.redd.cqengine.util.CqengineArticuloUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ulayera on 30-05-2017.
 */
public class CqengineArticulosServiceImpl implements CqengineArticulosService {
    private final String TEST_DATA = "src/main/resources/redd-test-data.json";

    public Map<String, CqengineArticulo> consultaArticulos() throws IOException {
        return CqengineArticuloUtil.convert(new ObjectMapper().readValue(new File(TEST_DATA), HashMap.class));
    }
}
