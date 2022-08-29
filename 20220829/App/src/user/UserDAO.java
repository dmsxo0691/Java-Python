package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {

    private Connection conn; // 자바와 데이터베이스를 연결해주는 라이브러리
    private PreparedStatement pstmt; // 쿼리문 대기 및 설정
    private ResultSet rs; // 결과값 받아오기

    public UserDAO() {
        try {
            String dbURL = "jdbc:mariadb://localhost:3306/bbs";
            String dbID = "root";
            String dbPassword = "123456";
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
