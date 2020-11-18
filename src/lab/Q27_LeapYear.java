package lab;

import java.util.Scanner;

public class Q27_LeapYear {
    public static void main(String[] args) {
        int LeapYear;
        boolean a;
        Scanner sc = new Scanner(System.in);

        System.out.println("현재 연도를 입력하세요 : ");
        LeapYear = sc.nextInt();

        a = ((LeapYear % 4 == 0) && (LeapYear % 100 != 0)) ? true : LeapYear % 400 == 0 ? true : false;

        if (a) {
            System.out.println("윤년입니다");
        } else {
            System.out.println("윤년이 아닙니다");
        }
    }


}
