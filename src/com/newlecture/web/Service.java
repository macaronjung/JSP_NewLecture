package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Service
 */
@WebServlet("/Service")
public class Service extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		/*getParameter : 사용자가 전달할때 쿼리값(QueryString)을 심어서 전달시
		 * 쿼리의 키워드를 읽을 수 있음 -> 이름이 서버와 합이 맞아야됨!!!
		 * 문자열만 사용가능하기 때문에 정수로 변환시킴*/
		int cnt = Integer.parseInt(request.getParameter("cnt"));
		/*무조건 오류나는 구조
		 * 이유 : 무턱대고 cnt라고 하는 값을 받게 되어있음
		 * 그러나 쿼리값이 전달이 되지 않았음!!!(페이지 주소 참고)
		 * 쿼리값(주소 + ?cnt=원하는 횟수) 입력필요*/
		
		for(int i=0; i<cnt; i++) {
			out.println((i+1) + " : 안녕 서블릿~~~!<br/>");
		}
	}


}
