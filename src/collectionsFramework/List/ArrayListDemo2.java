package collectionsFramework.List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        ArrayList<Character> ex1 = new ArrayList<Character>();

        ex1.add('N');
        ex1.add('A');
        ex1.add('v');
        ex1.add('A');
        ex1.add('K');
        ex1.add('I');

        System.out.println(ex1);

        ArrayList<Character> ex1_addAll = new ArrayList<Character>();

        ex1_addAll.addAll(ex1);
        System.out.println("This is copy");
        System.out.println(ex1_addAll) ;
        // remove
        System.out.println("After removing all the elements from the copy");
        ex1_addAll.removeAll(ex1);
        System.out.println(ex1_addAll);


        // sort
        System.out.println("before sorting");
        System.out.println("Elements in the ex1: "+ ex1);
        System.out.println("Elements after sorting: ");
        Collections.sort(ex1_addAll);
        System.out.println(ex1);
        System.out.println("Sort in reverse order");
        Collections.sort(ex1, Collections.reverseOrder());
        System.out.println(ex1);

        // Shuffle
        Collections.shuffle(ex1);
        System.out.println("Elements in the ex1 after shuffling: "+ex1);

    }
}
