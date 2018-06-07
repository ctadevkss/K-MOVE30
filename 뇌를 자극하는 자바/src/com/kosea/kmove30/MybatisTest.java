package com.kosea.kmove30;

import java.io.InputStream;
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
	
				///// ��ȸ ���� //////
				// Member member = new Member();
				 Member member = (Member)session.selectOne("org.mybatis.example.SelectMapper.selectMember", 101);
	
				System.out.println("ȸ�� ��ȣ: "     + member.getMno());
				System.out.println("ȸ�� ���̵�: "   + member.getId());
				System.out.println("ȸ�� ��й�ȣ: " + member.getPass());
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
