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
	
				///// 조회 시작 //////
				// Member member = new Member();
				 Member member = (Member)session.selectOne("org.mybatis.example.SelectMapper.selectMember", 101);
	
				System.out.println("회원 번호: "     + member.getMno());
				System.out.println("회원 아이디: "   + member.getId());
				System.out.println("회원 비밀번호: " + member.getPass());
				///// 조회 종료 //////

				
				///// 추가 시작 //////
				//Member newMember = new Member(104, "testID", "testPASS");
				//System.out.println(newMember);
				//int insertConut = session.insert("org.mybatis.example.SelectMapper.insertMember", newMember);
				//System.out.println("추가 건수: " + insertConut);
				////////////////////////////////			
				/*				
  				Member newMember = new Member();
				newMember.setMno(102);
				newMember.setId("testID");
				newMember.setPass("123333");
				*/
				///// 추가 종료//////
				
				
				///// 수정 시작 //////
				//String queryMapping = "org.mybatis.example.SelectMapper.updateMember";
				//Member member = new Member(103, "HgdID", "HgdPW");
				//int updateConut = session.update(queryMapping, member);
				//System.out.println("수정 건수: " + updateConut);
				///// 수정 종료 //////
				
				
				///// 삭제 //////
				//int deleteConut = session.delete("org.mybatis.example.SelectMapper.deleteMember", 101);
				//System.out.println("삭제 건수: " + deleteConut);

			}catch (Exception e) {
				System.out.println(e.getMessage());
			}finally {
			  session.commit();
			  session.close();
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
