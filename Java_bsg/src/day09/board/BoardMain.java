package day09.board;

import java.util.Scanner;

import day08.student;
 
public class BoardMain {
	static Scanner scan = new Scanner(System.in);
	static board board[] = new board[1];
	static int num=0;
	static int num2=0;
	static int viewCount=0;
	static int count=0;
	public static void main(String[] args) {
		
		/*게시판에서 게시글 관리를 위한 콘솔 프로그램 작성하세요
		  * -제한사항 정리
		  * 게시판은 1개
		  * 로그인, 회원가입 구현 x=> 게시글 작성 시 아이디를 입력
		  * 게시글 제목과 내용은 한줄만 가능
		  * 작성일을 입력 
		  * 1.필요한 기능을 정리해서 메뉴로 출력
		  * 메뉴
		  * 1.게시글 목록 조회
		  * 2.게시글 등록
		  * 3.프로그램 종료
		  * 메뉴 선택:1
		  * 
		  * 게시글 목록
		  * 2.가입인사 2023-12-20 asd 2
		  * 1.공지 2023-12-19 admin 3

		  * 메뉴
		  * 	1.게시글 상세 조회
		  * 	2.게시글 수정
		  * 	3.게시글 삭제
		  * 	4.뒤로가기
		  * 	메뉴 선택:2
		  * 
		  * 	수정할 게시글 번호:2
		  * 	제목: 가입인사입니다.
		  * 	내용:만나서 반갑습니다.
		  * 	수정이 완료됐습니다.
		  * 
		  *  게시글 목록
		  * 2.가입인사입니다.2023-12-20 asd 2
		  * 1.공지 2023-12-19 admin 3

		  * 메뉴
		  * 	1.게시글 상세 조회
		  * 	2.게시글 수정
		  * 	3.게시글 삭제
		  * 	4.뒤로가기
		  * 	메뉴 선택:3
		  * 	삭제할 게시글 번호:1
		  * 	게시글이 삭제됐습니다.
		  * 메뉴
		  * 	1.게시글 상세 조회
		  * 	2.게시글 수정
		  * 	3.게시글 삭제
		  * 	4.뒤로가기
		  * 	메뉴 선택:4
		  * 메뉴
		  * 1.게시글 목록 조회
		  * 2.게시글 등록
		  * 3.프로그램 종료
		  * 메뉴 선택:2
		  * 제목:테스트
		  * 내용:테스트
		  * 일자:2023-12-20
		  * 아이디:qwe
		  * 등록이 완료됐습니다.
		  * 
		  * 2.기능 구현*/
		
		
		
		//반복문
		int menu;
		
		do {
			printMenuMain();
			menu=scan.nextInt();
			runMenu(menu);
			
		}while(menu!=3);
			
		
			//메뉴 선택
		
		
		
		
		
		
			//선택한 기능 실행
		/**
		 * 
		 * @param printMenuMain
		 */
	}
	private static void printMenuMain() {
		//메뉴
		System.out.println("--------메뉴--------");
		  // 1.게시글 목록 조회
		System.out.println("1.게시글 목록 조회");
		  // 2.게시글 등록
		System.out.println("2.게시글 등록");
		  // 3.프로그램 종료
		System.out.println("3.프로그램 종료");
		
		System.out.println("------------------");
		
		System.out.println("메뉴 선택:");
	}
	public static void runMenu(int menu) {
		
		switch(menu) { 
		case 1:
			/*게시글 목록
			 * 
			  * 2.가입인사 2023-12-20 asd 1
			  	
			  * 1.공지 2023-12-19 admin 3
			  * 메뉴
			  * 	1.게시글 상세 조회
			  * 	2.게시글 수정
			  * 	3.게시글 삭제
			  * 	4.뒤로가기
			  * 	메뉴 선택:1
			  * 	조회할 게시글 번호:2
			  * 	번호 :2
			  * 	제목:가입인사
			  * 	내용:안녕하세요.
			  * 	일자:2023-12-20
			  * 	작성자:asd
			  * 	조회수:2*/
			System.out.println("게시글 목록");
			
			for(int i=count;i>0;i--) {
			board[i-1].printInfo();
			}
			System.out.println("1.게시글 상세 조회");
			System.out.println("2.게시글 수정");
			System.out.println("3.게시글 삭제");
			System.out.println("4.뒤로가기");
			System.out.println("메뉴 선택:");
			num2=scan.nextInt();
			runMenu2(num2);
			
			
			break;
		case 2:
			
			board[count]=new board(1, "1", "1", "1", "1");
			
			System.out.print("제목:");
			board[count].setTitle(scan.next());
			System.out.print("내용:");
			board[count].setStory(scan.next());
			System.out.print("일자:");
			board[count].setDate(scan.next());
			System.out.print("아이디:");
			board[count].setId(scan.next());
			System.out.println("등록이 완료됐습니다.");
			board[count].setNum(num+1);
			num++;
			count++;
			board[] tmpList=new board[board.length+1];
			System.arraycopy(board, 0, tmpList, 0, count);
			board=tmpList;
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
		
	}
	public static void runMenu2(int num2) {
		switch(num2) {
		case 1:
			System.out.println("조회할 게시글 번호:");
			num=scan.nextInt();
			board[num-1].printInfoDetail();
			viewCount++;
			board[num-1].setView(viewCount);
			break;
		case 2:System.out.println("수정할 게시글 번호:");
				num=scan.nextInt();
				System.out.println();
				System.out.println("제목수정:");
				String title1=scan.next();
				System.out.println("내용수정:");
				String story1=scan.next();
				board[num-1].update(title1, story1);
				
				
			break;
		case 3:
			int removeIndex=0;
			System.out.println("삭제할 번호 선택");
			removeIndex=scan.nextInt();
			for(int i=0;i<count-1;i++) {
				if(board[i].getNum()==removeIndex) {
					for(int j=i;i<count-1;i++) {
						board[i]=board[i+1];
						
						
					}
				}
				
				
			}
			board[] tmpList=new board[board.length-1];
			System.arraycopy(board, 0, tmpList, 0, count);
			board=tmpList;
			
			count--;
			break;
			
		case 4:System.out.println("이전으로 돌아갑니다.");
			break;
		}
	}
	
	
}
