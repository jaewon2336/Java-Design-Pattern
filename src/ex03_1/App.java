package ex03_1;

/*
 * 어댑터 패턴
 * - 외부 요소를 기존 시스템에 재사용하고 싶지만 아직 만들어지지 않은 경우 (실습)
 * - 외부 요소를 기존 시스템에 재사용하고 싶지만 호환되지 않는 경우
 */
public class App {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Cat cat = new Cat();
        TigerAdapter tiger = new TigerAdapter(new FakeOuterTiger());
        DoorMan doorMan = new DoorMan();

        doorMan.쫓아내(mouse);
        doorMan.쫓아내(cat);
        doorMan.쫓아내(tiger);
    }
}
