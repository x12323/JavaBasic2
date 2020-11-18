package lab;

import java.util.Scanner;

public class Q26_salary {
    public static void main(String[] args) {
        int money;
        int marry;
        double tax;
        int total;
        Scanner sc = new Scanner(System.in);

        System.out.print("연봉 : ");
        money = sc.nextInt();
        System.out.print("결혼 여부 : ");
        marry = sc.nextInt();

        if (marry == 0 && money < 3000) {
            tax = money*10/100;
        } else if (marry == 0 && money >= 3000) {
            tax = money*25/100;
        } else if (marry == 1 && money < 6000) {
            tax = money*15/100;
        } else {
            tax = money*35/100;
        }
        System.out.println(tax + '%');
    }
}
