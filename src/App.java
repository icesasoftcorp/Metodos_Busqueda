import java.time.Duration;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDateTime startTime = LocalDateTime.now();
        LocalDateTime endTime = LocalDateTime.now();
        int[] array = { 1, 2, 3, 4, 5, 25 };
        int target = 3;

        System.out.println("===== Fin Búsqueda Linear =====");
        startTime = LocalDateTime.now();
        int linearSearchResult = Search.linearSearch(array, target);
        endTime = LocalDateTime.now();
        System.out.println("Inicio Búsqueda Linear: " + startTime);
        System.out.println("Búsqueda Linear: " + linearSearchResult);
        System.out.println("Fin Búsqueda Linear: " + endTime);
        System.out.println("Tiempo Transcurrido Búsqueda Linear: " + Duration.between(startTime, endTime));

        System.out.println("\n===== Fin Búsqueda Binaria =====");
        startTime = LocalDateTime.now();
        int binarySearchResult = Search.binarySearch(array, target);
        endTime = LocalDateTime.now();
        System.out.println("Inicio Búsqueda Binaria: " + startTime);
        System.out.println("Búsqueda Binaria: " + binarySearchResult);
        System.out.println("Fin Búsqueda Binaria: " + endTime);
        System.out.println("Tiempo Transcurrido Búsqueda Binaria: " + Duration.between(startTime, endTime));
    }
}
