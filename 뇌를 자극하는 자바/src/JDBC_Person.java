// ��Ű��
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Person {
		
	String jumincd = null;
	String pname   = null;
	String gender  = null;
	int age = 0;
	
	public Person() // �⺻ ������ 
	{
		this.jumincd  = "�ֹι�ȣ �Է� ����";
		this.pname    = "�̸� �Է� ����";
		this.gender   = "���� �Է� ����";
		this.age      = 0;
	}
	
	public String getJumincd() {
		return jumincd;
	}
	public void setJumincd(String jumincd) {  // "800511-1574310"
		this.jumincd = jumincd;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class JDBC_Person {
	
    public static void main(String args[]) {

    	Person[] persons = new Person[3]; //  �迭��ü 
  
    	for(int i=0; i<persons.length; i++) {
    		persons[i] = new Person();  // ������ ȣ���Ͽ� �迭���۷��� ����
    	}
    	    	
//    	for(int i=0; i<persons.length; i++) {
//    		
//    		System.out.println("�ֹι�ȣ:" + persons[i].getJumincd() );
//    		System.out.println("�̸�:"     + persons[i].getPname() );
//    		System.out.println("����:"     + persons[i].getGender() );
//    		System.out.println("����:"     + persons[i].getAge() );
//    	}
    	
    	
    	
//    	Person person;          // ���۷��� ���� ����
//    	person = new Person();	// ��ü ����  - new ������(������) �̿�
    	
    	// person��ü�� ����ʵ带 ����
//    	person.setJumincd("800511-1574310");
//    	person.setPname("ȫ�浿");
//    	person.setGender("����");
//    	person.setAge(20);

//    	int age = person.getAge();
//    	System.out.println(age);
//    	
//    	System.out.println(person.getAge());
    	
//    	System.out.println(person.jumincd);
//    	System.out.println(person.pname);
//    	System.out.println(person.gender);
//    	System.out.println(person.age);
        
    	// ���ٷ� Person person = new Person();
    	
    	    	
    	//////////////    JDBC �������  //////////////   
    	// 1�ܰ�: DB ������ ���� Ŀ�ؼ� �������̽� 
    	Connection conn = null;
    	// Statement �������̽� - SQL ����.
    	Statement stmt = null;
    	// ResultSet �������̽� - SQL ����� ����
    	ResultSet rs = null;
    	
        // try ~ catch ������ DB�����߿� ���ܰ� �߻��ϴ����� �˻�.
    	try {
//    		String jumincd = null;
//    		String pname   = null;
//    		String gender  = null;
    		int age = 0;
        	// 2�ܰ�: JDBC����̹��� �ε��Ѵ�.
            Class.forName("com.mysql.jdbc.Driver");
            // 3�ܰ�: ����̹��Ŵ��� Ŭ������ getConnection�޼ҵ�� DB�� �����Ѵ�.
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "12345");
            System.out.println("�����ͺ��̽��� �����߽��ϴ�.");
            
            // Ŀ�ؼ� ��ü�� Statement ��ü�� ����
            stmt = conn.createStatement();           
            // DML SQL���� ������ ����� ����
            rs = stmt.executeQuery("select jumincd, pname,	gender, age  from person");
            
            System.out.println("�ֹι�ȣ         �̸�      ����    ����");
            int i = 0;
            while(rs.next()) {
            
            	persons[i].setJumincd(rs.getString(1));
            	persons[i].setPname(rs.getString(2));
            	persons[i].setGender(rs.getString(3));
            	persons[i].setAge(rs.getInt(4));
            	
            	i++;
            	//jumincd = rs.getString(1); //rs.getString("jumincd");
            	//pname   = rs.getString(2); //rs.getString("pname");
            	//gender  = rs.getString(3); //rs.getString("gender");
            	//age        = rs.getInt(4);    //rs.getInt("age");
            
            	//System.out.println(jumincd + "---" + pname + "-------" + gender + "-------" + age);
            }
            // 4�ܰ�: DB������ �����Ѵ�.
            conn.close();
            System.out.println("============================================================");
        	
            for(i=0; i<persons.length; i++) {
    		
    			System.out.println("�ֹι�ȣ:" + persons[i].getJumincd() );
    			System.out.println("�̸�:"     + persons[i].getPname() );
    			System.out.println("����:"     + persons[i].getGender() );
    			System.out.println("����:"     + persons[i].getAge() );
    			 System.out.println("============================================================");
    		}
           
            //System.out.println(jumincd + "---" + pname + "-------" + gender + "-------" + age);
        }
        catch (ClassNotFoundException cnfe) {
            System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + 
                               cnfe.getMessage());
        }
        catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    	
    	//////////////JDBC ��������  //////////////
   	
    }
}
