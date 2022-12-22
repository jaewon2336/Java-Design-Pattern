package ex02;

public class App {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Cat cat = new Cat();
        DoorManProxy doorMan = new DoorManProxy(new DoorMan());

        doorMan.쫓아내(mouse);
        doorMan.쫓아내(cat);
    }
}