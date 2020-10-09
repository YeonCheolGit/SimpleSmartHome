public class RemotControl {

    private String turnOn;
    private String turnOff;

    /*
    1. 스마트 시스템을 가동하는 메소드
    2. 가동 중 이라는 효과를 위해서 쓰레드 sleep 200millis
     */
    public void getTurnOn(String comment) throws InterruptedException {
        System.out.println(comment);
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
