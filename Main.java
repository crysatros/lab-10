import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    try {
        try{
            for(;;) {
                System.out.println("������� ����� ����, ����� ������ ��� ����: ");
                String[] cats = {"�����", "׸����", "�����"};
                int n = sc.nextInt();
                System.out.println("��� ���: " + cats[n]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("�� ����� ���� ���������(���������� �� ��������� �������): "+e);
        }
        System.out.println("������� �����, � ��� ����� �������� �� ��������� �����: ");
        int a = sc.nextInt();
        int b = a/0;
    }catch(ArithmeticException e){
        System.out.println("���, �������, ��� ��� ����: "+e);
    }
    try{
        System.out.println("������� �����, ����� ������� ClassCastException(1) ��� RuntimeException(2), ��� ����� ������ �����, ����� ����������: ");
        int c = sc.nextInt();
        if(c==1)ThrowEx.ex1();
        else if(c==2)ThrowEx.ex2();
        else  System.out.println("�� ����� ������ �����");
    }catch(ClassCastException e){
        System.out.println("����������� ��������� ClassCastException");
    }catch(RuntimeException e){
        System.out.println("����������� ���������� RuntimeException");
    }
    try{
        System.out.println("������� 1, ����� ������� ����������, ��� ����� ������ �����, ����� ���������: ");
        int d = sc.nextInt();
        if(d==1)ThrowEx.testMethod();
    }catch(MyEx e){
        System.out.println("����������� ��������� ����������. \n�����.");
    }
}
}