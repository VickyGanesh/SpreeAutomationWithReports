import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class SmallestNumOF4WOArray {

    public static void main(String[] args) {
        Scanner sObj    = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sObj.nextInt();
        System.out.println("Enter the second number");
        int num2 = sObj.nextInt();
        //System.out.println(num1+" "+num2);
        System.out.println("Enter the third number");
        int num3 = sObj.nextInt();
        System.out.println("Enter the fourth number");
        int num4 = sObj.nextInt();

        if(num1 < num2 && num1 < num3 && num1 < num4){
            System.out.println(num1+" is smallest");
        }
        if(num2 < num1 && num2 < num3 && num2 < num4){
            System.out.println(num2+" is smallest");
        }
        if(num3 < num1 && num3 < num2 && num3 < num4){
            System.out.println(num3+" is smallest");
        }
        if(num4 < num1 && num4 < num2 && num4 < num3){
            System.out.println(num4+" is smallest");
        }
    }
}
