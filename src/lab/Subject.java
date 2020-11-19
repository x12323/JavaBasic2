package lab;

public class Subject {
    String numb;
    String subj;
    String out;
    String prof;


    public Subject(){
        numb = "0205";
        subj = "프로그래밍";
        out = "자바프로그래밍";
        prof = "301";
    }

    public Subject(String numb, String subj, String out, String prof) {
        this.numb = numb;
        this.subj = subj;
        this.out = out;
        this.prof = prof;
    }
}
