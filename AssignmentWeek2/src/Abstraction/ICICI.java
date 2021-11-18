package Abstraction;

import java.util.Scanner;

public class ICICI extends Bank{
    int amountToBeDeposited;
    int  numberInThousands , numInHundreds , numberInTens , numberInFives , numberInOnes;
        @Override
        public void implementDenomination() {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number in Thousands");
            this.numberInThousands = scanner.nextInt();
            System.out.println("Enter number in Hundreds");
            this.numInHundreds = scanner.nextInt();
            System.out.println("Enter number in Tens");
            this.numberInTens = scanner.nextInt();
            System.out.println("Enter number in Ones");
            this.numberInOnes = scanner.nextInt();

        }
    public static void main(String[] args) {

        ICICI icici = new ICICI();
        icici.nameOfBank = "ICICI Bank";
        icici.implementDenomination();
        icici.calculateDeposit(icici.numberInThousands, icici.numInHundreds,  icici.numberInTens, icici.numberInOnes);
       }
}
