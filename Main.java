import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    try {
        try{
            for(;;) {
                System.out.println("Enter the cat's number to find out its color: ");
                String[] cats = {"Orange", "Black", "White"};
                int n = sc.nextInt();
                System.out.println("Cat color is: " + cats[n]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You found a Schrodinger cat(ArrayIndexOutOfBoundsException): "+e);
        }
        System.out.println("Enter your number and it will be divided by the secret number: ");
        int a = sc.nextInt();
        int b = a/0;
    }catch(ArithmeticException e){
        System.out.println("Oops, that was zero: "+e);
    }
    try{
        System.out.println("Enter a number to catch ClassCastException (1) or RuntimeException (2), or any other number to skip: ");
        int c = sc.nextInt();
        if(c==1)ThrowEx.ex1();
        else if(c==2)ThrowEx.ex2();
        else  System.out.println("You entered another number");
    }catch(ClassCastException e){
        System.out.println("Intercepted ClassCastException Exception");
    }catch(RuntimeException e){
        System.out.println("Intercepted RuntimeException Exception");
    }
    try{
        System.out.println("Enter 1 to create an exception, or any other number to finish: ");
        int d = sc.nextInt();
        if(d==1)ThrowEx.testMethod();
    }catch(MyEx e){
        System.out.println("Intercepted created exception.");
    }
         System.out.println("Finished.");
}
}
