package x12323;

import java.util.Scanner;

/**
 * 파일명 : Sungjukv2
 * 작성일 : 2020.11.17
 *
 * 프로그램설명 : 성적처리프로그램 v2
 *
 * 이름, 국어, 영어, 수학 점수를 키보드로 입력받아
 * 총점, 평균,학점을 계산하고 결과 출력
 * (단, 평균은 소수점 첫째자리까지 출력)
 * 학점 기준은 수우미양가로 하되 Switch문으로 계산하도록 함.
 *
 * 변수 : name, kor, eng, mat, sum, mean, grd
 */

public class SungJukV2 {
    public static void main(String[] args){
        //변수선언
        String name;
        int kor, eng, mat, sum;
        double mean;
        char grd;

        Scanner sc = new Scanner(System.in);

        //처리
        name = sc.nextLine();
        kor = sc.nextInt();
        eng = sc.nextInt();
        mat = sc.nextInt();

        sum = kor + eng + mat;
        mean = (double)sum / 3;


        /*
         * sum / 3 은 소수점 버림 후 정수형으로 나오기 때문에
         *
         */
        switch( (int)mean / 10 ) {
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

        //결과출력
        System.out.println("이름 : " + name);
        System.out.println("국어 : " + kor);
        System.out.println("영어 : " + eng);
        System.out.println("수학 : " + mat);
        System.out.println("---------------------");
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + mean);
        System.out.println("학점 : " + grd);

    }
}