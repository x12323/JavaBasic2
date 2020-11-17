package x12323;

public class NewBody {
    /* 파일명 : Sungjukv1
 /* 작성일 : 2020.11.17
            *
            * 프로그램설명 : 성적처리프로그램 v1
 * 이름, 국어, 영어, 수학점수를 설정하면
 * 총점, 평균,학점을 계산하고 결과 출력
 * name, kor, eng, mat, sum, mean, grd
 * 학점 기준은 수우미양가로 함
 * >= 90 수 , >= 80 우, >= 70 미, >= 60 양, >= 50 가 , 3항연산자
 */
    public static void main(String[] args) {
        String name = "이동진";
        int kor=90;
        int eng=85;
        int mat=80;
        int sum = 0;
        double mean = 0.0;
        sum = kor+eng+mat;
        mean = (double)sum/3;

        char qrd = mean >= 90 ? '수' : mean >= 80 ? '우' : mean >= 70 ? '미'
                : mean >= 60 ? '양' : '가';

        System.out.println("이름을 입력해주세요 : " + name);
        System.out.println("국어를 입력해주세요 : " + kor);
        System.out.println("영어를 입력해주세요 : " + eng);
        System.out.println("수학을 입력해주세요 : " + mat);
        System.out.println("총점 입력해주세요 : " + sum);
        System.out.println("평균을 입력해주세요 : " + mean);
        System.out.println("학력을 입력해주세요 : " + qrd);
    }
}
