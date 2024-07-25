package exampleOfArray;

public class FindTwoLargestArray {
    public static void main(String[] args) {
        int[] arr1 = {34,56,45, 343,234,56,56,45,78};

        int firstLarge = 0;
        int secondLarge = 0;

        for ( int element :arr1)
        {
            if (firstLarge < element) {

                secondLarge =firstLarge;
                firstLarge = element;


            } else if (secondLarge<element) {
                secondLarge =element;

            }
        }
            System.out.println("First and Second Large Element in the Array "+ firstLarge+" "+secondLarge);
        }


    }

