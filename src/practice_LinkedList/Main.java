package practice_LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>(List.of(
                5,2,6,3,8,0,5,6,4,3,4
        ));
        LinkedList<Integer> integers1 = new LinkedList<>(List.of(
                5,2,6,3,8,0,5,6,4,3,4
        ));

        Integer[] numArray = integers.toArray(new Integer[0]);
        for (Integer i : numArray) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println(integers);
        System.out.println(integers.getFirst());
        System.out.println(integers.getLast());

        if (integers.contains(2)){
            System.out.println("2 tizmede var");
        }else {
            System.out.println("2 tizmede jok!");
        }

        if (integers.equals(integers1)){
            System.out.println("Eki tizmede birdei elementter var ");
        }else {
            System.out.println("Ayirmasi var!");
        }

        if (integers.isEmpty()){
            System.out.println("Tizmede maalymat jok!");
        }else {
            System.out.println("tizmede maalymat var!");
        }
        System.out.println("Bashtapki tizme: " + integers);
        Collections.swap(integers,0,2);
        System.out.println("Almashkandan kiyin " + integers);

    }
}
