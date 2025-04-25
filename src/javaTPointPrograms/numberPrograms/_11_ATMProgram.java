package javaTPointPrograms.numberPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

public class _11_ATMProgram {
    static double balance=0;
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Map<Integer, Consumer<Scanner>> options=new HashMap<>();
        options.put(1, _11_ATMProgram::withdraw);
        options.put(2, _11_ATMProgram::balanceCheck);
        options.put(3, _11_ATMProgram::deposit);
        //options.put(4, _11_ATMProgram::exit);


        while(true){
            System.out.println("bank activities ");
            System.out.println("1. withdraw");
            System.out.println("2. balance check");
            System.out.println("3. deposit");
            int choice=scanner.nextInt();
            options.getOrDefault(choice, scanner1 ->System.out.println("invalid option")).
                    accept(scanner);

        }
    }


    private static void deposit(Scanner scanner) {
        System.out.println("enter money to deposit: ");
        double money=scanner.nextDouble();
        balance +=money;
        System.out.println("deposit success");
        _11_ATMProgram.balanceView();

    }

    private static void balanceCheck(Scanner scanner) {
       // System.out.println("");
        _11_ATMProgram.balanceView();
    }

    private static void withdraw(Scanner scanner) {
        System.out.println("enter money to withdraw: ");
        double money=scanner.nextDouble();
        if(balance>=money){
            balance -=money;
            System.out.println("deposit success");
            _11_ATMProgram.balanceView();
        }
        else
            throw new RuntimeException("insufficient funds");
    }
    private static void balanceView(){

        System.out.println("total balance: "+balance);
    }


}
