package chap19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.kosea.kmove30.JDBC_Manager;

public class LoginView extends JFrame{
    private MainProcess main;
    private TestFrm testFrm;
   
    private JButton btnLogin;
    private JButton btnInit;
    private JPasswordField passText;
    private JTextField userText;
    private boolean bLoginCheck;
    
    ResultSet rs = null;
   
    public static void main(String[] args) {
        //new LoginView();
    }
 
    public LoginView() {
    	System.out.println("LoginView() 생성자");
    	
        // setting
        setTitle("login");
        setSize(280, 150);
        setResizable(false);
        setLocation(800, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        // panel
        JPanel panel = new JPanel();
        placeLoginPanel(panel);
        add(panel);
        setVisible(true);
    }
   
    public void placeLoginPanel(JPanel panel){
        panel.setLayout(null);     
        JLabel userLabel = new JLabel("ID");
        userLabel.setBounds(10, 10, 80, 25);
        panel.add(userLabel);
       
        JLabel passLabel = new JLabel("PASS");
        passLabel.setBounds(10, 40, 80, 25);
        panel.add(passLabel);
       
        userText = new JTextField("", 20);
        userText.setBounds(100, 10, 160, 25);
        panel.add(userText);
       
        passText = new JPasswordField("", 20);
        passText.setBounds(100, 40, 160, 25);
        panel.add(passText);
       
        passText.addActionListener(new ActionListener() {          
            @Override
            public void actionPerformed(ActionEvent e) {
                //isLoginCheck(userText.getText(), passText.getPassword().toString());        
            }
        });
       
        btnInit = new JButton("Reset");
        btnInit.setBounds(10, 80, 100, 25);
        panel.add(btnInit);
        
        btnInit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userText.setText("");
                passText.setText("");
            }
        });
       
        btnLogin = new JButton("Login");
        btnLogin.setBounds(160, 80, 100, 25);
        panel.add(btnLogin);
        
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	isLoginCheck(userText.getText(), new String(passText.getPassword()));
            }
        });
    }
   
    public void isLoginCheck(String id, String pass){
    	
    	String idCheckQuery = "SELECT id, pass FROM member where id = '" + id + "'";
    	JDBC_Manager jdbcManager = new JDBC_Manager();
    	
    	try {
    		
    		jdbcManager.DBConnection("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=utf8", "root", "12345");
    		rs = jdbcManager.SelectTable(idCheckQuery);
    		if(rs.next()) {  // 아이디가 존재하면 
    			System.out.println(rs.getString(1) + "---" + rs.getString(2));
    			System.out.println("아이디 존재");
    			
    			if(pass.equals(rs.getString("pass"))) {  // 패스워드 비교해서 같다면
    				System.out.println("패스워드 일치");
    				
    				JOptionPane.showMessageDialog(null, "로그인 되었습니다.");
    	            bLoginCheck = true;
    	            	            
    	            if(isLogin()) //로그인 성공이라면 매니져창 뛰우기
    	                main.showFrameTest(); // 메인창 메소드를 이용해 창뛰우기
    	            
    			}else {
    				// 패스워드 틀렸다.
    				JOptionPane.showMessageDialog(null, "패스워드가 틀렸습니다.");
    			}
    		}
    		else {
    			// 아이디가 없음
    			JOptionPane.showMessageDialog(null, "아이디가 존재하지 않습니다.");
    		}
    	}
    	catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
    
    // mainProcess와 연동
    public void setMain(MainProcess main) {
        this.main = main;
    }
    
    public boolean isLogin() {     
        return bLoginCheck;
    }

}