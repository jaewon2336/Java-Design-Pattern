package ex04;

/*
 * 문지기를 딱 한명만 만들고 싶음
 */
public class DoorMan {

    // 자바에서 static : main 메서드를 호출하기 이전에 JVM이 읽어서 메모리에 올라오는 객체
    private static DoorMan doorMan = new DoorMan();

    private DoorMan() {

    }

    // heap이 관리하는 메서드는 static에 접근할 방법이 없기 때문에 메서드도 static으로 생성
    public static DoorMan getInstance() {
        return doorMan;
    }

    public void 쫓아내(Animal animal) {
        System.out.println(animal.getName() + " 쫓아내");
    }
}
