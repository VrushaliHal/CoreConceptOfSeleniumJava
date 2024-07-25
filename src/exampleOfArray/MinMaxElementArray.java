package exampleOfArray;

public class MinMaxElementArray {
    public static void main(String[] args) {
        int[] inputNumberArray = {30,45,34,24,35,27,23,9,78};

        int minNumber = inputNumberArray[0];
        int maxNumber = inputNumberArray[0];

        for ( int ele :inputNumberArray)
        {
            if(minNumber > ele)
            {
                minNumber =ele;
            }
            else if ( maxNumber < ele)
            {
                maxNumber =ele;

            }

        }
        System.out.println("Maximum Element is "+maxNumber);
        System.out.println("Minimum Element is "+minNumber);
    }
}
