package ex02;

public class DoorManProxy extends DoorMan {

    // 컴포지션
    private DoorMan doorMan;

    public DoorManProxy(DoorMan doorMan) {
        this.doorMan = doorMan;
    }

    public void 쫓아내(Animal animal) {
        System.out.println("안녕");
        doorMan.쫓아내(animal);
    }
}