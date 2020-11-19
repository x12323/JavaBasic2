package lab;

public class Ex01 {
    public static void main(String[] args) {
        //  학생 클래스를 이용해서 객체 생성
        Student std = new Student();

        //  학생 클래스를 이용해서 객체 생성
        Department dept = new Department();

        //  학생 클래스를 이용해서 객체 생성
        Subject no = new Subject();

        //  학생 클래스를 이용해서 객체 생성
        Professor pro = new Professor();

        // 각 개체의 변수에 값 대입
        // 학생

        std.studentID = 201350050;
        std.name = "김태희";
        std.address = "경기도 고양시";
        std.birth = "1985.3.22";
        std.dept = "컴퓨터";
        std.prof = "504";

        dept.department = "컴퓨터 공학과";
        dept.number = "123-456-7890";
        dept.location = "E동 2층";
        dept.head = "504";

        no.numb = "0205";
        no.subj = "프로그래밍";
        no.out = "자바프로그래밍";
        no.prof = "301";

        pro.no = "301";
        pro.name = "이순신";
        pro.major = "프로그래밍";

        //객체에 저장된 값 출력
        //학생
        System.out.println(std.studentID);
        System.out.println(std.name);
        System.out.println(std.address);
        System.out.println(std.birth);
        System.out.println(std.dept);
        System.out.println(std.prof);

    }
}
