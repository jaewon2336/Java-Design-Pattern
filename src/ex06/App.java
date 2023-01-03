package ex06;

import ex06.notification.BasicNotifier;
import ex06.notification.EmailNotifier;
import ex06.notification.Notifier;
import ex06.notification.SmsNotifier;

/*
 * 데코레이터 패턴 (장식)
 * (A) -> B(A) -> C(B(A))
 */
public class App {
    public static void main(String[] args) {
        // 기본 알림
        // Notifier notifier = new BasicNotifier();
        // notifier.send();
        // System.out.println("__end");

        // 기본 알림 + 이메일 알림
        // Notifier emailNotifier = new EmailNotifier(new BasicNotifier());
        // emailNotifier.send();
        // System.out.println("__end");

        // 기본 알림 + 문자 알림
        // Notifier smsNotifier = new SmsNotifier(new BasicNotifier());
        // smsNotifier.send();
        // System.out.println("__end");

        // 1. 전체 알림 (순서 : 기본 알림 + 이메일 알림 + 문자 알림)
        Notifier allNotifier = new SmsNotifier(new EmailNotifier(new BasicNotifier()));
        allNotifier.send();
        System.out.println("__end");

        // 2. 전체 알림 (순서 : 기본 알림 + 문자 알림 + 이메일 알림)
        Notifier allNotifier2 = new EmailNotifier(new SmsNotifier(new BasicNotifier()));
        allNotifier2.send();
        System.out.println("__end");

        // 3. 전체 알림 (순서 : 기본 알림 + ...)
        Notifier allNotifier3 = new SmsNotifier(new EmailNotifier(new EmailNotifier(new BasicNotifier())));
        allNotifier3.send();
        System.out.println("__end");

        // 이메일 알림
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send();
        System.out.println("__end");

        // 문자 알림
        Notifier smsNotifier = new SmsNotifier();
        smsNotifier.send();
        System.out.println("__end");

        // 문자 알림 + 이메일 알림
        Notifier smsAndEmailNotifier = new EmailNotifier(new SmsNotifier());
        smsAndEmailNotifier.send();
        System.out.println("__end");
    }
}
