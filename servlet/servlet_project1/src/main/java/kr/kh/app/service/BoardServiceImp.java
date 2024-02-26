package kr.kh.app.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kr.kh.app.dao.BoardDAO;
import kr.kh.app.dao.MemberDAO;
import kr.kh.app.model.vo.BoardVO;
import kr.kh.app.model.vo.CommunityVO;

public class BoardServiceImp implements BoardService{
	private BoardDAO boardDao;
	public BoardServiceImp() {
		String resource = "kr/kh/app/config/mybatis-config.xml";
		
		InputStream inputStream;
		SqlSession session;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			session = sessionFactory.openSession(true);
			boardDao = session.getMapper(BoardDAO.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public boolean insertBoard(BoardVO board) {
		if(board==null||board.getBo_title()==null||board.getBo_title().length()==0) {
			return false;
		}
		if(board.getBo_me_id()==null) {
			return false;
		}
		if(board.getBo_content()==null) {
			return false;
		}
		return boardDao.insertBoard(board);
	}
	@Override
	public ArrayList<CommunityVO> getCommunityList() {
		// TODO Auto-generated method stub
		return boardDao.selectCommunityList();
	}
	@Override
	public ArrayList<BoardVO> getBoardList() {
		// TODO Auto-generated method stub
		return boardDao.selectBoardList();
	}
}
