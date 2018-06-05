package com.kosea.kmove30;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisTest {
	
	public static void main(String[] args) {
			
		String resource = "mybatis-config.xml"; // src 경로 
			
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);		
			SqlSession session = sqlSessionFactory.openSession();
			
			try {
				// Member member = new Member();
				Member member = (Member)session.selectOne("org.mybatis.example.SelectMapper.selectMember", 101);
				
				System.out.println("회원 아이디: " + member.getId());
				
			} finally {
			  session.close();
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
