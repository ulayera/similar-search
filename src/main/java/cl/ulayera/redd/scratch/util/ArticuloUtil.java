package cl.ulayera.redd.scratch.util;


import cl.ulayera.redd.scratch.model.Articulo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ulayera on 30-05-2017.
 */
public class ArticuloUtil {
    public static List< Articulo> convert(Map map) {
        List<Articulo> articuloList = new ArrayList<>();
        for (Object o1 : (map).entrySet()) {
            Map.Entry articuloEntry = (Map.Entry) o1;
            Articulo Articulo = new Articulo();
            Articulo.setNombre((String) articuloEntry.getKey());
            Map attEntry = (Map) articuloEntry.getValue();
            articuloList.add(new Articulo((String) articuloEntry.getKey(),
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
        return articuloList;
    }
}