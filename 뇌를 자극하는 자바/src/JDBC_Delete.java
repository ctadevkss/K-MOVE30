// 패키지
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class JDBC_Delete {
    public static void main(String args[]) {
    	
    	// 1단계: DB 연결을 위한 커넥션 인터페이스 
    	Connection conn = null;
    	Statement stmt = null;
    	
        // try ~ catch 문에서 DB연결중에 예외가 발생하는지를 검사.
   	 	try {
        	// 2단계: JDBC드라이버를 로드한다.
            Class.forName("com.mysql.jdbc.Driver");
            // 3단계: 드라이버매니져 클래스는 getConnection메소드로 DB를 연결한다.
            conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/mysql", "root", "12345");
            System.out.println("데이터베이스에 접속했습니다.");
            
            
            //  DB SQL 작업
            stmt = conn.createStatement();
            String sql = "delete from person where pname = '" +  args[0] + "'" ;
                       // delete from person where pname = '홍길동';
            int chageRecord = stmt.executeUpdate(sql);
            
            
            
            // 4단계: DB연결을 종료한다.
            conn.close();
            
            if(changeRecord > 0)
            	System.out.println(changeRecord + "건이 삭제 되었습니다.");
            else
            	System.out.println("삭제된 데이터는 없습니다.");
            
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
