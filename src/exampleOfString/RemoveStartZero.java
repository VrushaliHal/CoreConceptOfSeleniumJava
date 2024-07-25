package exampleOfString;

public class RemoveStartZero {


    public static void main(String[] args) {


        String str = "000002324";
        StringBuffer sb = new StringBuffer(str);
        int i = 0;
        System.out.println(sb.length());
        while ((i < sb.length()) && (sb.charAt(i) == '0'))
            i++;
        sb = sb.replace(0, i, "");
        str = sb.toString();
        System.out.println(str);
    }

}