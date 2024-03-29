package community.controller;

import java.util.List;
import java.util.Scanner;

import community.model.vo.Member;
import community.service.BoardService;
import community.service.BoardServiceImp;

public class BoardLogin {
	
	private Scanner scan;
	private BoardService boardService;
	
	public BoardLogin(Scanner scan) {
		if(scan == null) {
			scan = new Scanner(System.in);
		}
		this.scan = scan;
		boardService = new BoardServiceImp();
	}

	public void run() {
		System.out.println("---로그인---");
		System.out.print("아이디 : ");
		String id = scan.next();
		System.out.print("비밀번호 : ");
		String pw = scan.next();
		memberMain(id, pw);
	}
	
	public void memberMain(String id, String pw) {
		List<Member> memberList = boardService.getMember();
		for(Member i:memberList) {
			if(id.equals("admin")) {
				if(pw.equals("admin"));
				MemberController memberController = new MemberController();
				memberController.adminMenu();
				return;
			}
			
			if(id.equals(i.getMe_id())) {
				if(pw.equals(i.getMe_pw())) {
					System.out.println("로그인 성공");
					System.out.println("반갑습니다. " + i.getMe_name() + " 님");
					ViewBoard viewBoard = new ViewBoard(scan);
					viewBoard.run(i.getMe_id());
					return;
				}
			}
		}
		System.out.println("로그인 실패");
	}

}




