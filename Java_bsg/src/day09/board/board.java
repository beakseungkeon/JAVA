package day09.board;

public class board {
	
	  
	private String title,story,date,id;
	private int view,num;
	//게시글정보를 출력(목록 조회),(상세조회),getter와 setter,게시글 수정
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getView() {
		return view;
	}
	
	public void setView(int view) {
		this.view =view;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	/**게시글 목록에서 게시글 정보를 출력하는 메서드
	 * 번호. 제목 작성일 작성자 조회수 순으로 출력
	 */
	public void printInfo() {
		System.out.print(num+". ");
		System.out.print(title+" ");
		System.out.print(date+" ");
		System.out.print(id+" ");
		System.out.print(view+" ");
		System.out.println();
	}
	/**
	 * 게시글 정보를 자세히 출력하는 메서드
	 * 			번호 :num
		  * 	제목:title
		  * 	내용:story
		  * 	일자:date
		  * 	작성자:id
		  * 	조회수:view
		  * 순으로 출력
	 */
	public void printInfoDetail() {
		System.out.println("번호:"+num);
		System.out.println("제목:"+title);
		System.out.println("내용:"+story);
		System.out.println("일자:"+date);
		System.out.println("작성자:"+id);
		System.out.println("조회수:"+view);
	}
	/**
	 * 수정할 제목과 내용이 주어지면 게시글의 제목과 내용을 수정하는 메서드
	 * @param title1 수정할 제목
	 * @param story1 수정할 내용
	 */
	public void update(String title1,String story1) {
		title=title1;
		story=story1;
	}
	
	//생성자:게시글 번호,제목,내용,작성자,게시일이 주어졌을때 처리하는 생성자
	

	public board(int num,String title, String story, String date, String id) {
		super();
		this.title = title;
		this.story = story;
		this.date = date;
		this.id = id;
		this.num = num;
	}
}
