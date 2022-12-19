package ex01;

public class App {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Cat cat = new Cat();
        DoorMan doorMan = new DoorMan();

        doorMan.쫓아내(mouse);
        doorMan.쫓아내(cat);
    }
}
