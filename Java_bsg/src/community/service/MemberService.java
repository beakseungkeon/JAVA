package community.service;

import java.util.ArrayList;
import java.util.List;

import community.model.vo.Board;
import community.model.vo.Category;
import community.model.vo.MemberVO;

public interface MemberService {

	boolean addMember(MemberVO member);

	ArrayList<MemberVO> getMemberList(String email);

	ArrayList<MemberVO> getMemberListid(String id);

	boolean deleteUser(String id);

	boolean addTitle(String title);

	ArrayList<Category> getMemberListCa(String title);

	boolean deleteCa(String title);

	ArrayList<Board> getMemberListBo(String title);

	boolean deleteBo(String title);

	boolean addTitleBo(String title, String ca_title);

	

	

	




}
