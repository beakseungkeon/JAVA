package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import lombok.Data;

@Data
public class WordManager {
	private ArrayList<Word>list=new ArrayList<Word>();
	Stream<Word> stream=list.stream();
	public boolean insertWord(Word word) {
		if(list.contains(word)) {
			return false;
		}
		
		list.add(word);
		
		
		
		return true;
	}
	
	
	public void deleteWord(String Word) {
		
              list.stream()
              .filter(u->u.getWord().equals(Word))
              .collect(Collectors.toList())
              .forEach(li->{list.remove(li);
              });
              

	}
	





public void printWord() {
		
		list.forEach(s->System.out.println(s));
	}
public void setList(ArrayList<Word>lit) {
	if(list == null) {
		return;
	}
	this.list=list;
}
	

	
	
}

