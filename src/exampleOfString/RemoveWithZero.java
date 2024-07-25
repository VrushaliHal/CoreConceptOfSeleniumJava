package exampleOfString;

public class RemoveWithZero {


    public static void main(String[] args) {
        String str = "000003456";
        str = removeZero(str);
        System.out.println(str);
    }

    public static String removeZero(String str)
    {

        // Count leading zeros

        // Initially setting loop counter to 0
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0')
            i++;

        // Converting string into StringBuffer object
        // as strings are immutable
        StringBuffer sb = new StringBuffer(str);

        // The StringBuffer replace function removes
        // i characters from given index (0 here)
        sb.replace(0, i, "");

        // Returning string after removing zeros
        return sb.toString();
    }
}

