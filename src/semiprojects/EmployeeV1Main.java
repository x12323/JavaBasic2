package semiprojects;

import java.util.Scanner;

/**
 * EmployeeV1Main
 * 인사정보 관리 프로그램 진입점
 */

public class EmployeeV1Main {
    public static void main(String[] args) {
        EmployeeV1Service empsrv =
                new EmployeeV1Service();
        Scanner sc = new Scanner(System.in);
        String menu = "";

        while (true) {
            empsrv.displayMenu();
            menu = sc.nextLine();

                switch (menu) {
                    case "1":
                        empsrv.newEmployee();
                        break;
                    case "2":
                        empsrv.readEmployee();
                        break;
                    case "3":
                        empsrv.readOneEmployee();
                        break;
                    case "4":
                        break;
                    case "5":
                    case "0":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("잘못입력!!");

                }
            }
        }
    }
