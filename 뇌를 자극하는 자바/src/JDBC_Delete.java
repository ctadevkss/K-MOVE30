// ��Ű��
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class JDBC_Delete {
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
            String sql = "delete from person where pname = '" +  args[0] + "'" ;
                       // delete from person where pname = 'ȫ�浿';
            int chageRecord = stmt.executeUpdate(sql);
            
            
            
            // 4�ܰ�: DB������ �����Ѵ�.
            conn.close();
            
            if(changeRecord > 0)
            	System.out.println(changeRecord + "���� ���� �Ǿ����ϴ�.");
            else
            	System.out.println("������ �����ʹ� �����ϴ�.");
            
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
