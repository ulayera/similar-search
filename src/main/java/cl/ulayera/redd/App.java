package cl.ulayera.redd;

import cl.ulayera.redd.service.logic.SimilarService;
import cl.ulayera.redd.service.logic.SimilarServiceImpl;
import cl.ulayera.redd.service.model.Articulo;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class App {
    private static final SimilarService similarService = new SimilarServiceImpl();

    public static void main(String[] args) {
        Articulo original = new Articulo("sku-1", "att-a-7", "att-b-3", "att-c-10", "att-d-10", "att-e-15", "att-f-11", "att-g-2", "att-h-7", "att-i-5", "att-j-14");
        Long a = System.nanoTime();
        List<Articulo> articulosSimilares = similarService.obtenerSimilares(original);
        for (Articulo articulo : articulosSimilares)
            System.out.println(articulo);
        System.out.println("Tiempo total: " + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - a) + " milisegundos.");
    }
}
