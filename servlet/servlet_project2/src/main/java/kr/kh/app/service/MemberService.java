package kr.kh.app.service;

import kr.kh.app.model.dto.loginDTO;
import kr.kh.app.model.vo.MemberVO;

public interface MemberService {

	boolean signup(MemberVO member);

	MemberVO getMember(loginDTO loginDto);

}