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
			// db.properties ���� ��ġ
			String propFile = "db.properties";

			// ������Ƽ ��ü ����
			Properties props = new Properties();

			// ������Ƽ ���� ��Ʈ���� ���
			FileInputStream fis = new FileInputStream(propFile);

			// ������Ƽ ���� �ε�
			props.load(new java.io.BufferedInputStream(fis));

			// ����̹� �б�
			driver   = props.getProperty("driver");
			url      = props.getProperty("url");
			username = props.getProperty("username");
			password = props.getProperty("password");			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	   	
    	// 1�ܰ�: DB ������ ���� Ŀ�ؼ� �������̽� 
    	Connection conn = null;

        // try ~ catch ������ DB�����߿� ���ܰ� �߻��ϴ����� �˻�.
    	try {
        	// 2�ܰ�: JDBC����̹��� �ε��Ѵ�.
            //Class.forName("com.mysql.jdbc.Driver");
    		if (driver != null) {
    		    Class.forName(driver) ;
    		}
    		
            // 3�ܰ�: ����̹��Ŵ��� Ŭ������ getConnection�޼ҵ�� DB�� �����Ѵ�.
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("DB ���Ӽ���.");
            
            // 4�ܰ�: DB������ �����Ѵ�.
            conn.close();
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
