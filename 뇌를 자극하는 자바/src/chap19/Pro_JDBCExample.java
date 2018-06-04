package chap19;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Pro_JDBCExample {
    public static void main(String args[]) {
    	
    	String driver = null;
    	String url = null;
    	String username = null;
    	String password = null;
    	
		try {
			// db.properties 파일 위치
			String propFile = "db.properties";

			// 프로퍼티 객체 생성
			Properties props = new Properties();

			// 프로퍼티 파일 스트림에 담기
			FileInputStream fis = new FileInputStream(propFile);

			// 프로퍼티 파일 로딩
			props.load(new java.io.BufferedInputStream(fis));

			// 드라이버 읽기
			driver   = props.getProperty("jdbc.driver");
			url      = props.getProperty("jdbc.url");
			username = props.getProperty("jdbc.username");
			password = props.getProperty("jdbc.password");			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	   	
    	// 1단계: DB 연결을 위한 커넥션 인터페이스 
    	Connection conn = null;

        // try ~ catch 문에서 DB연결중에 예외가 발생하는지를 검사.
    	try {
        	// 2단계: JDBC드라이버를 로드한다.
            //Class.forName("com.mysql.jdbc.Driver");
    		if (driver != null) {
    		    Class.forName(driver) ;
    		}
    		
            // 3단계: 드라이버매니져 클래스는 getConnection메소드로 DB를 연결한다.
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("DB접속.");
            
            // 4단계: DB연결을 종료한다.
            conn.close();
        }
        catch (ClassNotFoundException cnfe) {
            System.out.println("해당 클래스를 찾을 수 없습니다." + 
                               cnfe.getMessage());
        }
        catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }
	
}
