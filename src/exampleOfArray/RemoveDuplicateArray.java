package exampleOfArray;


import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateArray {
    public static void main(String[] args) {

        int[] inputArraywithDupElements = {5,8,5,23,45,56,57,23,8,56};

        Set<Integer> set = new HashSet<Integer>();
        for (int element  :inputArraywithDupElements)
        {
            set.add(element);
        }
        Integer[] outputArraywithoutDupElements  =set.toArray(new Integer[set.size()]);

        for (int withoutDup : outputArraywithoutDupElements)
        {
            System.out.print(" "+withoutDup);
        }


    }
}
