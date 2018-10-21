package com.zekoliu.core.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.zekoliu.core.po.User;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String uri = request.getRequestURI();
		//判断是否是登陆请求
		if (uri.indexOf("/login.action") > 0) {
			return true;
		}
		
		//判断session中是否有用户的数据
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("USER_SESSION");
		if (user != null) {
			return true;
		}
		
		request.setAttribute("msg", "你还没有登陆，请先登陆！");
		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
		return false;
	}
}
