package exampleOfArray;

public class MaxElementArray {
    public static void main(String[] args) {

        int[] arr = { 45,34,37,43,23,12,78};
         int min = arr[0];

         for(int k : arr)
         {
             if(min > k)
             {
                 min =k;
             }
         }
        System.out.println("min Element in Array "+min);
    }
}
