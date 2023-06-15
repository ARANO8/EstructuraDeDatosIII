import java.util.Iterator;
import java.util.TreeSet;

public class MiTreeSet {
    public static void main(String[] args) {
        System.out.println("============CLASE TREE SET============\n");
        System.out.println("Creando un TreeSet");
        TreeSet<Integer> miTreeSet = new TreeSet<Integer>();
        System.out.println(miTreeSet);
        // Adicionamos elementos
        System.out.println("Adicionando elementos al TreeSet");
        miTreeSet.add(5);
        miTreeSet.add(3);
        miTreeSet.add(37);
        miTreeSet.add(7);
        miTreeSet.add(1);
        miTreeSet.add(39);
        miTreeSet.add(2);
        miTreeSet.add(37);
        System.out.println(miTreeSet); // estado actual del Hash Set 
        System.out.println("\nEl nro de elementos del TreeSet es: "+miTreeSet.size());
        System.out.println();
        System.out.println("devuelve los elementos de la cabecera del TreeSet:\n"+miTreeSet.headSet(37)); 
        System.out.println("devuelve los elementos del final del TreeSet:\n"+miTreeSet.tailSet (37));
        
        System.out.println();
        System.out.println("devuelve conjunto de 3 hasta 37 no incluido:\n"+miTreeSet.subSet(3, 37));
        // Recorrido del TreeSet
        Iterator<Integer> it = miTreeSet.iterator(); // interface Iterator permite iterar sobre
        //un conjunto de elementos
        // 1 2 3 5 7 37 39
        System.out.println("\nRecorrido del TreeSet");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}