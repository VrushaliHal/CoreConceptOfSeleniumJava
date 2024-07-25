package exampleOfArray;

public class CheckDuplicate {
    public static void main(String[] args) {

        int[] arr = {23,34,12,56,45,56,78,34,100};

        for (int i= 0 ; i<arr.length; i++)
        {
            for(int j= i+1; j<arr.length  ; j++)
            {
                if(arr[i]==arr[j])
                {

                    System.out.println(" Duplicate Element is "+arr[i]);
                }
            }
        }

    }
}
