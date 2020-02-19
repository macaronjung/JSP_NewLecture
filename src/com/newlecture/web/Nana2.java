package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Nana2
 */
@WebServlet("/Nana2")
public class Nana2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*이상한 괴문서로 나옴 -> 브라우저 우클릭->인코딩->utf-8로 변경시 한글 제대로 나옴
		 * 기본적으로 euc-kr로 인코딩되어서 정상적으로 출력 안됨*/
		response.setCharacterEncoding("UTF-8"); //사용자가 보내는 방식을 결정하는 것
		
		//보낸 걸 받았을때 어떻게 해석할 것인가를 설정
		response.setContentType("text/html; charset=utf-8"); 
		
		PrintWriter out = response.getWriter();
		
		for (int i=0; i<100; i++) {
			out.println((i+1) + " : 안녕 서블릿!!! <br/>");
			/*한글이 ???으로 나옴
			 * 이유 : 서버에서 한글을 지원하지 않는 문자코드로 인코딩(유럽 기준 ISO-8859-1 / 1byte로 쪼개서 전송됨)
			 * 한글은 2byte로 쪼개서 보내줘야 함
			 * (서버에서 UTF-8로 인코딩 해서 보냈지만 브라우저가 다른 코드로 잘 못 해석 가능)*/
		}
	}

}
