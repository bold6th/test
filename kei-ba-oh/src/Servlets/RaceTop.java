package Servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.RaceDetailForm;
import Beans.test;



/**
 * Servlet implementation class RaceTop_Servlet
 */
@WebServlet("/RaceTop")
public class RaceTop extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RaceTop() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse respons
	 * e)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());

		//DBからレース情報を取得
		ArrayList<RaceDetailForm> rdfList = new ArrayList<>();
		rdfList.add(new test().getracedata1());
		rdfList.add(new test().getracedata2());
		rdfList.add(new test().getracedata3());

		request.setAttribute("raceinfo",rdfList);

		//フォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/Race_top.jsp");
		dispatcher.forward(request,response);
	}
}
