package homework;

import java.util.ArrayList;

import lombok.Data;

@Data
public class WordManager {
	private ArrayList<Word>list=new ArrayList<Word>();
	public boolean insertWord(Word word) {
		if(list.contains(word)) {
			return false;
		}
		
		list.add(word);
		//학년 반 번호 순으로 정렬
		
		return true;
	}
	
	
		
	
public void printAll() {
		
		list.stream().forEach(s->System.out.println(s));
	}
public void setList(ArrayList<Word>lit) {
	if(list == null) {
		return;
	}
	this.list=list;
}
	
	
	
	
}
