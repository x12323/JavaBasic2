package lab;

public class Department {
    String department;
    String number;
    String location;
    String head;

    public Department(){
        department = "의상디자인";
        number = "234-5678-9012";
        location = "A동 1층";
        head = "301";
    }

    public Department(String department, String number,
                      String location, String head ){
        this.department = department;
        this.number = number;
        this.location = location;
        this.head = head;

    }
}

