import java.util.HashSet;
import java.util.Iterator;
public class MiHashSet {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("============CLASE HASH SET============\n");
        System.out.println("Creando un HashSet");
        HashSet<Integer> miHashSet = new HashSet<Integer>();
        // Adicionamos elementos
        System.out.println(miHashSet);
        System.out.println("Adicionando elementos al HashSet");
        miHashSet.add(5);
        miHashSet.add(3);
        miHashSet.add(67);
        miHashSet.add(1);
        miHashSet.add(58);
        miHashSet.add(97);
        miHashSet.remove(67);
        System.out.println(miHashSet+"\n");

        System.out.println("Verifica si esta vacio el Hash Set: "+miHashSet.isEmpty()); // verifica si esta vacio el Hash Set false
        System.out.println("\nSe elemina el elemento '67' del Hash Set: ");
        miHashSet.remove(67);// se elimina elemento del hashset
        System.out.println(miHashSet); 
        System.out.println("\nEl nro de elementos del Hash Set es: "+miHashSet.size());//el nro de elementos del Hash Set 5
        System.out.println("\nEstado actual del Hash Set: ");
        System.out.println(miHashSet);//estado actual del Hash Set
                                      // [1, 3, 5, 97, 58]
        System.out.println();
        System.out.println("Verifica si existe el elemento '58' en el hash set: "+miHashSet.contains(58)); // true si existe el elemento
        
        // Recorrido del Hash Set
        // 1 3 5 97 58
        System.out.println("\nRecorrido del Hash Set");
        Iterator<Integer> it = miHashSet.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");

        }
    }
}