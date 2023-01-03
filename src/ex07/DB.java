package ex07;

public interface DB {

    // 쿼리 실행 메서드
    public int execute(String sql);

    // URL 세팅 메서드
    public void setUrl(String url);
}
