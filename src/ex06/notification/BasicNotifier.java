package ex06.notification;

// Rapper가 없는 Decorator
public class BasicNotifier implements Notifier {

    // BasicNotifier가 의존하는게 있으면 끝이 없어진다

    @Override
    public void send() {
        System.out.println("기본 알림");
    }
}