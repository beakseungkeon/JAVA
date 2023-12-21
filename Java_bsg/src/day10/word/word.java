package day10.word;

public class word {
	private String word,mean;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}
	public void update(String mean) {
		this.mean=mean;
	}
	public void print() {
		System.out.println(word+":"+mean);
	}
	public word(String word, String mean) {
		super();
		this.word = word;
		this.mean = mean;
		
	}
	public boolean equals(String word) {
		return word.equals(word);
	}
	
}
