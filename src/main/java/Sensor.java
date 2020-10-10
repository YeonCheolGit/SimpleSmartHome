public class Sensor {

    /*
    1. Main 클래스에서 사용될 메소드
    2. 임의의 난수 1, 2 발생 후 1이면 창문 닫기, 2면 열기
    */
    public static void weatherSensor(int weather) throws InterruptedException {
        if (weather == 1) {
            WindowControl.getCloseWindow("비가 올 예정이니, 창문을 닫도록 하겠습니다.\n");
            Thread.sleep(2000);
        } else if (weather == 2) {
            WindowControl.getOpenWindow("오늘은 하루종일 맑고, 시원한 바람이 불 예정이니 창문을 열도록 하겠습니다.\n");
            Thread.sleep(2000);
        } else {
            WindowControl.getCloseHalfwindow("날씨가 흐리므로 창문을 반틈 닫겠습니다.\n");
            Thread.sleep(2000);
        }
    }


    /*
    1. Main 클래스에서 사용될 볼륨 조절 메소드
    2. 임의의 난수 발생 후 50기준으로 볼륨 up, down
    */
    public static void soundSensor(int sound) {
        if (sound > 50) {
            SoundControl.getVolumeUp(
                    "주변 소음이 50데시벨을 넘었습니다.\n" +
                            "주변의 소음이 심하여, 스피커 볼륨을 올리겠습니다\n");
        } else {
            SoundControl.getVolumeDown(
                    "주변 소음이 50데시벨 이하 입니다.\n" +
                            "현재 조용한 환경으로, 스피커 볼륨을 조금 낮추겠습니다\n");
        }
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
