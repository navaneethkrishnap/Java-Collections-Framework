package collectionsFramework;

import java.util.ArrayList;
import java.util.*;

public class o2_collection {
    public static void main(String[] args) {
        Collection<String> strings = List.of("one","two");

        String[] tabString1 = strings.toArray(new String[] {}); // pass an empty array
        String[] tabString2 = strings.toArray(new String[15]);  // or an array of the right size
        String[] par = new String[5];
        String[] tabString3 = strings.toArray(par);

        System.out.println(Arrays.toString(tabString1));
//        System.out.println("without invoking Arrays.toString() : "+tabString1);
        System.out.println(Arrays.toString(tabString2));
        System.out.println(Arrays.toString(tabString3));

        String[] largerTab = {"three","three","three","I","was","there"};
        System.out.println("largerTab = "+ Arrays.toString(largerTab));

        String[] result = strings.toArray(largerTab);
        System.out.println("result = "+ Arrays.toString(result));

        System.out.println("----------------------");
        System.out.println("Zero length array example: ");
        System.out.println();

        String[] zeroLengthTab = {};
        String[] zeroLengthTab2 = new String[0];
        System.out.println(Arrays.equals(zeroLengthTab2,zeroLengthTab));
        String[] res = strings.toArray(zeroLengthTab);
        System.out.println();

        System.out.println("zeroLengthTab = "+Arrays.toString(zeroLengthTab));
        System.out.println("res = "+Arrays.toString(res));
        System.out.println("----------------------");

        String[] tabString4 = strings.toArray(String[]::new);
        System.out.println("tabString4 = "+Arrays.toString(tabString4));

    }
}
