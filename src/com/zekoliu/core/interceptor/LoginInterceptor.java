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
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String uri = request.getRequestURI();
		//�ж��Ƿ��ǵ�½����
		if (uri.indexOf("/login.action") > 0) {
			return true;
		}
		
		//�ж�session���Ƿ����û�������
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("USER_SESSION");
		if (user != null) {
			return true;
		}
		
		request.setAttribute("msg", "�㻹û�е�½�����ȵ�½��");
		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
		return false;
	}
}
