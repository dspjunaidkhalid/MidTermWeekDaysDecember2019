package datastructure;

import java.util.*;

public class CollectionView {

public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");


        String var = map.get(2);
        System.out.println("Value at index 2 is: " + var);
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
                Map.Entry mentry2 = (Map.Entry) iterator2.next();
                System.out.print("Key is: " + mentry2.getKey() + " & Value is: ");
                System.out.println(mentry2.getValue());
        }



    }

}
