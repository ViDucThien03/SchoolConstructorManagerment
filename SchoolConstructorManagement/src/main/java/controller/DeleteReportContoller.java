package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReportDAO;

@WebServlet (urlPatterns = {"/deletereport"})
public class DeleteReportContoller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String reportId = req.getParameter("reportId");
		try {
			ReportDAO reportDAO = new ReportDAO();
			reportDAO.delete(reportId);
			resp.sendRedirect("listreport");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
