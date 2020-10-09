public class Main {
    public static void main(String[] args) throws InterruptedException {

        /*
        스마트홈 시스템을 가동합니다.
         */
        RemotControl remotControl = new RemotControl();
        remotControl.getTurnOn(
                "스마트홈 시스템을 시작합니다.\n" +
                        "...");

        /*
        1. 스마트홈 시스템 가동 후 센서 가동
        2. 소음을 측정합니다.
        3. 데시벨을 의미하는 난수 발생 후 센서에 입력
        4. 50을 기준으로 스피커 볼륨 조절
         */
        Sensor sensor = new Sensor();
        sensor.sensing("주변의 소음을");

        int sound = 0;
        int a = (int) (Math.random() * 100);
        sound += a;

        sensor.soundSensor(sound);


        /*
        1. 스피커 볼륨 조절 후 날씨 센서 가동
        2. 오늘의 날씨를 측정합니다.
        3. 날씨가 좋으면 창문 열기, 나쁘면 닫기
        4. 1, 2 두 가지 난수 발생 후 날씨 대입
         */
        sensor.sensing("오늘의 날씨를");
        int b = (int) (Math.random() * 3);

        sensor.weatherSensor(b);
        System.out.println();


        /*
        창문과 스피커 볼륨 조절 후 시스템 종료
         */
        remotControl.getTurnOff("스마트홈 시스템을 종료합니다.");
    }
}
