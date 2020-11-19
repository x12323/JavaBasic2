package lab;

public class Professor {
    String no;
    String name;
    String major;

    public Professor(){
        no = "301";
        name = "이순신";
        major = "프로그래밍";
    }

    public Professor(String no, String name, String major) {
        this.no = no;
        this.name = name;
        this.major = major;
    }
}
