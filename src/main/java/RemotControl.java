public class RemotControl {

    private String turnOn;
    private String turnOff;


    /*
    1. 스마트 시스템 가동을 위한 setter
    2. 시작할 때의 인사를 Main 메소드에서 넣어줌
     */
    public void setTurnOn(String turnOn) {
        this.turnOn = turnOn;
    }

    /*
    1. 스마트 시스템을 가동하는 getter
    2. Main에서 설정한 turnOn을 가져옴
    2. 가동 중 이라는 효과를 위해서 쓰레드 sleep 200millis
    */
    public void getTurnOn() throws InterruptedException {
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
