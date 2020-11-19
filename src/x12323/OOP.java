package x12323;

//  객체 지향 프로그래밍 개요
//  현실의 모든 사물을 객체로 취급하여
// 소프트웨어를 개발하는 방식
//  객체 : 실생활에서 우리가 인식하는 유/무형의 사물
//  ex) 집, 자동차, 사람, 급여, 주문, ...

//  클래스 : 객체를 만들어 내기 위한 틀, 설계도
//  클래스에는 객체의 상태를 나타내는 필드/속성과
//  객체의 기능을 나타내는 메서드로 구성됨


//  클래스는 객체의 설계도이기 떄문에
//  실제 정보는 저장할 수 없음
//  실제 정보를 저장하려면, 이것의 객체가 필요한데
//  객체를 선언하는 과정을 개체화(instantate)라고 함
//  개체화를 통해 나온 결과물을 객체/인스턴스라 하는데
//  클래스에 정의된 필드와 기능이 실제 메모리상에 할당된 것
public class OOP {

    //

    public static void main(String[] args) {
        //  Person 클래스를 이용해서 객체 생성 : 개체화
        //  클래스명 객체명 = new 생성자;
        Person choi = new Person();
        Person lee = new Person();
        Person kim = new Person();

        //기본생성자로 초기화된 변수 확인
        System.out.println(choi.name);
        System.out.println(lee.name);
        System.out.println(kim.name);
        // 객체의 (멤버변수)에 값 대입
        // 각 변수별로 값을 대입하는것은 다소 불편
        // => 생성자를 이용하면 좀 더 편하게 값을 대입할 수 있음
        choi.name = "최승희";
        choi.job = "의사";
        choi.age = 45;
        choi.gender = "여";
        choi.blood = "A";

        lee.name = "이미녀";
        lee.job = "골프선수";
        lee.age = 28;
        lee.gender = "여";
        lee.blood = "O";

        kim.name = "김미남";
        kim.job = "교수";
        kim.age = 47;
        kim.gender = "남";
        kim.blood = "AB";

        //매개변수 생성자를 이용한 객체 생성 및 초기화
        /*Person choi = new Person("동진", "프로그래머",
                                23, "남", "0");*/
        //

        //  멤버변수 출력
        System.out.println(choi.name);
        System.out.println(choi.job);
        System.out.println(choi.age);
        System.out.println(choi.gender);
        System.out.println(choi.blood);

        System.out.println(lee.name);
        System.out.println(lee.job);
        System.out.println(lee.age);
        System.out.println(lee.gender);
        System.out.println(lee.blood);

        System.out.println(kim.name);
        System.out.println(kim.job);
        System.out.println(kim.age);
        System.out.println(kim.gender);
        System.out.println(kim.blood);
    }
} // class

//  클래스 정의 : 접근제한자 클래스명{
//  필드
//  메서드
//}
// 최승희 : 의사, 45, 여, A
// 이미녀 : 골프선수, 28, 여, O
// 김미남 : 교수, 47, 남, AB

class Person {
    String name;
    String job;
    int age;
    String gender;
    String blood;

    // 생성자 constructor
    // 멤버변수에 값을 초기화 시키는 특별한 메서드
    // public 클래스명(매개변수,...){
    // 변수초기화
    // }
    //기본 생성자
    public Person() {
        name = "홍길동";
        job = "무사";
        age = 18;
        gender = "남";
        blood = "AB";
    }
    //매개변수를 사용하는 생성자
    //매개변수명과 멤버변수명이 같은 경우
    //변수가림 shadowing 현상 발생
    //클래스의 멤버변수임을 명확하게 표현하기 위해
    //변수명 앞에 this 라는 키워드를 추가 작성

    public Person(String name, String job, int age,
                  String gender, String blood) {
        this.name = name;
        this.job = job;
        this.age = age;
        this.gender = gender;
        this.blood = blood;
    }
}
