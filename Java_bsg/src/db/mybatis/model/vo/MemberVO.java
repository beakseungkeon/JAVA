package db.mybatis.model.vo;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberVO {
	private String id;
	private String pw;
	private String email;
	private Date reg_date;
	
	public MemberVO(String id, String pw, String email) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.pw=pw;
		this.email=email;
		
	}
}
