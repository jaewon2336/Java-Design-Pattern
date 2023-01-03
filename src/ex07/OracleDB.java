package ex07;

public class OracleDB implements DB {

    private String url;

    public int execute(String sql) {
        if (url == null) {
            throw new NullPointerException("db driver not found Exception");
        }

        if (sql.equals("select")) {
            System.out.println("query execute : " + url + sql);
            return 1;
        } else {
            System.out.println("query fail : syntax error");
            return -1;
        }
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
