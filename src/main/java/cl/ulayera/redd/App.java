package cl.ulayera.redd;

import cl.ulayera.redd.cqengine.logic.CqengineSimilarService;
import cl.ulayera.redd.cqengine.logic.CqengineSimilarServiceImpl;
import cl.ulayera.redd.cqengine.model.CqengineArticulo;
import cl.ulayera.redd.scratch.data.ArticulosServiceImpl;
import cl.ulayera.redd.scratch.logic.SimilarService;
import cl.ulayera.redd.scratch.logic.SimilarServiceImpl;
import cl.ulayera.redd.scratch.model.Articulo;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class App {
    private static final CqengineSimilarService CQENGINE_SIMILAR_SERVICE = new CqengineSimilarServiceImpl();
    private static final SimilarService SIMILAR_SERVICE = new SimilarServiceImpl();

    public static void main(String[] args) {
        /*
            Prueba con CqEngine
         */
        CqengineArticulo cqengineOriginal = new CqengineArticulo("sku-1", "att-a-7", "att-b-3", "att-c-10", "att-d-10", "att-e-15", "att-f-11", "att-g-2", "att-h-7", "att-i-5", "att-j-14");
        Long a = System.nanoTime();
        List<CqengineArticulo> articulosSimilares = CQENGINE_SIMILAR_SERVICE.obtenerSimilares(cqengineOriginal);
        for (CqengineArticulo cqengineArticulo : articulosSimilares)
            System.out.println(cqengineArticulo);
        System.out.println("Tiempo total: " + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - a) + " milisegundos.");

        /*
            Prueba con Java 8 Puro
         */
        Articulo original = new Articulo("sku-1", "att-a-7", "att-b-3", "att-c-10", "att-d-10", "att-e-15", "att-f-11", "att-g-2", "att-h-7", "att-i-5", "att-j-14");
        Long b = System.nanoTime();
        SIMILAR_SERVICE.obtenerSimilares(original).stream().forEach(System.out::println);
        System.out.println("Tiempo total: " + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - b) + " milisegundos.");
    }
}
