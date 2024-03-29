package community.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import community.model.vo.Board;
import community.model.vo.Category;
import community.model.vo.Comment;
import community.model.vo.Member;
import community.model.vo.Post;

public interface BoardDAO {

	List<Member> getMember();

	boolean insertMember(@Param("member")Member member);

	List<Category> getCategory();

	List<Post> getMyPost(String me_id);

	List<Comment> getMyComment(String me_id);

	List<Board> getBoard(String ca_title);

	List<Post> getPost(@Param("bo_num")int bo_num, @Param("postListNum")int postListNum, @Param("postListNum5")int postListNum5);

	List<Post> getDetailPost(int num);

	String getName(String name);

	void updateView(int num);

	boolean insertPost(@Param("post")Post post);

	boolean insertComment(@Param("comment")Comment comment);

	List<Comment> getCommentList(int co_po_num);

	
}
