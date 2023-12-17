package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReportDAO;
import model.Report;

@WebServlet (urlPatterns = {"/addreport"})
public class AddReportController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			req.getRequestDispatcher("views/admin/addreport.jsp").forward(req, resp);	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String reportId = req.getParameter("reportId");
		String reportName = req.getParameter("reportName");
		String reportDates = req.getParameter("reportDate");
		String challenge = req.getParameter("challenge");
		String nextPlan = req.getParameter("nextPlan");
		String evaluation = req.getParameter("evaluation");
		String reportProgress = req.getParameter("reportProgress");
		String reportResource = req.getParameter("reportResource");
		String projectId = req.getParameter("projectId");
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date reportDate = dateFormat.parse(reportDates);
			Report report = new Report(reportId, reportName, reportDate, challenge, nextPlan, evaluation, reportProgress, reportResource, projectId);
			ReportDAO reportDAO = new ReportDAO();
			
			Report exits = reportDAO.getByID(reportId);
			if(exits == null) {
				reportDAO.insert(report);
				resp.sendRedirect("report?reportId="+reportId);
			} else {
                req.setAttribute("error", "Mã " + reportId + " đã tồn tại!");
                req.getRequestDispatcher("/views/admin/addreport.jsp").forward(req, resp);
            }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
