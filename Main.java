import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    try {
        try{
            for(;;) {
                System.out.println("Введите номер кота, чтобы узнать его цвет: ");
                String[] cats = {"Рыжий", "Чёрный", "Белый"};
                int n = sc.nextInt();
                System.out.println("Ваш кот: " + cats[n]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Вы нашли кота шрёдингера(индиксация за приделами массива): "+e);
        }
        System.out.println("Введите число, и оно будет поделено на секретное число: ");
        int a = sc.nextInt();
        int b = a/0;
    }catch(ArithmeticException e){
        System.out.println("Упс, кажется, это был нуль: "+e);
    }
    try{
        System.out.println("Введите число, чтобы поймать ClassCastException(1) или RuntimeException(2), или любое другое число, чтобы пропустить: ");
        int c = sc.nextInt();
        if(c==1)ThrowEx.ex1();
        else if(c==2)ThrowEx.ex2();
        else  System.out.println("Вы ввели другое число");
    }catch(ClassCastException e){
        System.out.println("Перехвачено сключение ClassCastException");
    }catch(RuntimeException e){
        System.out.println("Перехвачено исключение RuntimeException");
    }
    try{
        System.out.println("Введите 1, чтобы создать исключение, или любое другое число, чтобы завершить: ");
        int d = sc.nextInt();
        if(d==1)ThrowEx.testMethod();
    }catch(MyEx e){
        System.out.println("Перехвачено созданное исключение. \nКонец.");
    }
}
}