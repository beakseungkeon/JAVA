package community.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import community.dao.MemberDAO;
import community.model.vo.Board;
import community.model.vo.Category;
import community.model.vo.MemberVO;

public class MemberServiceImp implements MemberService {
	private MemberDAO memberDao;
	public MemberServiceImp() {
		String resource = "community/config/community.xml";
		
		InputStream inputStream;
		SqlSession session;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			session = sessionFactory.openSession(true);
			memberDao = session.getMapper(MemberDAO.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public boolean addMember(MemberVO member) {
		if(member ==null 
				|| member.getId()==null
				|| member.getPw()==null
				|| member.getEmail()==null
				|| member.getNickname()==null) {
			return false;
		}
		return memberDao.addMember(member);
	}
	@Override
	public ArrayList<MemberVO> getMemberList(String email) {
		
		return memberDao.selectMemberList(email);
	}
	@Override
	public ArrayList<MemberVO> getMemberListid(String id) {
		// TODO Auto-generated method stub
		return memberDao.selectMemberListid(id);
	}
	@Override
	public boolean deleteUser(String id) {
		// TODO Auto-generated method stub
		return memberDao.deleteUser(id);
	}
	@Override
	public boolean addTitle(String title) {
		// TODO Auto-generated method stub
		return memberDao.addTitle(title);
	}
	@Override
	public ArrayList<Category> getMemberListCa(String title) {
		// TODO Auto-generated method stub
		return memberDao.selectMemberListCa(title);
	}
	@Override
	public boolean deleteCa(String title) {
		// TODO Auto-generated method stub
		return memberDao.deleteCa(title);
	}
	@Override
	public ArrayList<Board> getMemberListBo(String title) {
		// TODO Auto-generated method stub
		return memberDao.selectMemberListBo(title);
	}
	@Override
	public boolean deleteBo(String title) {
		// TODO Auto-generated method stub
		return memberDao.deleteBo(title);
	}
	@Override
	public boolean addTitleBo(String title, String ca_title) {
		// TODO Auto-generated method stub
		return memberDao.addTitleBo(title,ca_title);
	}
	
	
	
	
	

}
