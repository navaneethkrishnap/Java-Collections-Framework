package collectionsFramework.Set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();

        ts.add("N");
        ts.add("A");
        ts.add("V");
        ts.add("E");
        ts.add("T");
        ts.add("H");
        ts.add("K");

        System.out.println(ts);

        // since the treeset is sorted inbuild, while accessing sub sets you might have to
        // use first argument as lesser than or equals to the second arguments given.
        System.out.println(ts.subSet("A","N"));
    }
}
