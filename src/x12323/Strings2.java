package x12323;

//  문자열처리 유용한 기능을 제공하는 메서드
public class Strings2 {
    public static void main(String[] args) {
        //  문자열 길이 : length
        String str = "HelloWorld!";
        System.out.println(str.length());


        //  문자열 검색
        //  indexOf(문자) : 왼쪽기준 지정한 문자가 찾기
        int idx = str.indexOf('W');
        System.out.println(idx);
        idx = str.indexOf('?');
        System.out.println(idx);
        idx = str.indexOf("Hello");
        System.out.println(idx);

        //  lastIndexOf(문자) : 오른쪽 기준 지정한 문자 찾기, 위치값 출력
        str = "Hello, Hi, Noon";
        idx = str.lastIndexOf('H');
        System.out.println(idx);
        idx = str.lastIndexOf('n');
        System.out.println(idx);

        //  문자 바꾸기 : replace
        //  replace(찾을 문자열, 바꿀 문자열)
        str = "A*B*C*D";
        str = str.replace("*", "-");
        System.out.println(str);

        //  문자열 분리 : split
        //  지정한 문자를 기준으로 문자열을 나눠 배열에 저장
        str = "201350050,김태희,경기도,1985.3.22,컴퓨터,504";
        String[] result = str.split(",");

        /*for(int i = 0; i < result.length; ++i){
            System.out.println(result[i]);*/

        for( String data : result){
            System.out.println(data);
        } // 향상된 for문을 사용하면 배열을 쉽게 다룰수 있음

        // 문자열 추출 : substring
        // substring ( 시작위치, 끝위치-1)
        str = "Hello, World!";
        String word = str.substring(7, 12);
        System.out.println(word);

        // ex) 주민번호에서 성별체크하는 자바코드 작성
        // 123456-1234567 , 987654-4567890
        // 1, 2 : 2000년 이전 남여 구분
        // 3, 4 : 2000년 이후 남여 구분


    }
}
