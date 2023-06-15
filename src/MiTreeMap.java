import java.util.TreeMap;

public class MiTreeMap {
    public static void main(String[] args) {
        System.out.println("============CLASE TREE MAP============\n");
        System.out.println("Creando un TreeMap");
        TreeMap<Integer, Integer> miTreeMap = new TreeMap<Integer, Integer>();
        System.out.println(miTreeMap);
        // Adicion de elementos al arbol
        System.out.println("Adicionando elementos al TreeMap");
        miTreeMap.put(34, 6);
        miTreeMap.put(2, 7);
        miTreeMap.put(5, 88);
        miTreeMap.put(1, 11);
        miTreeMap.put(5, 99);
        System.out.println(miTreeMap); // estado actual del HashMap {1-11, 2-7, 5-99, 34-6)
        System.out.println("\nNro de pares(clave/valor):"+miTreeMap.size()); 
        
        System.out.println("Obtiene el valor de la clave '5':"+miTreeMap.get(5));
        System.out.println("Conjunto de claves:"+miTreeMap.keySet());
        System.out.println("Conjunto de valores:"+miTreeMap.values());
                                              
        System.out.println();
        System.out.println("devuelve una lista de claves en forma descendiente:"+miTreeMap.descendingKeySet()); 
        System.out.println("devuelve un mapa en forma descendiente:"+miTreeMap.descendingMap()); 
                                                   
        System.out.println();
        System.out.println("devuelve mapa con la clave menor:"+miTreeMap.firstEntry());
        System.out.println("devuelve mapa con la clave mayor:"+miTreeMap.lastEntry());
    }
}
