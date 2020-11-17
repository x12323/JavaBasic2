package x12323;

import java.util.Scanner;

public class Sign1 {
    /**
     * 파일명 : Sungjukv2
     *  작성일 : 2020.11.17
     * 프로그램설명 : 성적처리프로그램 v2
     * 이름, 국어, 영어, 수학 점수를 키보드로 입력받아
     * 총점, 평균,학점을 계산하고 결과 출력
     * (단, 평균은 소수점 첫째자리까지 출력)
     * 학점 기준은 수우미양가로 하되 Switch문으로 계산하도록 함.
     * 단, 성적처리 결과 출력시 출력문을 하나만 사용
     * 그리고 Math.round(값)을 이용해서
     * 평균은 소수점 둘째자리까지 끊어서 출력함
     *
     * 변수 : name, kor, eng, mat, sum, mean, grd
     */
    public static void main(String[] args) {
        String name;
        int kor;
        int eng;
        int mat;
        int sum;
        double mean;
        char grd;
        String result;

        Scanner sc = new Scanner(System.in);

        String trd = "이름 : %s\n국어 : %d\n수학 : %d\n영어 : %d\n-----------\n" +
                "총점 : %d\n평균 : %s\n총점 : %c\n";

        System.out.print("이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.print("국어를 입력하세요 : ");
        kor = sc.nextInt();
        System.out.print("영어를 입력하세요 : ");
        eng = sc.nextInt();
        System.out.print("수학을 입력하세요 : ");
        mat = sc.nextInt();

        sum = kor + eng + mat;
        mean = (double)sum/3;



        switch((int)mean/10){
            case 10 :
            case 9 :
                grd = '수';
                break;
            case 8 :
                grd = '우';
                break;
            case 7 :
                grd = '미';
                break;
            case 6 :
                grd = '양';
                break;
            default:
                grd = '가';
        }

        mean = Math.round(mean*100) / 100.0;
        result = String.format(trd, name, kor, eng, mat, sum, String.valueOf(mean), grd);
        System.out.println(result);
    }
}
