package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reversedList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Original List: " + list);

        List<Integer> reversedList = revList(list);
        System.out.println("Reversed List: " + reversedList);

    }

    private static List<Integer> revList(List<Integer> list) {

        List<Integer> reversed = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {

            reversed.add(list.get(i));
        }


        return reversed;
    }
}
