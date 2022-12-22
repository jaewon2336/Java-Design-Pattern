package ex05;

import ex05.teacher.JavaTeacher;
import ex05.teacher.PythonTeacher;
import ex05.teacher.Teacher;

public class App {

    public static void start(Teacher t) {
        t.수업시작();
    }

    public static void main(String[] args) {
        JavaTeacher teacher = new JavaTeacher();
        start(teacher);

        PythonTeacher teacher2 = new PythonTeacher();
        start(teacher2);
    }
}
