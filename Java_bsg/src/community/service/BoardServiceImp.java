package community.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import community.dao.BoardDAO;
import community.model.vo.Board;
import community.model.vo.Category;
import community.model.vo.Comment;
import community.model.vo.Member;
import community.model.vo.Post;

public class BoardServiceImp implements BoardService {

	private BoardDAO boardDao;
	
	public BoardServiceImp() {
		String resource = "community/config/mybatis-config.xml";
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
	public List<Member> getMember() {
		return boardDao.getMember();
	}

	@Override
	public boolean insertMember(Member member) {
		if(member == null) {
			return false;
		}
		return boardDao.insertMember(member);
	}

	@Override
	public List<Category> getCategory() {
		return boardDao.getCategory();
	}

	@Override
	public List<Post> getMyPost(String me_id) {
		return boardDao.getMyPost(me_id);
	}

	@Override
	public List<Comment> getMyComment(String me_id) {
		return boardDao.getMyComment(me_id);
	}

	@Override
	public List<Board> getBoard(String ca_title) {
		return boardDao.getBoard(ca_title);
	}

	@Override
	public List<Post> getPost(int bo_num, int postListNum, int postListNum5) {
		return boardDao.getPost(bo_num, postListNum, postListNum5);
	}

	@Override
	public List<Post> getDetailPost(int num) {
		return boardDao.getDetailPost(num);
	}

	@Override
	public String getName(String name) {
		return boardDao.getName(name);
	}

	@Override
	public void updateView(int num) {
		boardDao.updateView(num);
	}

	@Override
	public boolean insertPost(Post post) {
		if(post == null) {
			return false;
		}
		return boardDao.insertPost(post);
	}

	@Override
	public boolean insertComment(Comment comment) {
		if(comment == null) {
			return false;
		}
		return boardDao.insertComment(comment);
	}

	@Override
	public List<Comment> getCommentList(int co_po_num) {
		return boardDao.getCommentList(co_po_num);
	}
	
}
