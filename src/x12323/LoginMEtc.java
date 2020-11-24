package x12323;

import java.util.Scanner;

/**
 * 로그인 확인 프로그램 선생님버전
 * 0. 인증용 아이디와 비밀번호를 하나 생성해둠
 *  => abc123, 987xyz
 * 1. Scanner로 아이디, 비밀번호를 입력받음
 * 2a. 아이디와 비밀번호가 틀리면 "가입되지 않은 아이디!"
 * 2b. 아이디만 맞으면 "비밀번호가 틀렸음!"
 * 2c. 아이디와 비밀번호가 맞으면 "로그인 성공!"
 */
public class LoginMEtc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ids = "";
        String pws = "";
        String as = "abc123";
        String bs = "987xyz";

        while (true) {
            ids = sc.nextLine();
        System.out.print("아이디를 입력해주세요 : ");
        System.out.print("비밀번호를 입력해주세요 : ");
        pws = sc.nextLine();

            if (as.equals(ids) && bs.equals(pws)) {
                System.out.println("가입되지 않은 아이디!");
            } else if (as.equals(ids) && bs.equals(pws)) {
                System.out.println("비밀번호가 틀렸음!");
            } else if (as.equals(ids) && bs.equals(pws)) {
                System.out.println("로그인 성공!");
                break;
            }
        }
    }
}
