package x12323;

import java.io.IOException;
import java.util.Scanner;

/**
 * 파일명 : SungJukV7Main
 * 작성일 : 2020.11.27
 * <p>
 * 프로그램 설명 : 성적처리프로그램 v9
 * 성적처리 프로그램에 저장기능을 추가함
 * 즉, SungJuk.dat 라는 파일을 생성해서
 * 입력한 성적데이터를 여기에 저장해둠
 *
 * <p>
 * SungJukService : readSungJuk, showSungJuk
 * showOneSungJuk, modifySungJuk,
 * removeSungJuk,  computeSungJuk
 * displayMenu
 *
 * System.exit(0) (정상적으로 종료되었다는 것)
 */

public class SungJukV9Main {
    public static void main(String[] args) throws IOException {
        SungJukV9Service sjsrv = new SungJukV9Service();

        Scanner sc = new Scanner(System.in);
        String menu = "";
        while (true) { // 메뉴 띄우고 작업번호 입력을 반복
            sjsrv.displayMenu();
            menu = sc.nextLine();

            switch (menu){
                case "1": sjsrv.newSungJuk();break;
                case "2": sjsrv.readSungJuk();break;
                case "3": sjsrv.readOneSungJuk();break;
                case "4": break;
                case "5": break;
                case "0": System.exit(0);break;
                default:
                    System.out.println("잘못입력!!");
            }
        }
    }
}
