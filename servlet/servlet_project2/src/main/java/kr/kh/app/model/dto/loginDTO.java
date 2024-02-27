package kr.kh.app.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class loginDTO {
	private String id;
	private String pw;
	public loginDTO(String id, String pw) {
		this.id=id;
		this.pw=pw;
		
	}
}
