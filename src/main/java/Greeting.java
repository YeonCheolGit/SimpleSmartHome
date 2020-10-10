import java.util.Scanner;

public class Greeting {

    /*
    1. Main 클래스에서 활용될 첫인사
    2. "Hey, siri"를 Scanner 클래스를 활용해서 받으면 시스템 시작. 대소문자 무시
    3. 다른 멘트 입력 시 else 구문
     */
    public static void hello() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (scanner.nextLine().equalsIgnoreCase("Hey, Siri")) {
                System.out.println("안녕하세요. 연철님");
                break;
            } else {
                System.out.println("다시 불러주세요");
            }
        }
    }


    /*
    1. Main 클래스에서 활용될 끝인사
    2. 스마트시스템이 종료되어도 음악은 계속 나옴
     */
    public static void bye() throws InterruptedException {
        System.out.println("시스템이 종료되어도 음악은 종료되지 않습니다.");
        Thread.sleep(2000);
        System.out.println("좋은 하루 되세요^^");
    }
}
