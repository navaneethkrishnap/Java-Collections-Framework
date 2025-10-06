package collectionsFramework.List;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();

        System.out.println("Initial size of al: "+ al.size());

        al.add("one");
        al.add("two");
        al.add("navi");
        al.add("kris");
        al.add(1,"p");

        System.out.println("size of al after additions: "+al.size());

        // display all the contents
        System.out.println("contents of al: "+al);

        // remove elements
        al.remove("p");
        al.remove(2);

        System.out.println("size of al after deletions: "+al.size());

        System.out.println("contents of al: "+ al);

    }
}
