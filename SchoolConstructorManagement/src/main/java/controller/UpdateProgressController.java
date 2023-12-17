package controller;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProgressDAO;
import model.ConstructionProgress;

@WebServlet (urlPatterns = {"/updateprogress"})
public class UpdateProgressController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String progressid = req.getParameter("progressid");
		try {
			ProgressDAO pg = new ProgressDAO();
			ConstructionProgress progress = pg.getByID(progressid);
			req.setAttribute("progress", progress);
			req.getRequestDispatcher("/views/admin/updateprogress.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String progressid = req.getParameter("progressidd");
		String updatedates = req.getParameter("updatedate");
		String progressdescription = req.getParameter("progressdescription");
		String projectid = req.getParameter("projectid");
		String status = req.getParameter("status");
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date updatedate = dateFormat.parse(updatedates);
			ConstructionProgress progress = new ConstructionProgress(progressid, progressdescription, updatedate, status, projectid);
			ProgressDAO progressDAO = new ProgressDAO();
			progressDAO.update(progress);
			resp.sendRedirect("progress");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
