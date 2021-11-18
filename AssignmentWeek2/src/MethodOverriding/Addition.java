package MethodOverriding;

public class Addition {
    int numberOne = 5 , numberTwo = 5 ;
    void performAddOperation(){
        System.out.println("The Sum of the two numbers is " + this.numberOne + this.numberTwo);
    }

}

class Concat extends Addition{
    String stirngOne = "Hello";
    String stringTwo = "World";
    void performAddOperation(){
        System.out.println("The concatenated string is " + stirngOne + " " +  stringTwo);
    }
    public static void main(String[] args) {
        Concat concat = new Concat();
        concat.performAddOperation();
        Addition addition = new Addition();
        addition.performAddOperation();
    }
}