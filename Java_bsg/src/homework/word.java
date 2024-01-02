package homework;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class word implements Serializable {
	private String word,wordClass,mean;
	
}
