package pl.vistula;

import java.util.Scanner;

public class Main implements Operations{

    public static void main(String[] args) {
        Scanner Cal=new Scanner(System.in);
        double first=0;
        double second=0;
        double ans=0;
        int choice;
        System.out.println("Enter First: ");
        first= Cal.nextDouble();
        System.out.println("Enter Second: ");
        second= Cal.nextDouble();
        System.out.println("1) ADDITION\t2) SUBTRACTION\n3) MULTIPLICATION\t4) DIVISION ");
        choice=Cal.nextInt();
        Cal.close();

        switch (choice){
            case 1: ans=Operations.add(first,second);
                    break;
            case 2: ans=Operations.sub(first,second);
                break;
            case 3: ans=Operations.mul(first,second);
                break;
            case 4: ans=Operations.div(first,second);
                break;
        }
        System.out.println("RESULT: "+ ans);
    }

}
