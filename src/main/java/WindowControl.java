import java.util.Scanner;

/*
Main 메소드에서 발생한 난수를 기준으로 정함
 */
public class WindowControl {

    private String openWindow;
    private String closeWindow;
    private String closeHalfwindow;

    static Scanner scanner = new Scanner(System.in);


    /*
    1. 비가 와서 창문을 완전히 닫는 메소드
    2. 비가 오니까, 어울리는 음악 추천
    3. 음악이 마음에 드는지 Y/N 입력 받음
    4. 음악이 마음에 들지 않을 시음 다른 노래 추천
     */
    public static void getCloseWindow(String comment) {
        System.out.println(comment);
        System.out.println("비가 올 때는 '김현식 - 비처럼 음악처럼' 어떠신가요?? (Y/N)");
        if (scanner.nextLine().equalsIgnoreCase("Y")) {
            System.out.println("(재생중) 비가 내리고 ~ 음악이 흐르면 ~ ");
        } else {
            System.out.println("그렇다면 '장범준 - 회상' 추천드립니다!");
            System.out.println("(재생중) 길을 걸었지 ~ 누군가 옆에 있다고 ~");
        }
    }

    /*
    1. 날씨가 좋아서 창문을 여는 메소드
    2. 맑은 날에 어울리는 음악 추천
    3. 음악이 마음에 드는지 Y/N 입력 받음
    4. 음악이 마음에 들지 않을 시음 다른 노래 추천
    */
    public static void getOpenWindow(String comment) {
        System.out.println(comment);
        System.out.println("날씨가 좋을 땐 '인디고 - 여름아 부탁해' 어떠신가요?? (Y/N)");
        if (scanner.nextLine().equalsIgnoreCase("Y")) {
            System.out.println("(재생중) 여름아 ~ 부탁해 ~ ");
        } else {
            System.out.println("그렇다면 '듀스 - 여름안에서' 추천드립니다!");
            System.out.println("(재생중) 하늘은 우릴향해 열려있어 ~");
        }
    }

    /*
    1. 날씨가 흐려서, 창문을 반틈 닫느 메소드
    2. 흐린 날에 어울리는 음악 추천
    3. 음악이 마음에 드는지 Y/N 입력 받음
    4. 음악이 마음에 들지 않을 시음 다른 노래 추천
    */
    public static void getCloseHalfwindow(String comment) {
        System.out.println(comment);

        System.out.println("날씨가 흐릴 땐 '나훈아 - 테스형' 노래가 어떠신가요? (Y/N)");
        if (scanner.nextLine().equalsIgnoreCase("Y")) {
            System.out.println("(재생중) 아 테스형 ~ 세상이 왜 이래 ~");
        } else {
            System.out.println("그렇다면 '에픽하이 - 우산'을 추천드립니다!");
            System.out.println("(재생중) 어느새 빗물이 내 발목에 고이고 ~ ");
        }
    }
}
