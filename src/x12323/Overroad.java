package x12323;

//메서드 다중정의
//객체지향 3대 중요개념 중 하나인 다향성에 해당
//같은 이름의 메서드를 중복해서 정의하는 것을 의미
//한 클래스에서 같은 이름의 메서드가 2개 이상 존재할 수 있음
//이때 메서드의 서명만 다르게 작성한다면 정의 가능
public class Overroad {
    public static void main(String[] args) {
        NonOverroad nol = new NonOverroad();
        ApplyOverroad aol = new ApplyOverroad();
        System.out.println(nol.addInt(1, 3));
        System.out.println(nol.addInt3(1, 3, 5));
        System.out.println(nol.addDouble(1.5, 1.8));

        System.out.println(aol.add(1, 3));
        System.out.println(aol.add(1, 5));
        System.out.println(aol.add(1.5, 1.8));
    }

    //1. 정수 2개를 더하는 프로그램
    public static class NonOverroad {
        public int addInt(int a, int b) {
            return a + b;
        }

        //2. 실수2개를 더하는 프로그램
        public double addDouble(double a, double b) {
            return a + b;
        }

        //3. 정수 3개를 더하는 프로그램
        public int addInt3(int a, int b, int c) {
            return a + b + c;

            //메서드 다중정의를 적용하면
            //메서드의 이름을 하나로 통일해서 작성 가능
            //개발자가 외울 메서드의 이름이 줄어듬
            //단, 메서드를 어떻게 호출할지만 알고있으면 됨
        }
    }

    public static class ApplyOverroad {
        public int add(int a, int b) {
            return a + b;
        }

        //2. 실수2개를 더하는 프로그램
        public double add(double a, double b) {
            return a + b;
        }

        //3. 정수 3개를 더하는 프로그램
        public int add(int a, int b, int c) {
            return a + b + c;

        }
    }
}