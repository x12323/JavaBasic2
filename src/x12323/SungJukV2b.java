package x12323;

import java.util.Scanner;

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

        public class SungJukV2b {
            public static void main(String[] args){
                //변수선언
                System.out.println("이름 , 국어, 수학, 영어 점수를 입력하세요 : \n");
                String name;
                int kor, eng, mat, sum;
                double mean;
                char grd;
                String fmt =  "이름 : %s\n" + "국어 : %d\n"
                            + "영어 : %d\n" + "수학 : %d\n"
                            + "총점 : %d\n" + "평균 : %s\n" + "학점 : %c\n";

                String result;

                Scanner sc = new Scanner(System.in);

                //처리
                name = sc.nextLine();
                kor = sc.nextInt();
                eng = sc.nextInt();
                mat = sc.nextInt();

                sum = kor + eng + mat;
                mean = (double)sum / 3;

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
                //Math.random(값) : 반올림하는 메서드
                // 98765.4321 => round => 98765
                // 98765.4321 x 100 => 9876543.21
                // round(9876543.21) => 9876543
                // 9876543 / 100 => 98765.43
                mean = Math.round(mean*100) / 100.0;

                // String.valueOf(값)
                // 숫자를 문자로 변환
                result = String.format(
                        fmt, name, kor, eng,
                        mat, sum, String.valueOf(mean), grd);

                //결과출력
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
                System.out.println(result);

            }
        }


