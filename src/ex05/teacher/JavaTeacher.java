package ex05.teacher;

public class JavaTeacher extends Teacher {

    // 재정의 (!= 오버라이드)
    void 강의하기() { // 동적바인딩 (C#에서는 동적결합이라고 함)
        System.out.println("Java 강의하기");
    }
}
