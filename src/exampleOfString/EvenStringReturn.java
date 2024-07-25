package exampleOfString;

public class EvenStringReturn {
    public static void main(String[] args) {
        String word = " Hello my Father and lilia is my love";

        for(String s : word.split(" ")){
            if(s.length() % 2 == 0)
            {
                System.out.println(s);
            }
        }
    }
}
