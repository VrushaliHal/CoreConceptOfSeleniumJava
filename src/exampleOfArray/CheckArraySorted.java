package exampleOfArray;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {67,34, 47, 68, 234};
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                isSorted = false;
                break;
            }
        }
        if(isSorted)
        {
            System.out.println("Array is sorted");
        }
        else {
            System.out.println("Array is  NOT sorted");
        }
    }
}
