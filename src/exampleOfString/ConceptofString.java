package exampleOfString;

public class ConceptofString {
    public static void main(String[] args) {
        String fullName = "Vrushali Haldankar";
        String reverseName = "" ;
        char ch ;
        int i = fullName.length();
        for(int j= i-1; j >=0 ; j--  )
        {
            ch = fullName.charAt(j);
            reverseName =reverseName+ch ;
        }
        System.out.println(reverseName);
    }

}
