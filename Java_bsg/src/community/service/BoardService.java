package community.service;

import java.util.List;

import community.model.vo.Board;
import community.model.vo.Category;
import community.model.vo.Comment;
import community.model.vo.Member;
import community.model.vo.Post;

public interface BoardService {

	//등록되어 있는 멤버들의 정보를 가져옴
	List<Member> getMember();

	boolean insertMember(Member member);

	List<Category> getCategory();

	List<Post> getMyPost(String me_id);

	List<Comment> getMyComment(String id);

	List<Board> getBoard(String ca_title);

	List<Post> getPost(int bo_num, int postListNum, int postListNum5);

	List<Post> getDetailPost(int num);

	String getName(String name);

	void updateView(int num);

	boolean insertPost(Post post);

	boolean insertComment(Comment comment);

	List<Comment> getCommentList(int co_po_num);

}
