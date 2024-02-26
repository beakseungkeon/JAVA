package community.service;

import java.util.ArrayList;
import java.util.List;

import community.model.vo.Board;
import community.model.vo.Category;
import community.model.vo.Member;
import community.model.vo.Post;

public interface MemberService {

	boolean addMember(Member member);

	ArrayList<Member> getMemberList(String email);

	ArrayList<Member> getMemberListid(String id);

	boolean deleteUser(String id);

	boolean addTitle(String title);

	

	boolean deleteCa(String title);

	ArrayList<Board> getMemberListBo(String title);

	boolean deleteBo(String title);

	



	boolean addTitleBo(Board board);

	boolean addTitlePo(String bo_title, String ca_title, Post post);

	boolean deletePo(String po_title, String bo_title, String ca_title);

	

	boolean updatePo(String bo_title, String ca_title, Post post);

	ArrayList<Category> getMemberListCa(String ca_title);

	ArrayList<Post> getMemberListPo(String po_title);

	boolean deleteCo(String po_title, String bo_title, String ca_title, int co_num);

	

	

	




}
