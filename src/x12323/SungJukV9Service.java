package x12323;

import java.io.*;
import java.util.Scanner;

public class SungJukV9Service
        extends SungJukV8Service {

    private String fpath = "C:/Java/sungjuk.dat";
    private FileReader fr = null;
    private FileWriter fw = null;
    private BufferedReader br = null;
    private BufferedWriter bw = null;

    public SungJukV9Service()  {
        // 프로그램 최초시작시
        // 파일에 저장된 모든 성적데이터를
        // List타입의 sjdata변수에 저장

        try {
            loadSungJuk();
        } catch (IOException e) {
            System.out.println("성적데이터 읽어오는중 오류발생!!");
            e.printStackTrace();
        }
    }

    public void displayMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------\n")
                .append("성적 처리프로그램 v8\n")
                .append ("-------------------\n")
                .append ("1. 성적 데이터 입력\n")
                .append ("2. 성적 데이터 조회\n")
                .append("3. 성적 데이터 상세조회\n")
                .append("4. 성적 데이터 수정\n")
                .append ("5. 성적 데이터 삭제\n")
                .append("0. 프로그램 종료\n")
                .append ("-------------------\n")
                .append("원하시는 작업은 ? ");
        System.out.print(sb);
    }

    /**
     * SungJukV8Service의 newSungJuk을 재정의
     */
    @Override
    public void newSungJuk() {
        // 성적데이터 입력받은 후
        // ArrayList 객체에 저장
        super.newSungJuk();
        try {
            writeSungJuk(sj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * writeSungJuk
     * 입력받은 성적데이터를 sungjuk.dat에 저장
     */
     protected void writeSungJuk(SungJukVO sj) throws IOException {
         String fmt = "%s,%s,%s,%s,%s,%.1f,%s";

         // 파일 기록시 추가 append 기능을 활성화함
         fw = new FileWriter(fpath, true);
         bw = new BufferedWriter(fw);

         String data = String.format(fmt, sj.getName(),
                 sj.getKor(), sj.getEng(), sj.getMat(), sj.getSum(),
                 sj.getMean(), sj.getGrd());


         bw.write(data);
         bw.newLine(); // 줄바꿈 메서드
         // FileWriter 클래스를 이용해서
         // 파일에 데이터를 기록할 때 다소 불편함
         // => printWriter 추천!

         bw.close();
         fw.close();
     }

    /**
     * loadSungJuk
     * 파일에 저장된 성적데이테러르
     * List타입의 sjdata에 저장
     */

    protected void loadSungJuk() throws IOException {
         fr = new FileReader(fpath);
         br = new BufferedReader(fr);

         while(br.ready()){
             String s[] = br.readLine().split(",");
             sj = new SungJukVO(s[0], Integer.parseInt(s[1]),
                     Integer.parseInt(s[2]),
                     Integer.parseInt(s[3]),
                     Integer.parseInt(s[4]),
                     Double.parseDouble(s[5]),
                     s[6].charAt(0));

             // 파일에서 읽어온 성적데이터를
             // List변수 sjdata에 추가함
             sjdata.add(sj);
         }

         br.close();
         fr.close();
     }
}
