package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReportDAO;
import model.Report;

@WebServlet (urlPatterns = {"/listreport"})
public class ListReportController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ReportDAO reportDAO = new ReportDAO();
		List<Report> listreport = new ArrayList<Report>();
		listreport = reportDAO.getAll();
		req.setAttribute("report", listreport);
		req.getRequestDispatcher("views/admin/listreport.jsp").forward(req, resp);
	}
}
