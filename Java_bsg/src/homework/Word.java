package homework;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Word implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7707832945681754218L;
	private String Word,WordClass;
	private ArrayList<String>mean;
	@Override
	public int hashCode() {
		return Objects.hash(Word, WordClass);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		return Objects.equals(Word, other.Word) && Objects.equals(WordClass, other.WordClass);
	}
	@Override
	public String toString() {
		return "Word [Word=" + Word + ", WordClass=" + WordClass + ", mean=" + mean + "]";
	}
	
	
}
