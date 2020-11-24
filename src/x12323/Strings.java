package x12323;

//  String 클래스
//  C언어에서 문자열은 char형 배열로 표현
//  자바에서는 문자열처리를 위한 별도의 string 클래스 제공

//  String 클래스의 객체는 한번 생성되면
//  그 값을 읽기만 가능하고 변경할 수 없는 불변객체임
//  따라서, + 연산자로 문자열을 결합하는 경우
//  기존의 문자열이 변경되는 것이 아니고
//  각각의 내용을 합쳐 새로운 객체를 생성함

public class Strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World!";
        str1 = str1 + str2;
        str1 = str1 + "WoW"; // 메모리 낭비가 심함
        // => StringBuffer, StringBuilder 추천

        StringBuffer sb = new StringBuffer();
        sb.append("Hello").append("World!")
                .append("Wow");
        System.out.println(sb);

        // 문자열 간 비교
        // 문자열 상수 "풀"이라는 개념 이해 필요
        // a 객체 생성 => "Hello"를 SCP에 저장
        // b 객체 생성 => SCP에 이미 존재하므로
        //              같은 값을 참조하도록 함
        // c 객체 생성 => SCP가 아닌 전혀 새로운
        //              위치에 "Hello"를 생성

        // 문자열 변수간 비교에서 == 연산자는
        // 값을 비교하는 것이 아니고
        // 값이 저장된 *위치를 비교함 (중요!)
        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");
        //original : 매번 새로운 위치에 만든다.


        System.out.println(a==b);
        System.out.println(a==c);

        // 따라서, 문자열간 값을 비교할때는
        // equals 메서드를 사용해야함

        System.out.println( a.equals(b));
        System.out.println( a.equals(c));
        System.out.println( b.equals(c));
    }
}


