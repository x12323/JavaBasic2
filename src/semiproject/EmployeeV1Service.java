package semiproject;

import jdk.nashorn.internal.ir.EmptyNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeV1Service
        extends EmployeeV1GenericService {

    List<EmployeeVO> hrdata = new ArrayList<>();

    @Override
    public void newHrInfo() {
        int empno;
        String fname;
        String email;
        String jobid;
        String mgrid;
        String deptid;
        Scanner sc = new Scanner(System.in);

        System.out.print("사번 입력 : ");
        empno = Integer.parseInt(sc.nextLine());
        System.out.print("성 입력 : ");
        fname = sc.nextLine();
        System.out.print("이메일 입력 : ");
        email = sc.nextLine();
        System.out.println("직책 입력 : ");
        jobid = sc.nextLine();
        System.out.println("상사번호 입력 : ");
        mgrid = sc.nextLine();
        System.out.println("부서번호 입력 : ");
        deptid = sc.nextLine();

        EmployeeVO hr = new EmployeeVO(empno, fname, email,
                jobid, mgrid, deptid);

        hrdata.add(hr);

    }

    @Override
    public void readInfo() {
        String fmt = "사번 : %d, 성 : %s, 이메일 : %s, 직책 : %s, 상사번호 : %s, 부서번호 : %s\n";

        Iterator<EmployeeVO> iter = hrdata.iterator();

        while(iter.hasNext()){
            EmployeeVO hr = iter.next();

            System.out.printf(fmt, hr.getEmpno(), hr.getFname(), hr.getEmail(),
                    hr.getJobid(), hr.getMgrid(), hr.getDeptid());
        }
    }

    @Override
    public void readOneInfo() {
        String fmt = "사번 : %d, 성 : %s, 이름 :%s, 이메일 : %s, 전화번호 : %s, 날짜 : %s, " +
                "직책 : %s, 급여 : %d, 수수료 : %.1f, 상사번호 : %s, 부서번호 : %s\n";

        // 상세조회할 학생이름 입력 받음
        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 사번은? ");
        int empno = Integer.parseInt(sc.nextLine());

        for(EmployeeVO hr : hrdata){
            if(hr.getEmpno()==empno){
                System.out.printf(fmt, hr.getEmpno(), hr.getFname(), hr.getLname(), hr.getEmail(),
                        hr.getPhone(), hr.getHdate(), hr.getJobid(), hr.getSal(), hr.getComm(),
                        hr.getMgrid(), hr.getDeptid());
                break;
            }
        }
    }

    @Override
    public void displayMenu() {
        StringBuilder sb = new StringBuilder();
            sb.append("-------------------\n")
                .append("인사 관리프로그램 v1\n")
                .append ("-------------------\n")
                .append ("1. 인사 정보 입력\n")
                .append ("2. 인사 정보 조회\n")
                .append("3. 인사 정보 상세조회\n")
                .append("4. 인사 정보 수정\n")
                .append ("5. 인사 정보 삭제\n")
                .append("0. 프로그램 종료\n")
                .append ("-------------------\n")
                .append("원하시는 작업은 ? ");
        System.out.println(sb);
    }

    @Override
    public void modifyInfo() {

    }

    @Override
    public void removeInfo() {

    }
}
