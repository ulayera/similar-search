package cl.ulayera.redd.service.util;

import cl.ulayera.redd.service.model.Articulo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ulayera on 30-05-2017.
 */
public class ArticuloUtil {
    public static Map<String, Articulo> convert(Map map) {
        Map<String, Articulo> articuloMap = new HashMap<String, Articulo>();
        for (Object o1 : (map).entrySet()) {
            Map.Entry articuloEntry = (Map.Entry) o1;
            Articulo articulo = new Articulo();
            articulo.nombre = (String) articuloEntry.getKey();
            Map attEntry = (Map) articuloEntry.getValue();
            articuloMap.put((String) articuloEntry.getKey(), new Articulo((String) articuloEntry.getKey(),
                    (String) attEntry.get("att-a"),
                    (String) attEntry.get("att-b"),
                    (String) attEntry.get("att-c"),
                    (String) attEntry.get("att-d"),
                    (String) attEntry.get("att-e"),
                    (String) attEntry.get("att-f"),
                    (String) attEntry.get("att-g"),
                    (String) attEntry.get("att-h"),
                    (String) attEntry.get("att-i"),
                    (String) attEntry.get("att-j")
            ));
        }
        return articuloMap;
    }
}