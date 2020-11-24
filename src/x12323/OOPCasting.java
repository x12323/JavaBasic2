package x12323;

//  클래스 / 인터페이스 형변환
//  특정 객체가 자식클래스/인터페이스 타입에서
//  부모클래스/인터페이스 타입 또는 반대로 형변환하는 것을 의미

public class OOPCasting {
    public static void main(String[] args) {
        Unit u1 = new Unit();
        Marine m1 = new Marine();
        Firebat f1 = new Firebat();

        // marine 객체는 자동으로 Unit 객체로 형변환
        u1.attack();
        m1.attack();
        f1.attack();

        //  marine 객체는 자동으로 Unit 객체로 형변환
        //  이처럼 상속관계에 있는 클래스간의 객체 생성시
        //  자식클래스 타입의 객체를 부모클래스 타입의 객체로
        //  선언하는 경우 업캐스팅(Upcasting)이라 함
        Unit m2 = new Unit();
        m2.attack();

        //Unit.attack();

        Unit unit = new Marine();
        // Firebat f2 = (Firebat) new Unit();

        // Marine m3 = (Marine)new unit();
        //  Unit 객체를 Firebat 객체로 형변환하려면
        //  명시적 형변환 필요
        //  이처럼 상속관계에 있는 클래스간의 객체 생성시
        //  부모클래스 타입의 객체를 자식클래스 타입의 객체로
        //  선언하는 경우 다운캐스팅(DownCasting)이라고 함
        //  단, 컴파일시에는 오류가 나지 않지만
        //  실행시 오류 발생! 70000 40000 110000 55000
        Marine m3 = (Marine) unit;
        //  다운캐스팅
        //  Unit 객체 변수를 Marine 객체로 다운캐스팅
        //  실행에는 아무 문제 없음
        //  => unit 변수는 Marine 객체를 Unit 객체로 만든 것
        //  따라서, Marine 객체로의 형 변환이 가능
        m3.attack();
    }// main
}// OOPCasting

class Unit {
    protected int hp;
    protected int ap;

    protected void attack() {
        System.out.println("공격중입니다...");
    }
}

class Marine extends Unit {
    @Override
    protected void attack() {
        System.out.println("해병대가 공격중...");
    }
}
class Firebat extends Unit {
    @Override
    protected void attack() {
        System.out.println("불곰이 공격중...");
    }
}

