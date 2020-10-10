import java.util.Scanner;

public class LightController {
    Scanner scanner = new Scanner(System.in);

    /*
    1. 조명을 켜는 컨트롤러
    2. Parameter에 1개, 2개가 오는 것에 따라 다른 출력 (Method Overriding)
     */
    public static void lightOn(String object) throws InterruptedException {
        System.out.println(object + " 조명을 켜도록 하겠습니다. \n");
        System.out.println("반짝!");
        Thread.sleep(2000);
    }

    public static void lightOn(String object, String object2) throws InterruptedException {
        System.out.println(object + "," + object2 + " 조명을 켜도록 하겠습니다. \n");
        System.out.println("반짝!");
        Thread.sleep(2000);
    }
}
