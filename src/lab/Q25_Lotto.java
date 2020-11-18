package lab;

import java.util.Scanner;

public class Q25_Lotto {
    public static void main(String[] args) {
        int[] num = new int[3];
        int[] lotto = new int[3];
        int i = 0;
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("로또 번호 3개를 입력해주세요 : ");


        for (i = 0; i < 3; i++) {
            num[i] = sc.nextInt();
            lotto[i] = (int) (Math.random() * 10);
            System.out.print(lotto[i]);
        }
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                if (num[j] == lotto[k]) {
                    cnt = cnt + 1;
                }
            }
        }
        if (cnt == 3) {
            System.out.println("상금 1백만 지급!");
        } else {
            System.out.println("아쉽지만 다음기회에 !" + cnt + "개맞았습니다");
        }
    }
}

