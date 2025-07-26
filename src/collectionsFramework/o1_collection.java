package collectionsFramework;

import java.util.ArrayList;
import java.util.*;

public class o1_collection {
    public static void main(String[] args) {

        Collection<String> strings = new ArrayList<>();

        strings.add("one");
        strings.add("two");
        strings.add("three");

        System.out.println("strings = "+ strings+ "\n");

//        strings.remove("two");
//        System.out.println("strings = "+strings);

        if (strings.contains("one")){
            System.out.println("one is present");
        }
        if (!strings.contains("three")){
            System.out.println("three is not here \n");
        }

        // containsAll()

        Collection<String> first = new ArrayList<>();
        first.add("one");
        first.add("two");

        Collection<String> second = new ArrayList<>();
        second.add("one");
        second.add("four");

        System.out.println("Is first contained in strings? "+ strings.containsAll(first));
        System.out.println("Is second contained in strings? "+strings.containsAll(second)+"\n");
//        System.out.println("Is manual contained in strings? "+strings.containsAll("one");

        // addAll()
        System.out.println("strings before addAll()  = "+ strings);
        boolean hasChanged = strings.addAll(first);
        System.out.println("has strings changed: "+ hasChanged);
        System.out.println("strings after addAll() = "+ strings+ "\n");
        // note arrayList will take duplicates hence there is multiple copies of same items

        // removesAll()
        System.out.println("strings before removeAll() = "+strings);
        hasChanged = strings.removeAll(first);
        System.out.println("has strings changed: "+hasChanged);
        System.out.println("strings after removeAll() = "+strings+"\n");

        // retainALl()
        strings.add("four");
        Collection<String> retained = new ArrayList<>();
        retained.add("one");
        retained.add("four");

        System.out.println("strings before retainAll() = "+strings);
        hasChanged = strings.retainAll(retained);
        System.out.println("has strings changed: "+ hasChanged);
        System.out.println("strings after retainAll() = "+strings+"\n");


        if(!strings.isEmpty()) System.out.println("strings is not empty.");
        System.out.println("The number of elements in strings is "+strings.size());
        strings.clear();
        System.out.println("The number of elements in strings after clear(): "+strings.size());



    }
}
