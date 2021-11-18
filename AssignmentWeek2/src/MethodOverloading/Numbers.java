package MethodOverloading;



public class Numbers {
    int a , b, c ;
    void findLargestNumber(int a ,int b ){
        if(a > b){
            System.out.println("The Largest number of 2 is " + a);
        }
        else if(b > a){
            System.out.println("The Largest number of 2 is " + b);
        }
    }
    void findLargestNumber(int a, int b , int c){
        if( a > b && a >c){
            System.out.println("The Largest number of 3 is  " + a);
        }
        else if( b > a && b >c){
            System.out.println("The Largest number of 3 is " + b);
        }
        else if (c > a && c >b){
            System.out.println("The Largest number of 3 is  " + c);
        }

    }


}
class LargestNumbers extends Numbers {
    public static void main(String[] args) {
        LargestNumbers largestNumbers = new LargestNumbers();
       /* largestNumbers.a = 55;
        largestNumbers.b = 23;
        largestNumbers.c = 48;*/
        largestNumbers.findLargestNumber(55,23);
        largestNumbers.findLargestNumber(85 , 23,48);
    }
}


