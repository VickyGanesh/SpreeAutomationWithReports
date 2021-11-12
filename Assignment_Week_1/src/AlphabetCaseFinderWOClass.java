import java.util.Scanner;

public class AlphabetCaseFinderWOClass {
    public static void main(String[] args) {

        Scanner sObj = new Scanner(System.in);
        char c = sObj.next().charAt(0);
        int asciiOfChar = c;

        if(asciiOfChar >= 65 && asciiOfChar <= 90){
            System.out.println("UPPERCASE");
        }
        else if(asciiOfChar >= 97 && asciiOfChar <= 122){
            System.out.println("LOWERCASE");
        }



    }
}
