package com.kosea.kmove30;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

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
				///// 전체 조회 //////
				List<Member> memberList = new ArrayList<Member>(); 
				memberList = session.selectList("org.mybatis.example.MemberMapper.selectAllMember");
				
				for(Member member : memberList) {
					String logMessage = member.getId().toString() + " " + 
				                        member.getPass().toString() + " " +
				                        member.getMno();
					//System.out.println(member.getId() + " " + member.getPass() + " " + member.getMno());
					member.printLog(logMessage);
				}
						
				///// 조회 시작 //////
				// Member member = new Member();
				// Member member = (Member)session.selectOne("org.mybatis.example.MemberMapper.selectMember", 101);
				// member.printLog("아이디:" + member.getId() + 
				//		 		 "  패스:" + member.getPass() + 
				//		 		 "  mno: " + member.getMno()); 
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
