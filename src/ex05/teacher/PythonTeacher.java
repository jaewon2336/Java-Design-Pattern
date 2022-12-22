package ex05.teacher;

public class PythonTeacher extends Teacher {

    // 재정의 (!= 오버라이드)
    void 강의하기() { // 동적바인딩
        System.out.println("Python 강의하기");
    }
}
