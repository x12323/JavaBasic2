package x12323;

//  다음 문자열이 전화번호형시게 맞게 작성되었는지
//  알아보는 정규식을 작성하세요
//  010-123-4567, 010-1234-5678

//  ex) 사용자 아이디가 다음 규칙에 적합하게
//  작성되어 있는지 확인
//  영문자, 소문자 하나, 대문자 하나, 숫자, 특수기호
//  abc123!XYZ, 123jkl
/*
String str1 = String.format("%d", num);
        String str2 = "1234567";
        System.out.println(str1.matches(str2));

        str1 = String.format("%d", num);
        System.out.println(str1.matches(str2));

        System.out.println(str1.matches("[a-z].+"));
        System.out.println(str1.matches("[0-9].+"));*/

//  정규표현식 regular expression
//  특정한 규칙을 가진 문자열의 집합을 표현하기
//  위해 사용하는 형식언어
//  [] : 문자집합표현, -는 두 문자 사이의 범위 표현

import java.util.Scanner;

public class Phonenumberz {
    public static void main(String[] args) {
        String num = "010-123-4567";
        String pattern1 = "[0-9]{3}-[0-9]{3,4}-[0-9]{4}";
        System.out.println(num.matches(pattern1));

        num = "010-1234-5678";
        System.out.println(num.matches(pattern1));
    }
}
