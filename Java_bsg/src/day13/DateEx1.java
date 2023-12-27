package day13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

public class DateEx1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date);
		
		//Date=>String
		//화면에 보여줄 시간 패턴을 문자열로 지정
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str=format.format(date);
		System.out.println(str);
		
		Date date2=format.parse(str);
		System.out.println(date2);
		
		Board board=new Board("제목","내용",new Date());
		System.out.println(board.getRegDate());
		Board board2=new Board("제목2","내용",null);
		board.setRegDate="2023-12-27 18:00:00";
	}

}
@AllArgsConstructor
@Data
class Board{
	String title,contents;
	
	
	Date setregDate;
	public void setRegDate(String str) {
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			regDate=format.parse(str);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}
}
