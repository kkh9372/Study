package kr.co.jboard2.service.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.jboard2.service.CommonService;

public class LoginService implements CommonService {
	 @Override
	public String requestProc(HttpServletRequest req, HttpServletResponse resp) {
		
		return "/user/login.jsp";
}

}