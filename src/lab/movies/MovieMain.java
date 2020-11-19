package lab.movies;

public class MovieMain {
    public static void main(String[] args) {
        String[] genre = {"드라마"};
        String[] dirtor = {"스콧 프랭크", "앨런 스코트"};
        String[] actor = {"애니아 테일러조이", "토머스 브로디생스터", "해리 멜링"};
        String[] summary = {"<퀸스 갬빗>은 넷플릭스에서 2020년 10월부터 방영하였습니다"};
        String desc = "1950년대 한 보육원에서 체스에 천재적인 재능을 보이는 소녀";


        Movie queencombat = new Movie("퀸즈컴뱃", "2020", 350, "넷플렉스",
                genre, dirtor, actor, summary, desc);

        System.out.println(queencombat.getTitle());
        System.out.println(queencombat.getYear());
        System.out.println(queencombat.getRuntime());
        System.out.println(queencombat.getPrdtin());
        System.out.println(queencombat.getGenre());
        //참조형 변수이므로 배열의 내용 대신 내용의 위치가 출력
        //내용이 저장된 위치가 출력 : 반복문으로 이용
        for (int i = 0; i < genre.length; ++i)
            System.out.println(queencombat.getGenre()[i]);
    }
}
