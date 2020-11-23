package x12323;

//추상 클래스
//추상 메서드를 포함하는 클래스
//추상메서드 : 메서드의 선언부만 있고, 몸체가 없는 메서드
//메서드의 몸체는 이것을 상속하는 자식클래스에서 정의함

//따라서, 추상클래스는 불오나전 클래스 이므로
//객체화할 수 없음
//추상메서드나 추삭 클래스는 abstact
public class AbstactClass {
    public static void main(String[] args) {
        //Animal2 al = new Animal2();
        Cat2 c2 = new Cat2();
        System.out.println(c2.cry());

        Dog2 d2 = new Dog2();
    }
}
    abstract class Animal2 {
        protected int weight;

        protected abstract String cry(); // 추사 메서드/
    }

    class Cat2 extends Animal2 {
        @Override
        protected String cry() { return "야옹~야옹~"; }
        }

    class Dog2 extends Animal2{

        @Override
        protected String cry() { return "월~월";
        }
    }