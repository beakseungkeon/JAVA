package community.controller;

import java.util.List;
import java.util.Scanner;

import community.model.vo.Member;
import community.service.BoardService;
import community.service.BoardServiceImp;

public class FindPw {
	private Scanner scan;
	private BoardService boardService;
	
	public FindPw(Scanner scan) {
		if(scan == null) {
			scan = new Scanner(System.in);
		}
		this.scan = scan;
		boardService = new BoardServiceImp();
	}
	
	public void run() {
		System.out.println("--비밀번호 찾기--");
		System.out.print("아이디 입력 : ");
		String id = scan.next();
		List<Member> memberList = boardService.getMember();
		
		for(Member i:memberList) {
			if(id.equals(i.getMe_id())) {
				System.out.println("비밀번호 : " + i.getMe_pw());
				return;
			}
		}
		
		System.out.println("입력하신 아이디에 대한 정보가 없습니다.");
	}
	
}
