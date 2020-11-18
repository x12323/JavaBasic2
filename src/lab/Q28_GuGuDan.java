package lab;

import java.util.Scanner;

public class Q28_GuGuDan {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        a = sc.nextInt();
        if (a > 0 || a < 10) {
            System.out.println("잘못 입력하셨습니다!!");
        } else {
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d x %d = %d ", a, i, a * i);
            }
        }
    }
}