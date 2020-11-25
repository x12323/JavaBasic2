package x12323;

import java.util.HashSet;
import java.util.Iterator;

// ex> 로또 6/45 프로그램 생성
// 1~45 임의의 숫자 6개를 만드는 코드 작성
// 단, 중복은 허용하지 않음
public class Lotto {
    public static void main(String[] args) {
        HashSet<Integer> lotto = new HashSet<>();
        System.out.println("로또번호 임의의 숫자 6개 생성");

        while (lotto.size() < 6) {
            lotto.add((int) (Math.random() * 45) + 1);
        }
        Iterator<Integer> it = lotto.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
//https://godjaejun.tistory.com/55

