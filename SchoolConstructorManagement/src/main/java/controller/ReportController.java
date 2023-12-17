package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReportDAO;
import model.Report;

@WebServlet (urlPatterns = {"/report"})
public class ReportController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String reportId = req.getParameter("reportId");
		
		try {
			ReportDAO reportDAO = new ReportDAO();
			Report report = reportDAO.getByID(reportId);
			req.setAttribute("report", report);
			req.getRequestDispatcher("views/admin/report.jsp").forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
