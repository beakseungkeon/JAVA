package kr.kh.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.kh.app.model.vo.MemberVO;
import kr.kh.app.service.MemberService;
import kr.kh.app.service.MemberServiceImp;


@WebServlet("/signup")
public class signupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private MemberService memberService = new MemberServiceImp();  
    public signupServlet() {
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/views/signup.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		System.out.println("전송 받은 id:"+id);
		String pw=request.getParameter("pw");
		System.out.println("전송 받은 pw:"+pw);
		String pwCheck=request.getParameter("pwCheck");
		System.out.println("전송 받은 pwCheck:"+pwCheck);
		String email=request.getParameter("email");
		System.out.println("전송 받은 email:"+email);
		if(memberService.signup(new MemberVO(id,pw,email))) {
			//회원가입에 성공하면 메인 페이지로 이동
			response.sendRedirect(request.getContextPath()+"/");
		}else {
			//실패하면 회원가입 페이지 유지
			doGet(request, response);
		}
	}

}
