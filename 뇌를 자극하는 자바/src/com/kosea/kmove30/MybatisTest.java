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
			
		String resource = "mybatis-config.xml"; // src ��� 
			
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);		
			SqlSession session = sqlSessionFactory.openSession();
			
			try {
				///// ��ü ��ȸ //////
				List<Member> memberList = new ArrayList<Member>(); 
				memberList = session.selectList("org.mybatis.example.MemberMapper.selectAllMember");
				
				for(Member member : memberList) {
					String logMessage = member.getId().toString() + " " + 
				                        member.getPass().toString() + " " +
				                        member.getMno();
					//System.out.println(member.getId() + " " + member.getPass() + " " + member.getMno());
					member.printLog(logMessage);
				}
						
				///// ��ȸ ���� //////
				// Member member = new Member();
				// Member member = (Member)session.selectOne("org.mybatis.example.MemberMapper.selectMember", 101);
				// member.printLog("���̵�:" + member.getId() + 
				//		 		 "  �н�:" + member.getPass() + 
				//		 		 "  mno: " + member.getMno()); 
				///// ��ȸ ���� //////

				
				///// �߰� ���� //////
				//Member newMember = new Member(104, "testID", "testPASS");
				//System.out.println(newMember);
				//int insertConut = session.insert("org.mybatis.example.SelectMapper.insertMember", newMember);
				//System.out.println("�߰� �Ǽ�: " + insertConut);
				////////////////////////////////			
				/*				
  				Member newMember = new Member();
				newMember.setMno(102);
				newMember.setId("testID");
				newMember.setPass("123333");
				*/
				///// �߰� ����//////
				
				
				///// ���� ���� //////
				//String queryMapping = "org.mybatis.example.SelectMapper.updateMember";
				//Member member = new Member(103, "HgdID", "HgdPW");
				//int updateConut = session.update(queryMapping, member);
				//System.out.println("���� �Ǽ�: " + updateConut);
				///// ���� ���� //////
				
				
				///// ���� //////
				//int deleteConut = session.delete("org.mybatis.example.SelectMapper.deleteMember", 101);
				//System.out.println("���� �Ǽ�: " + deleteConut);

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
