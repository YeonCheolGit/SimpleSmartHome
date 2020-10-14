import java.util.Scanner;

/*
1. Greeting 상속받음
2. Main 클래스에서 Sensor 상속 받음
3. 즉 Greeting을 조상클래스로 만듬
 */
public class Sensor extends Greeting {

    /*
    1. 조명을 켜는 센서
    2. int 타입을 Scanner 클래스로 받은 후 반환
     */
    public static void lightSensor() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("어떤 공간의 조명을 켜드릴까요? (1 = 부엌, 2 = 부엌 + 거실)");
        int number = scanner.nextInt();

        if (number == 1) {
            LightController.lightOn("부엌");
        } else {
            LightController.lightOn("부엌", "거실");
        }
    }


    /*
    1. Main 클래스에서 사용될 메소드
    2. 임의의 난수 1, 2 발생 후 1이면 창문 닫기, 2면 열기
    */
    public static void weatherSensor(int weather) throws InterruptedException {
        if (weather == 1) {
            WindowController.getCloseWindow("비가 올 예정이니, 창문을 닫도록 하겠습니다. \n");
        } else if (weather == 2) {
            WindowController.getOpenWindow("오늘은 하루종일 맑고, 시원한 바람이 불 예정이니 창문을 열도록 하겠습니다. \n");
        } else {
            WindowController.getCloseHalfWindow("날씨가 흐리므로 창문을 반틈 닫겠습니다. \n");
        }
        Thread.sleep(2000);
    }


    /*
    1. Main 클래스에서 사용될 볼륨 조절 메소드
    2. 임의의 난수 발생 후 50기준으로 볼륨 up, down
    */
    public static void soundSensor(int sound) throws InterruptedException {
        if (sound > 50) {
            SoundController.getVolumeUp(
                    "현재 주변 소음은 " + sound + " 데시벨 입니다. \n" +
                            "주변의 소음이 심하여, 스피커 볼륨을 올리겠습니다. \n");
        } else {
            SoundController.getVolumeDown(
                    "현재 주변 소음은 " + sound + " 데시벨 입니다. \n" +
                            "현재 조용한 환경으로, 스피커 볼륨을 조금 낮추겠습니다. \n");
        }
        Thread.sleep(2000);
    }


    /*
    1. 센서가 측정하는 동안 보여 줄 안내문구
    2. kind parameter를 통해서 소음, 날씨를 각각 출력해주는 방식
    3. kind parameter만 바꿔서, 메소드 재활용
    */
    public static void sensing(String kind) throws InterruptedException {
        System.out.println();
        System.out.println(kind + " 분석 중 입니다.");
        Thread.sleep(2000);
        System.out.println("분석 중...");
        Thread.sleep(3000);
    }
}
