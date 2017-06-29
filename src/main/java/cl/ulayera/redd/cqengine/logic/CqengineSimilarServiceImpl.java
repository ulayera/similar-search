package cl.ulayera.redd.cqengine.logic;

import cl.ulayera.redd.cqengine.data.CqengineArticulosService;
import cl.ulayera.redd.cqengine.data.CqengineArticulosServiceImpl;
import cl.ulayera.redd.cqengine.model.CqengineArticulo;
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
public class CqengineSimilarServiceImpl implements CqengineSimilarService {
    private final CqengineArticulosService cqengineArticulosService = new CqengineArticulosServiceImpl();

    public List<CqengineArticulo> obtenerSimilares(CqengineArticulo original) {
        Map<String, CqengineArticulo> articulos = new HashMap<String, CqengineArticulo>();
        try {
            articulos = cqengineArticulosService.consultaArticulos();
        } catch (IOException e) {
            System.err.println("No se encontro el archivo de datos.");
            e.printStackTrace();
        }
        SQLParser<CqengineArticulo> parser = SQLParser.forPojoWithAttributes(CqengineArticulo.class, createAttributes(CqengineArticulo.class));
        IndexedCollection<CqengineArticulo> cqengineArticuloIndexedCollection = new ConcurrentIndexedCollection<CqengineArticulo>();
        cqengineArticuloIndexedCollection.addIndex(HashIndex.onAttribute(CqengineArticulo.NOMBRE));
        cqengineArticuloIndexedCollection.addIndex(HashIndex.onAttribute(CqengineArticulo.ATT_A));
        cqengineArticuloIndexedCollection.addIndex(HashIndex.onAttribute(CqengineArticulo.ATT_B));
        cqengineArticuloIndexedCollection.addIndex(HashIndex.onAttribute(CqengineArticulo.ATT_C));
        cqengineArticuloIndexedCollection.addIndex(HashIndex.onAttribute(CqengineArticulo.ATT_D));
        cqengineArticuloIndexedCollection.addIndex(HashIndex.onAttribute(CqengineArticulo.ATT_E));
        cqengineArticuloIndexedCollection.addIndex(HashIndex.onAttribute(CqengineArticulo.ATT_F));
        cqengineArticuloIndexedCollection.addIndex(HashIndex.onAttribute(CqengineArticulo.ATT_G));
        cqengineArticuloIndexedCollection.addIndex(HashIndex.onAttribute(CqengineArticulo.ATT_H));
        cqengineArticuloIndexedCollection.addIndex(HashIndex.onAttribute(CqengineArticulo.ATT_I));
        cqengineArticuloIndexedCollection.addIndex(HashIndex.onAttribute(CqengineArticulo.ATT_J));
        cqengineArticuloIndexedCollection.addIndex(HashIndex.onAttribute(CqengineArticulo.SCORE));
        cqengineArticuloIndexedCollection.addAll(articulos.values());

        ResultSet<CqengineArticulo> results = parser.retrieve(cqengineArticuloIndexedCollection, "SELECT * FROM cqengineArticuloIndexedCollection WHERE " +
                "nombre = '" + original.nombre + "' " +
                "ORDER BY nombre ASC");
        for (CqengineArticulo cqengineArticulo : results) {
            articulos.get(cqengineArticulo.nombre).puntaje++;
        }

        results = parser.retrieve(cqengineArticuloIndexedCollection, "SELECT * FROM cqengineArticuloIndexedCollection WHERE " +
                "attA = '" + original.attA + "' " +
                "ORDER BY nombre ASC");
        for (CqengineArticulo cqengineArticulo : results) {
            articulos.get(cqengineArticulo.nombre).puntaje++;
        }

        results = parser.retrieve(cqengineArticuloIndexedCollection, "SELECT * FROM cqengineArticuloIndexedCollection WHERE " +
                "attB = '" + original.attB + "' " +
                "ORDER BY nombre ASC");
        for (CqengineArticulo cqengineArticulo : results) {
            articulos.get(cqengineArticulo.nombre).puntaje++;
        }

        results = parser.retrieve(cqengineArticuloIndexedCollection, "SELECT * FROM cqengineArticuloIndexedCollection WHERE " +
                "attC = '" + original.attC + "' " +
                "ORDER BY nombre ASC");
        for (CqengineArticulo cqengineArticulo : results) {
            articulos.get(cqengineArticulo.nombre).puntaje++;
        }

        results = parser.retrieve(cqengineArticuloIndexedCollection, "SELECT * FROM cqengineArticuloIndexedCollection WHERE " +
                "attD = '" + original.attD + "' " +
                "ORDER BY nombre ASC");
        for (CqengineArticulo cqengineArticulo : results) {
            articulos.get(cqengineArticulo.nombre).puntaje++;
        }

        results = parser.retrieve(cqengineArticuloIndexedCollection, "SELECT * FROM cqengineArticuloIndexedCollection WHERE " +
                "attE = '" + original.attE + "' " +
                "ORDER BY nombre ASC");
        for (CqengineArticulo cqengineArticulo : results) {
            articulos.get(cqengineArticulo.nombre).puntaje++;
        }

        results = parser.retrieve(cqengineArticuloIndexedCollection, "SELECT * FROM cqengineArticuloIndexedCollection WHERE " +
                "attF = '" + original.attF + "' " +
                "ORDER BY nombre ASC");
        for (CqengineArticulo cqengineArticulo : results) {
            articulos.get(cqengineArticulo.nombre).puntaje++;
        }

        results = parser.retrieve(cqengineArticuloIndexedCollection, "SELECT * FROM cqengineArticuloIndexedCollection WHERE " +
                "attG = '" + original.attG + "' " +
                "ORDER BY nombre ASC");
        for (CqengineArticulo cqengineArticulo : results) {
            articulos.get(cqengineArticulo.nombre).puntaje++;
        }

        results = parser.retrieve(cqengineArticuloIndexedCollection, "SELECT * FROM cqengineArticuloIndexedCollection WHERE " +
                "attH = '" + original.attH + "' " +
                "ORDER BY nombre ASC");
        for (CqengineArticulo cqengineArticulo : results) {
            articulos.get(cqengineArticulo.nombre).puntaje++;
        }

        results = parser.retrieve(cqengineArticuloIndexedCollection, "SELECT * FROM cqengineArticuloIndexedCollection WHERE " +
                "attI = '" + original.attI + "' " +
                "ORDER BY nombre ASC");
        for (CqengineArticulo cqengineArticulo : results) {
            articulos.get(cqengineArticulo.nombre).puntaje++;
        }

        results = parser.retrieve(cqengineArticuloIndexedCollection, "SELECT * FROM cqengineArticuloIndexedCollection WHERE " +
                "attJ = '" + original.attJ + "' " +
                "ORDER BY nombre ASC");
        for (CqengineArticulo cqengineArticulo : results) {
            articulos.get(cqengineArticulo.nombre).puntaje++;
        }
        cqengineArticuloIndexedCollection.clear();
        cqengineArticuloIndexedCollection.addAll(articulos.values());
        results = parser.retrieve(cqengineArticuloIndexedCollection, "SELECT * FROM cqengineArticuloIndexedCollection  " +
                "ORDER BY puntaje DESC, nombre DESC");
        int i = 0;
        List<CqengineArticulo> articulosSimilares = new ArrayList<CqengineArticulo>();
        for (CqengineArticulo cqengineArticulo : results) {
            articulosSimilares.add(cqengineArticulo);
            i++;
            if (i >= 10)
                break;
        }
        return articulosSimilares;
    }
}
