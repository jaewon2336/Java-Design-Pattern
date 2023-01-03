package ex07;

public class DBFactory {

    // 싱글톤 패턴
    private static DBFactory dbFactory = new DBFactory();

    private DBFactory() {
    }

    public static DBFactory getInstance() {
        return dbFactory;
    }

    // OCP 위배! -> mysql이 추가되면 기존 코드를 수정해아하니까!
    // OCP를 위배하면 프로그램을 잘못만든 것이라고 생각할 필요는 없다.
    // 패턴은 우리가 코드를 짤 때, 편하게 협업하고 클린한 코드를 짜게 해주는 수단일 뿐이고 예외는 존재한다.
    // DB 회사가 매일 변하거나 새로운 드라이버가 금방 나오지 않는다. 몇 년에 한 번 나오고, 그때 한 번 수정하면 된다.
    public DB createDB(String protocol) {
        if (protocol.equals("maria")) {
            DB mariaDB = new MariaDB();
            mariaDB.setUrl("jdbc:mariadb://");
            return mariaDB;
        } else if (protocol.equals("oracle")) {
            DB oracleDB = new OracleDB();
            oracleDB.setUrl("jdbc:oracle:thin//");
            return oracleDB;
        } else if (protocol.equals("mysql")) {
            DB mysqlDB = new MySqlDB();
            mysqlDB.setUrl("jdbc:mysqldb://");
            return mysqlDB;
        } else {
            throw new NullPointerException("db driver not found exception");
        }
    }
}
