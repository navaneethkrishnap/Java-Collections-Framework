package collectionsFramework.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("Beta");
        lhs.add("Alpha");
        lhs.add("Eta");
        lhs.add("Gamma");
        lhs.add("Epsilon");
        lhs.add("Omega");
        System.out.println("The order will be returned in inserted order: ");
        System.out.println(lhs);
    }
}
