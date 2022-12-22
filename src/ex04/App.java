package ex04;

public class App {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Cat cat = new Cat();
        DoorMan doorMan = DoorMan.getInstance();
        // DoorMan doorMan2 = DoorMan.getInstance(); // doorMan과 같은 객체
        // DoorMan doorMan2 = new DoorMan(); // 새로운 객체 생성 불가능

        doorMan.쫓아내(mouse);
        doorMan.쫓아내(cat);
    }
}
