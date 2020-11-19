package lab;

public class Student {
    int studentID;
    String name;
    String address;
    String birth;
    String dept;
    String prof;

    public Student(){
        studentID = 201350050;
        name = "김태희";
        address = "경기도 고양시";
        birth = "1985.3.22";
        dept = "컴퓨터";
        prof = "504";
    }

    public Student(int studentID, String name, String address,
                   String birth, String dept, String prof){
        this.studentID = studentID;
        this.name = name;
        this.address = address;
        this.birth = birth;
        this.dept = dept;
        this.prof = prof;
    }
}

