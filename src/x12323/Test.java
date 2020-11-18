package x12323;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /* 프로그램설명 : 성적처리프로그램 v2
    * 학생 3명의 성적데이터를 키보드로 입력받아
    총점, 평균,학점을 계산하고 결과 출력
    * (단, 평균은 소수점 첫째자리까지 출력)
    * 학점 기준은 수 우 미 양 가 로 하되 Switch문으로 계산하도록 함.
    * 단, 성적처리 결과 출력시 출력문을 하나만 사용
     *
    * 변수 : name, kor, eng, mat, sum, mean, grd
*/
        //변수 선언
        String[] name = new String[3];
        int[] kor = new int[3];
        int[] eng = new int[3];
        int[] mat = new int[3];
        int[] sum = new int[3];
        double[] mean = new double[3];
        char[] grd = new char[3];

        String fmt = "이름 : %s\n " + "국어 : %d\n"
                + "영어 : %d\n, " + "수학 : %d\n";

        String result;

        Scanner sc = new Scanner(System.in);


        //처리
        for(int i=0; i<3; i++){
            System.out.printf("%d번째 학생 성적 입력중...\n",i+1);
            System.out.print("이름을 입력하세요 : ");
            name[i] = sc.next();
            System.out.print("국어를 입력하세요 : ");
            kor[i] = sc.nextInt();
            System.out.print("영어를 입력하세요 : ");
            eng[i] = sc.nextInt();
            System.out.print("수학을 입력하세요 : ");
            mat[i] = sc.nextInt();
        }

        //결과
        for(int i=0; i<3; i++){

            System.out.println(result = String.format(fmt, name[i], kor[i], eng[i], mat[i]));
        }




    }
}
