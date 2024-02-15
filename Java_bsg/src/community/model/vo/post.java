package community.model.vo;

import lombok.Data;

@Data
public class post {
	public post(String content, String title) {
		this.content=content;
	}
	private String content;
	private String title;
	private int view;
	private String me_id;
	private int bo_num;
	private String me_name;
	
	
}
