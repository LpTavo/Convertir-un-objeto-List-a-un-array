import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de números
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        Integer[] array = list.toArray(new Integer[0]);
        
    
        System.out.println("Array después de la conversión:");
        System.out.println(Arrays.toString(array));
    }
}
