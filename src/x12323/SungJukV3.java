package x12323;

import java.util.Scanner;

/**
* 파일명 : Sungjukv2
 *  작성일 : 2020.11.17
* 프로그램설명 : 성적처리프로그램 v2
 * 학생 3명의 성적데이터를 키보드로 입력받아
            * 총점, 평균,학점을 계산하고 결과 출력
            * (단, 평균은 소수점 첫째자리까지 출력)
* 학점 기준은 수우미양가로 하되 Switch문으로 계산하도록 함.
 * 단, 성적처리 결과 출력시 출력문을 하나만 사용
 *
* 변수 : name, kor, eng, mat, sum, mean, grd
            */

    public class SungJukV3 {
        public static void main(String[] args){
            //배열변수선언
            //자료형 변수형[] = new 자료형[]
           String[] name = new String[3];
           int[] kor = new int[3];
           int[] eng = new int[3];
           int[] mat = new int[3];
           int[] sum = new int[3];
           double[] mean = new double[3];
           char[] grd = new char[3];

            String fmt =  "이름 : %s\n" + "국어 : %d\n"
                        + "영어 : %d\n" + "수학 : %d\n";

            String result;

            Scanner sc = new Scanner(System.in);

            //처리
            for(int i=0; i<3; i++) {
                System.out.printf("%d번째 학생 성적 입력중...\n",i+1);
                System.out.print("이름을 입력하세요 : ");
                name[i] = sc.nextLine();
                System.out.print("국어를 입력하세요 : ");
                kor[i] = Integer.parseInt(sc.nextLine());
                System.out.print("영어를 입력하세요 : ");
                eng[i] = Integer.parseInt(sc.nextLine());
                System.out.print("수학을 입력하세요 : ");
                mat[i] = Integer.parseInt(sc.nextLine()); //nextLine으로 하고싶을때

                //sc.skip("\r\n|[\n\r]"); // 스킵

                //수학 성적 입력시 같이 입력된 enter 키가
                //다음 데이터(이름) 입력 시 입력값으로
                //자동으로 전달됨
                //그러한 상황을 해결하기 위해
                //미리 엔터키를 제 거하는 코드 삽입

                /*sum[i] = kor[i] + eng[i] + mat[i];
                mean[i] = (double)sum[i] / 3;*/

                switch( (int)mean[i] / 10 ) {
                    case 9 :
                        grd[i] = '수';
                        break;
                    case 8 :
                        grd[i] = '우';
                        break;
                    case 7 :
                        grd[i] = '미';
                        break;
                    case 6 :
                        grd[i] = '양';
                        break;
                    default:
                        grd[i] = '가';
                }
            }
            //출력

           }


            //Math.random(값) : 반올림하는 메서드
            // 98765.4321 => round => 98765
            // 98765.4321 x 100 => 9876543.21
            // round(9876543.21) => 9876543
            // 9876543 / 100 => 98765.43
            //mean = Math.round(mean*100) / 100.0;

            // String.valueOf(값)
            // 숫자를 문자로 변환

    }
            //
    // 결과출력
            /*System.out.println("이름 : " + name);
            System.out.println("국어 : " + kor);
            System.out.println("영어 : " + eng);
            System.out.println("수학 : " + mat);
            System.out.println("---------------------");
            System.out.println("총점 : " + sum);
            System.out.println("평균 : " + mean);
            System.out.println("학점 : " + grd);*/


            //문자열 연결 연산자로 문장을 만드는 경우
            // String 변수의 특성때문에 성능저하 발생






