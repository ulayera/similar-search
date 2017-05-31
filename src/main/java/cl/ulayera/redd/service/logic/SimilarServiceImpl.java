package cl.ulayera.redd.service.logic;

import cl.ulayera.redd.service.data.ArticulosService;
import cl.ulayera.redd.service.data.ArticulosServiceImpl;
import cl.ulayera.redd.service.model.Articulo;
import com.googlecode.cqengine.ConcurrentIndexedCollection;
import com.googlecode.cqengine.IndexedCollection;
import com.googlecode.cqengine.index.hash.HashIndex;
import com.googlecode.cqengine.query.parser.sql.SQLParser;
import com.googlecode.cqengine.resultset.ResultSet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.googlecode.cqengine.codegen.AttributeBytecodeGenerator.createAttributes;

/**
 * Created by ulayera on 30-05-2017.
 */
public class SimilarServiceImpl implements SimilarService {
    private final ArticulosService articulosService = new ArticulosServiceImpl();

    public List<Articulo> obtenerSimilares(Articulo original) {
        Map<String, Articulo> articulos = new HashMap<String, Articulo>();
        try {
            articulos = articulosService.consultaArticulos();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo de datos.");
            e.printStackTrace();
        }
        SQLParser<Articulo> parser = SQLParser.forPojoWithAttributes(Articulo.class, createAttributes(Articulo.class));
        IndexedCollection<Articulo> articuloIndexedCollection = new ConcurrentIndexedCollection<Articulo>();
        articuloIndexedCollection.addIndex(HashIndex.onAttribute(Articulo.NOMBRE));
        articuloIndexedCollection.addIndex(HashIndex.onAttribute(Articulo.ATT_A));
        articuloIndexedCollection.addIndex(HashIndex.onAttribute(Articulo.ATT_B));
        articuloIndexedCollection.addIndex(HashIndex.onAttribute(Articulo.ATT_C));
        articuloIndexedCollection.addIndex(HashIndex.onAttribute(Articulo.ATT_D));
        articuloIndexedCollection.addIndex(HashIndex.onAttribute(Articulo.ATT_E));
        articuloIndexedCollection.addIndex(HashIndex.onAttribute(Articulo.ATT_F));
        articuloIndexedCollection.addIndex(HashIndex.onAttribute(Articulo.ATT_G));
        articuloIndexedCollection.addIndex(HashIndex.onAttribute(Articulo.ATT_H));
        articuloIndexedCollection.addIndex(HashIndex.onAttribute(Articulo.ATT_I));
        articuloIndexedCollection.addIndex(HashIndex.onAttribute(Articulo.ATT_J));
        articuloIndexedCollection.addIndex(HashIndex.onAttribute(Articulo.SCORE));
        articuloIndexedCollection.addAll(articulos.values());

        ResultSet<Articulo> results = parser.retrieve(articuloIndexedCollection, "SELECT * FROM articuloIndexedCollection WHERE " +
                "nombre = '" + original.nombre + "' " +
                "ORDER BY nombre ASC");
        for (Articulo articulo : results) {
            articulos.get(articulo.nombre).puntaje++;
        }

        results = parser.retrieve(articuloIndexedCollection, "SELECT * FROM articuloIndexedCollection WHERE " +
                "attA = '" + original.attA + "' " +
                "ORDER BY nombre ASC");
        for (Articulo articulo : results) {
            articulos.get(articulo.nombre).puntaje++;
        }

        results = parser.retrieve(articuloIndexedCollection, "SELECT * FROM articuloIndexedCollection WHERE " +
                "attB = '" + original.attB + "' " +
                "ORDER BY nombre ASC");
        for (Articulo articulo : results) {
            articulos.get(articulo.nombre).puntaje++;
        }

        results = parser.retrieve(articuloIndexedCollection, "SELECT * FROM articuloIndexedCollection WHERE " +
                "attC = '" + original.attC + "' " +
                "ORDER BY nombre ASC");
        for (Articulo articulo : results) {
            articulos.get(articulo.nombre).puntaje++;
        }

        results = parser.retrieve(articuloIndexedCollection, "SELECT * FROM articuloIndexedCollection WHERE " +
                "attD = '" + original.attD + "' " +
                "ORDER BY nombre ASC");
        for (Articulo articulo : results) {
            articulos.get(articulo.nombre).puntaje++;
        }

        results = parser.retrieve(articuloIndexedCollection, "SELECT * FROM articuloIndexedCollection WHERE " +
                "attE = '" + original.attE + "' " +
                "ORDER BY nombre ASC");
        for (Articulo articulo : results) {
            articulos.get(articulo.nombre).puntaje++;
        }

        results = parser.retrieve(articuloIndexedCollection, "SELECT * FROM articuloIndexedCollection WHERE " +
                "attF = '" + original.attF + "' " +
                "ORDER BY nombre ASC");
        for (Articulo articulo : results) {
            articulos.get(articulo.nombre).puntaje++;
        }

        results = parser.retrieve(articuloIndexedCollection, "SELECT * FROM articuloIndexedCollection WHERE " +
                "attG = '" + original.attG + "' " +
                "ORDER BY nombre ASC");
        for (Articulo articulo : results) {
            articulos.get(articulo.nombre).puntaje++;
        }

        results = parser.retrieve(articuloIndexedCollection, "SELECT * FROM articuloIndexedCollection WHERE " +
                "attH = '" + original.attH + "' " +
                "ORDER BY nombre ASC");
        for (Articulo articulo : results) {
            articulos.get(articulo.nombre).puntaje++;
        }

        results = parser.retrieve(articuloIndexedCollection, "SELECT * FROM articuloIndexedCollection WHERE " +
                "attI = '" + original.attI + "' " +
                "ORDER BY nombre ASC");
        for (Articulo articulo : results) {
            articulos.get(articulo.nombre).puntaje++;
        }

        results = parser.retrieve(articuloIndexedCollection, "SELECT * FROM articuloIndexedCollection WHERE " +
                "attJ = '" + original.attJ + "' " +
                "ORDER BY nombre ASC");
        for (Articulo articulo : results) {
            articulos.get(articulo.nombre).puntaje++;
        }
        articuloIndexedCollection.clear();
        articuloIndexedCollection.addAll(articulos.values());
        results = parser.retrieve(articuloIndexedCollection, "SELECT * FROM articuloIndexedCollection  " +
                "ORDER BY puntaje DESC, nombre DESC");
        int i = 0;
        List<Articulo> articulosSimilares = new ArrayList<Articulo>();
        for (Articulo articulo : results) {
            articulosSimilares.add(articulo);
            i++;
            if (i >= 10)
                break;
        }
        return articulosSimilares;
    }
}
