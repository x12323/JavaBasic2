package x12323;
// ex) 주민번호에서 성별체크하는 자바코드 작성
// 123456-1234567 , 987654-4567890
// 1, 2 : 2000년 이전 남여 구분
// 3, 4 : 2000년 이후 남여 구분

import java.util.Scanner;

public class Numberz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jumin = "123456-1234567";
        String gender = jumin.substring(7, 8);
        String man = sc.nextLine();

        String result2 = "";
        switch (gender) {
            case "1":
                result2 = "2000년 이전 남";
                break;
            case "2":
                result2 = "2000년 이전 여";
                break;
            case "3":
                result2 = "2000년 이후 남";
                break;
            case "4":
                result2 = "2000년 이후 여";
                break;


        }
        System.out.println(result2);

        // 지정한 위치의 문자 추출 : charAt
        String str;
        str = "123456-1234567";
        System.out.println(str.charAt(7));

        // 정규표현식에 따라 일치여부 확인 : matches
        // 정규식 사용가능 메서드 : split, replaceAll
        int num = 1234567;
        String str1 = String.format("%d", num);
        String str2 = "1234567";
        System.out.println(str1.matches(str2));

        str1 = String.format("%d", num);
        System.out.println(str1.matches(str2));

        System.out.println(str1.matches("[a-z].+"));
        System.out.println(str1.matches("[0-9].+"));

        //  정규표현식 regular expression
        //  특정한 규칙을 가진 문자열의 집합을 표현하기
        //  위해 사용하는 형식언어
        //  [] : 문자집합표현, -는 두 문자 사이의 범위 표현
        //  [0-9] : 숫자 집합
        //  [a-z,A-Z] :  영문자 집합
        //  [가-힣] : 한글 집합합
        //  * : 0번 이상 무한개의 임의의 문자 반복
        //  ab* : ab, aba, ab1, abA, abaa, ...
        //  + : 1번 이상 무한개의 임의의 문자 반복
        //  ab+ : aba, ab1, abaa, ...
        //  ? : 0개 또는 1개의 임의의 문자 반복
        //  ab? : aba, abb, ... ab0, abZ, abz
        //  {n, b} : 최소 n개 이상 m개 이하 반복
        //  [0-9]{3,4} : 123, 987, 1234, 9876
        //  ^ : 문자열 시작
        //  ^123 : 123으로 시작하는 문자열
        //  $ : 문자열 끝
        //  123$ : 123으로 끝나는 문자열 의미
        //  . : 임의의 문자를 의미
        //  .{3,} : 문자의 최소 길이는 3암

        //  1234567890
        //  abcdefghijklmnopqrstuvwxyz
        //  가나다라마바사아자차카타파하

        //  다음 문자열이 전화번호형시게 맞게 작성되었는지
        //  알아보는 정규식을 작성하세요
        //  010-123-4567, 010-1234-5678

        //  ex) 사용자 아이디가 다음 규칙에 적합하게
        //  작성되어 있는지 확인
        //  영문자, 소문자 하나, 대문자 하나, 숫자, 특수기호
        //  abc123!XYZ, 123jkl

        String num1 = "010-123-4567";
        String pattern1 = "[0-9]{3}-[0-9]{3,4}-[0-9]{4}";
        System.out.println(num1.matches(pattern1));

        num1 = "010-1234-5678";
        System.out.println(num1.matches(pattern1));


        //  ex) 사용자 아이디가 다음 규칙에 맞게 작성되었는지 확인
        //  영문자 소문자/대문자, 숫자, 특수기호()등이 포함
        //  abc123!XYZ, 123jkl
        String pattern2 = "[a-zA-Z0-9!]+";

        String uid = "abc123!XYZ";
        System.out.println(uid.matches(pattern2));

        uid = "123jkl";
        System.out.println(uid.matches(pattern2));

        //  첫글자는 영문자 소문자/대문자
        //  두번째는 영문자, 숫자, 특수기호()등이 포함
        //  아이디의 최소 길이는 6 ~ 18자

        String pattern3 = "^[a-zA-Z][a-zA-Z0-9&%]{5,17}";

        uid = "a12345678901234567";
        System.out.println(uid.matches(pattern3));

        uid = "123jkl";
        System.out.println(uid.matches(pattern3));
    }

}
