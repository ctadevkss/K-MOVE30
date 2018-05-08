// ��Ű��
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class JDBC_Insert {
    public static void main(String args[]) {
    	
    	// 1�ܰ�: DB ������ ���� Ŀ�ؼ� �������̽� 
    	Connection conn = null;
    	Statement stmt = null;
    	
        // try ~ catch ������ DB�����߿� ���ܰ� �߻��ϴ����� �˻�.
   	 	try {
        	// 2�ܰ�: JDBC����̹��� �ε��Ѵ�.
            Class.forName("com.mysql.jdbc.Driver");
            // 3�ܰ�: ����̹��Ŵ��� Ŭ������ getConnection�޼ҵ�� DB�� �����Ѵ�.
            conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/mysql", "root", "12345");
            System.out.println("�����ͺ��̽��� �����߽��ϴ�.");
            
            
            //  DB SQL �۾�
            stmt = conn.createStatement();
            String sql = "INSERT INTO person ( jumincd, pname, gender, age)" + 
            		"values('7706301869653'	,	'��������2'	,	'm',  42	);";
            int chageRecord = stmt.executeUpdate(sql);
                        
            
            // 4�ܰ�: DB������ �����Ѵ�.
            conn.close();
            System.out.println(chageRecord + "���� �Է�(�߰�) �Ǿ����ϴ�.");
        }
        catch (ClassNotFoundException cnfe) {
            System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + 
                               cnfe.getMessage());
        }
        catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }
}
