public class RemotControl {

    private String turnOn;
    private String turnOff;


    /*
    1. Hey, Siri 호출 후 시스템이 가동되는 생성자
    2. Main 클래스에서 가동될 때의 멘트를 입력
     */
    public RemotControl(String turnOn) throws InterruptedException {
        this.turnOn = turnOn;
        System.out.println(turnOn);
        Thread.sleep(2000);
    }


    /*
    1. 스마트 시스템을 종료하는 메소드
    2. 빠른 종료를 위해서 쓰레드 sleep X
    */
    public void getTurnOff(String comment) {
        System.out.println(comment);
    }
}
