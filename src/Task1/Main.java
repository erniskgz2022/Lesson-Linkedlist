package Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int size = 100;
        LinkedList<Integer> numbers = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            numbers.add(new Random().nextInt(99));
        }

        LinkedList<Integer> jupSandar = new LinkedList<>();
        LinkedList<Integer> takSandar = new LinkedList<>();

        for (int num : numbers) {
            if (num % 2 == 0){
                jupSandar.add(num);
            }else {
                takSandar.add(num);
            }
        }

        Collections.sort(jupSandar);
        Collections.sort(takSandar);
        System.out.println("JupSandar: "+ jupSandar);
        System.out.println("Taksandar" + takSandar);


    }
}