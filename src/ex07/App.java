package ex07;

public class App {
    public static void main(String[] args) {
        // 1. 싱글톤 제작
        DBFactory dbFactory = DBFactory.getInstance();

        // 2. 내가 MariaDB 객체를 알 필요가 없음
        // 3. setUrl과 execute 순서를 생각할 필요가 없음
        // 4. 문자열만 추가해서 DB 생성하면 됨
        // 5. 내가 알아야 할 것은 DBFactory 뿐!
        DB mariaDB = dbFactory.createDB("maria");
        mariaDB.execute("select");

        DB mysqlDB = dbFactory.createDB("mysql");
        mysqlDB.execute("select");
    }
}
