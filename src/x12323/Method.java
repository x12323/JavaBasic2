package x12323;

/**
 * 파일명 : SungJukV4
 * 작성일 : 2020.11.18
 *
 * 프로그램 설명 : 성적처리프로그램 v4
 * 학생 3명의 성적데이터를 키보드로 입력받아
 * 총점,평균,학점을 계산하고 결과 출력
 *
 * 단, 평균은 소수점 첫째 자리까지 출력하고
 * 학점기준은 '수우미양가'로 하되
 * switch문으로 학점을 계산하도록 함
 *
 * 만점은 100점, 100~90, 89~80,
 * 79~70, 69~60, 59~0기준으로 학점부여
 * name, kor, eng, mat, sum, mean, grd
 *
 * 단, 성적처리 결과 출력시 출력문을 하나만 사용
 *
 * 성적처리 기능을 구현함으로써 코드가 길어지고
 * 내용파악이 어려워 지는 것을 방지하기 위해
 * 함수(메서드)로 재정의해서 코드를 개선함
 *
 */

public class Method {

    //  메서드
    //  특정 작업을 수행하기 위해 작성한 명령어들의 묶음
    //  C언어의 함수와 비슷한 성격을 가지는 프로그래밍 요소
    //  입력값을 통해 무언가를 하고 그 결과를 도출하는
    //  수학의 함수(블랙박스)와 비슷한 개념

    //  메서드의 목적
    //  프로그램을 작성하다 보면 반복적으로 쓰인 코드를
    //  종종 보는데, 효율적으로 작성하려면 반복문으로
    //  처리하면 되지만, 만일, 반복문이 반복된다면?
    //  메서드를 적용하면 기능별로 모듈화를 적용할 수 있기
    //  때문에 프로그램의 가독성이 좋아지고, 협업시에도
    //  유용하며, 기능변경시 유지보수에도 좋음

    //  메서드 정의
    //  접근제한자 리턴값 메서드이름(타입 매개변수형){
    //  메서드 몸체
    //  }
    public static void main(String[] args) {
        //  Hello, World!! 메세지 출력
        System.out.println("Hello, World!!");

        //  Hello World!! 메세지 3번 출력
        System.out.println("Hello, World!!");
        System.out.println("Hello, World!!");
        System.out.println("Hello, World!!");

        ////  Hello World!! 메세지 3번 출력
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello, World!!");
            for (int j = 0; j < 3; j++) {
                System.out.println("Hello, World!!");
                for (int k = 0; k < 3; k++) {
                    System.out.println("Hello, World!!");
                }
            }
        }
        //  Hello World!! 메세지 3번 출력을 3번 반복하는 코드에서
        //  메세지 변경함 : Hello, Java!!
        //  Hello, World!!를 Hello, Java!!로 바꿈

        //  인사말 출력 메서드 호출(call)
        sayHello();
        sayHello2();

        sayHello3("Hello, World!!");
        sayHello3("Hello, Java!!");
        sayHello3("Hello, Android!!");

        String result = sayHello4("안녕하세요, 세상아!");
        System.out.println(result);

        computeNum(1, 5);
        computeAllsum(5, 1);
        computeAllsum(1, 5);

        // 시험코드
        /*int a = 1;
        int b = 2;
        String fmt1 = "%d + %d = %d";
        String fmt2 = "%d - %d = %d";
        String fmt3 = "%d × %d = %d";
        String fmt4 = "%d ÷ %d = %d";

        System.out.printf(fmt1, a,b,a+b);
        System.out.printf(fmt2, a,b,a-b);
        System.out.printf(fmt3, a,b,a*b);
        System.out.printf(fmt4, a,b,a/b);*/

        // 시험코드
        /*int x = 1;
        int y = 5;  // 1+2+3+4+5
        int sum = 0;

        for(int i = x; i <= y; ++i) {
            sum += i;    // sum = sum + i;
        }

        x = 5;
        y = 1;   // 5+4+3+2+1
        for(int i = x; i >= y; --i) {
            sum += i;    // sum = sum + i;
        }

        int min = x;
        int max = y;
        if (x > y) { min = y; max = x; }

        for(int i = min; i <= max; ++i) {
            sum += i;    // sum = sum + i;
        }*/


    }

    //  간단한 인사말 출력 메서드
    //  public : 접근제한자, 외부 클래스의 메서드 사용허가 여부
    //  static : 정적 메서드 , 객체생성없이 바로 사용가능 메서드
    //  void   : 메서드가 반환하는 값이 없음
    public static void sayHello() {
        System.out.println("Hello, World!!");
    }

    //  간단한 인사말 3번반복
    public static void sayHello2() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello, World!!");
        }
    }

    //  간단한 인사말을 출력하는 메서드 : sayHello3
    //  단, 인삿말은 언제든 변경하도록 재작성
    //  매개변수 : 메서드 처리시 필요로 하는 입력값
    public static void sayHello3(String msg) {
        System.out.println(msg);
    }

    //  간단한 인사말을 출력하는 메서드 : sayHello4
    //  단, 인삿말은 언제든 변경하도록 작성
    //  단, 인삿말 출력을 메서드가 바로 하지않고
    //  인삿말 생성 후 호출한 대상에게 넘김
    //  return : 메서드 내에서 처리한 값을 외부로 보내려면
    //  return이라는 명령문 사용
    //  return시 값의 type과 메서드의 return type은
    //  반드시 일치해야함
    public static String sayHello4(String name) {
        return name;
    }

    //  두개의 정수를 매개변수로 선언하고
    //  사칙연산한 결과를 출력하는 메서드 : computeNum
    //  ? + ? = ?
    //  ? - ? = ?
    //  ? × ? = ?
    //  ? ÷ ? = ?

    public static void computeNum(int a, int b) {
        String fmt1 = "%d + %d = %d\n";
        String fmt2 = "%d - %d = %d\n";
        String fmt3 = "%d * %d = %d\n";
        String fmt4 = "%d / %d = %d\n";

        String result =
                String.format(fmt1, a, b, a + b) +
                        String.format(fmt2, a, b, a - b) +
                        String.format(fmt3, a, b, a * b) +
                        String.format(fmt4, a, b, a / b);

        System.out.println(result);

        /*System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a × b = " + (a * b));
        System.out.println("a ÷ b = " + (a / b));*/

    }

    //  두 개의 정수를 매개변수로 선언하고
    //  두 정수를 범위로 설정해서 그것의 모든 합을
    // 구하고 출력하는 메서드 : computeAllsum
    // ex) 5, 1 -> 1+2+3+4+5 => 15

    public static void computeAllsum(int x, int y) {
        /*  int x = 1;
            int y = 5;  1+2+3+4+5
            int sum = 0;    */


        int min = x;
        int max = y;
        int sum = 0;

        String fmt = "%d ~ %d 정수범위의 총합 : %d\n";

        if (x > y) {
            min = y;
            max = x;
        }
        for (int i = min; i <= max; ++i) {
            sum += i; //sum = sum + i;
        }
        System.out.printf( fmt, min,max,sum );

        /*int sum = 0;
        if(num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                sum = sum + i;
                System.out.println("1부터 5까지의 합은 : " + sum);
            }
            System.out.println("합계는 : "+sum);
        } else {
            for (int i = num2; i <= num1; i++) {
                sum = sum+i;
                System.out.println("5부터 1까지의 합은 : " + sum);
            }
            System.out.println("합계는 : "+sum);*/
    }

}



