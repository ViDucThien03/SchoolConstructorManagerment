package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReportDAO;
import model.Report;

@WebServlet (urlPatterns = {"/showreport"})
public class ShowReportController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String reportId = req.getParameter("reportId");
		try {
			ReportDAO reportDAO = new ReportDAO();
			Report report = reportDAO.getByID(reportId);
			req.setAttribute("report", report);
			req.getRequestDispatcher("");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
