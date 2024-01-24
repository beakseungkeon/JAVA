package word;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

//영어 단어의 뜻을 의미하는 클래스로, 품사와 뜻이 멤버로 가짐
@Data
@AllArgsConstructor
public class mean implements Serializable {

		/**
	 * 
	 */
	
	private static final long serialVersionUID = -3233074821576576980L;
	//직렬화 할 때 serialVersionUID가 일치하는 경우만 읽엉오도록  하기 위해 값을 지정
	//[명사]사과 형태로 출력하기 위해 재정의
		private String partOfSpeech;
		private String mean;
		@Override
		public String toString() {
			return "["+partOfSpeech+"]" + mean;
		}
		public mean(String mean) {
			
			this.mean = mean;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			mean other = (mean) obj;
			return Objects.equals(mean, other.mean);
		}
		@Override
		public int hashCode() {
			return Objects.hash(mean);
		}
		
		
		
		
}









