package Abstraction;

import java.util.Scanner;

public class AXIS extends Bank{
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

        AXIS axis = new AXIS();
        axis.implementDenomination();
        axis.calculateDeposit(axis.numberInThousands, axis.numInHundreds,  axis.numberInTens, axis.numberInOnes);

    }
}