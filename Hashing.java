
import java.util.HashSet;
import java.util.Iterator;

class Hashing {

    public static void main(String args[]) {
// creating
        HashSet<Integer> set = new HashSet<>();
// inserting element
        set.add(1);
        set.add(2);
        set.add(3);
// search -contains
        if (set.contains(1)) {
            System.out.println("set contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("Six does not contains in set ");
        }
// delete
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("one is removed from set");
        }
        System.out.println("size of set is:" + set.size());
        System.out.println(set);
// Iterator 
Iterator it = set.iterator();
// hasNext, next
// System.out.println(it.next());
// System.out.println(it.hasNext());
// System.out.println(it.next());
// System.out.println(it.hasNext());
while(it.hasNext()){
  System.out.println(it.next());
}

    }
}
