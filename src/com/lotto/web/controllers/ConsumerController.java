package com.lotto.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lotto.web.domains.ConsumerBean;
import com.lotto.web.pool.Constants;



@WebServlet("/consumer.do")
public class ConsumerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a = request.getParameter("dest");
		switch (request.getParameter("action")) {
		case "move":
			RequestDispatcher rd= request.getRequestDispatcher(String.format(Constants.VIEWPATH, "consumer",a));
			rd.forward(request, response);
			break;
		case "join":
			String cid = request.getParameter("cid");
			String pw = request.getParameter("pw");
			ConsumerBean consumer = new ConsumerBean();
			consumer.setCid(cid);
			consumer.setPw(pw);
		
			rd= request.getRequestDispatcher(String.format(Constants.VIEWPATH, "consumer",a));
			rd.forward(request, response);
			break;

		case "login":
			
			break;

		}
		
		/*String cid = request.getParameter("cid");
		String pw = request.getParameter("pw");
		ConsumerBean consumer = new ConsumerBean();
		consumer.setCid(cid);
		consumer.setPw(pw);
		ConsumerService service = new ConsumerServiceImpl();
		service.registerConsumer(consumer);
		System.out.println("정보"+consumer.toString());*/


		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
