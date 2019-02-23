package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.DAO;
import Beans.RaceDetailForm;

/**
 * Servlet implementation class RaceDetail
 */
@WebServlet("/RaceDetail")
public class RaceDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RaceDetail() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());

		//レース一覧で押したリンクのレースコードを取得
		String raceCode = request.getParameter("rdf");
		/*
		 * レースコードを基にレコードの詳細情報を取得
		 * [SELECT * from レーストランザクションテーブル WHERE raceCode = raceCode;]
		 */

		//詳細情報を取得した体
		//RaceDetailForm rdf =new test().getracedata1();

		RaceDetailForm rdf = new RaceDetailForm();

		//スクレイピングにより詳細情報を取得してみる
		System.out.println("スクレイピング直前");
		//rdf = new Scraping().doScraping(rdf,"https://racev3.netkeiba.com/race/result.html?race_id=201905040911&rf=race_list");

		//払い戻し情報とオッズを取得
		rdf = new DAO().getReturnAndOdds(rdf);

		System.out.println(rdf.horses.get(0).getHorseName());

		request.setAttribute("raceinfo",rdf);



		//フォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/Race_detail.jsp");
		dispatcher.forward(request,response);

	}
}
