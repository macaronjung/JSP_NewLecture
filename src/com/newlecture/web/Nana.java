package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class Nana extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("hello~~");
		
		for (int i=0; i<100; i++) {
			out.println((i+1) + " : Hiiiii Servlet!!!");
			/*클라이언트는 웹 문서로 받기 때문에 원래 내려쓰기가 되어서는 안됨!!!
			 * 크롬은 자동으로 내려쓰기 / 익스나 기본 웹 페이지는 내려쓰기 안된상태(소스는 내려쓰기 된 상태)*/
		}
		
			for (int k=0; k<10; k++) {
				out.println((k+1) + " : Hello Servlet!!!" + "<br>");
				/*여기서는 내려쓰기가 되지만 크롬에서는 <br> 코드까지 보임
				 * 이유 : 브라우저가 컨텐츠 형식을 자의적으로 해석해버려서
				 * 보낸 내용이 어떤 형식인지 알려줘야 함!!!
				 * 익스는 html로 해석 / 크롬은 text로 해석*/
			
		}
		
	}
}
