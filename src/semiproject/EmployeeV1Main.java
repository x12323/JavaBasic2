package semiproject;

import x12323.SungJukV8Service;

import java.util.Scanner;

public class EmployeeV1Main {
    public static void main(String[] args) {
        EmployeeV1Service empsrv = new EmployeeV1Service();

        Scanner sc = new Scanner(System.in);
        String menu = "";

        // 메뉴 띄우고 작업번호 입력을 반복
        while (true) {
            empsrv.displayMenu();
            menu = sc.nextLine();

            switch (menu) {
                case "1":
                    empsrv.newHrInfo();
                    break;
                case "2":
                    empsrv.readInfo();
                    break;
                case "3":
                    empsrv.readOneInfo();
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못입력!!");


            }
        }
    }
}
