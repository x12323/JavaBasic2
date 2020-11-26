package semiprojects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * EmployeeV1Service
 * 인사정보 처리 인터페이스를 구현한 클래스
 * 인사정보 처리에 대한 CRUD 코드를 작성해 둠
 */

public class EmployeeV1Service
        extends EmployeeV1GenericService {

    List<EmployeeVO> empdata = new ArrayList<>();

    /**
     * 인사정보 처리 UI 출력
     */
    public void displayMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------\n")
                .append("인사 관리프로그램 v1\n")
                .append("-------------------\n")
                .append("1. 인사 정보 입력\n")
                .append("2. 인사 정보 조회\n")
                .append("3. 인사 정보 상세조회\n")
                .append("4. 인사 정보 수정\n")
                .append("5. 인사 정보 삭제\n")
                .append("0. 프로그램 종료\n")
                .append("-------------------\n")
                .append("원하시는 작업은 ? ");
        System.out.println(sb);
    }

    @Override
    /**
     * 인사정보 입력받기
     */
    public void newEmployee() {
        EmployeeVO emp = new EmployeeVO(0, "", "", "", 0,
                0, "", 0, 0.0, 0, 0);
        Scanner sc = new Scanner(System.in);

        // 모든 인사정보는 일단 문자형으로 받되
        // 필요에 따라 적절한 형변환을 해서 변수에 저장
        System.out.print("사번 입력 : ");
        //emp = sc.nextInt();
        emp.setEmpno(Integer.parseInt(sc.nextLine()));

        System.out.print("성 입력 : ");
        emp.setFname(sc.nextLine());

        System.out.print("이메일 입력 : ");
        emp.setEmail(sc.nextLine());

        System.out.println("직책 입력 : ");
        emp.setJobid(sc.nextLine());

        System.out.println("상사번호 입력 : ");
        emp.setPhone(Integer.parseInt(sc.nextLine()));

        System.out.println("부서번호 입력 : ");
        emp.setHdate(Integer.parseInt(sc.nextLine()));

        empdata.add(emp);
    }

    @Override
    public void readEmployee() {
        String fmt =
                "%8s %8s %8s %8s %8s %8s";
        System.out.printf(fmt, "사번", "성", "이메일", "직책", "상사번호", "부서번호");
        Iterator<EmployeeVO> iter = empdata.iterator();

        while (true) {
            EmployeeVO e = iter.next();
            System.out.printf(fmt, e.getEmpno(), e.getFname(),
                    e.getEmail(), e.getJobid(), e.getPhone(),
                    e.getHdate());
        }
    }

    @Override
    /**
     * 상세 인사정보 출력
     * 사원번호를 입력받아 출력함
     */
    public void readOneEmployee() {
        String fmt = "%8s %8s %8s %8s %8s" +
                "%8s %8s %8s %8s %8s %8s\n";

        EmployeeVO emp = new EmployeeVO();
        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 사원번호는 ?");
        String empno = sc.nextLine();

        for(EmployeeVO e : empdata){
            // 입력한 사원번호와
            // 순회해서 읽어온 사원번호와 비교
            // 일치하면 이것을 출력하기 위해
            // 다른 변수에 저장함
            if(e.getEmpno() == emp.getEmpno()){
                emp = e;
        }
    }
        System.out.printf(fmt, emp.getEmpno(), emp.getFname(),
                emp.getLname(), emp.getEmail(), emp.getPhone(),
                emp.getHdate(), emp.getJobid(), emp.getSal(),
                emp.getComm(), emp.getMgrid(), emp.getDeptid());
    }
}

