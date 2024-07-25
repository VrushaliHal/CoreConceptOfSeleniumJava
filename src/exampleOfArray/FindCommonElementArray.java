package exampleOfArray;

public class FindCommonElementArray {
    public static void main(String[] args) {

        int[] arr1 = { 20,34,56,46,57,45,45,23,24};
        int[] arr2 = { 30,34,56,56,57,55,95,73,24};

        for(int i =1 ; i< arr1.length ;i++)
        {
            for(int j=1 ; j<arr2.length;j++)
            {
                if(arr1[i]==arr2[i])
                {
                    System.out.println("Common Element in the Array "+ arr1[i]);
                    break;
                }
            }
        }
    }
}
