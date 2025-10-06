package collectionsFramework.List;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1,"A2");

        System.out.println("Original contents of ll: "+ll);

        // remove
        ll.remove("F");
        ll.remove(2);

        System.out.println("Contents after removal: "+ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println("Contents after removal of First and last data: "+ll);

        String val = ll.get(2); // get()
        ll.set(2, val+ " Changed "); // set()

        System.out.println("ll after change: "+ll);

    }
}
