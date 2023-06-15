import java.util.HashMap;

public class MiHashMap {
    public static void main(String[] args) {
        System.out.println("============CLASE HASH MAP============\n");
        System.out.println("Creando un HashMap");
        HashMap<Integer, String> miHashMap = new HashMap<Integer, String>();
        System.out.println(miHashMap);
        // Adicion de elementos (Clave, Valor) al conjunto
        System.out.println("Adicionando elementos al HashMap");
        miHashMap.put(3, "inf-121");
        miHashMap.put(44, "lab-121");
        miHashMap.put(1, "mat-143");
        miHashMap.put(34, "fis-21");
        miHashMap.put(7, "inf-112");
        miHashMap.put(1, "info");

        System.out.println(miHashMap); 
        System.out.println("\nNro de elementos:"+miHashMap.size()+"\n"); //nro de elementos 5
        System.out.println("Eliminacion del elemento '7':");
        miHashMap.remove(7);// eliminacion de un elemento
        System.out.println(miHashMap);
        
        System.out.println();
        System.out.println("devuelve conjunto de claves:"+miHashMap.keySet()); 
        System.out.println("devuelve conjunto de valores:"+miHashMap.values()); 
        
        System.out.println();
        System.out.println("devuelve el valor de la clave '7':"+miHashMap.get(34));
        System.out.println("devuelve true si esta vacio el HashMap:"+miHashMap.isEmpty());
    }
}
