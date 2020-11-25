/*
package x12323;

import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        String[] game = {"신드라", "이렐리아", "르블랑"};
        List<String> games = Arrays.asList(game);

        for(int i=0; i<games.size(); i++) {
            if (games.get(i).equals("신드라")) {
                System.out.println((i + 1) + "번째에서 찾았습니다");
                break;
            }
        }
            for(String g : games){
                if(g.namez.equals("이렐리아")){
                    System.out.println("찾았습니다");
                    break;
                }
            }

            for(GameInfo g : games3){
                if(g.name.contains("르블랑")){
                    System.out.println("데이터찾음");
                }

                for(GameInfos g : games3){
                    if(g.name.indexOf("르블랑") >= 0){
                        System.out.println("데이터찾음");
                    }
                }
        }
    }
}
*/
class GameInfo {
    String name;
    int price;

    public GameInfo(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

