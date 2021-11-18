package Abstraction;

import java.util.Scanner;

public abstract class Bank {
    String nameOfBank ;
    int maximumTransactionLimit;
   // int amountToBeDeposited;
    int  numberInThousands , numInHundreds , numberInTens  , numberInOnes;
    public abstract void implementDenomination();
    public void calculateDeposit(int numThousand, int numHundred, int numTen,int numOne){
        this.numberInThousands = numThousand;
        this.numInHundreds = numHundred;
        this.numberInTens = numTen;
        this.numberInOnes = numOne;
            int amountToBeDeposited = (this.numberInTens*10) + (this.numInHundreds*100) + (this.numberInThousands*1000) +
                    (this.numberInOnes*1);
            System.out.println(amountToBeDeposited + "is deposited successfully" + " in " + this.nameOfBank);

        }

   // protected abstract void calculateDeposit(int numberInThousands, int numInHundreds, int numberInTens, int numberInOnes);
}

