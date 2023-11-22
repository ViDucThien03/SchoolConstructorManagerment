package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProgressDAO;
import model.ConstructionProgress;

@WebServlet (urlPatterns = {"/addprogress"})
public class AddProgressController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("views/admin/addprogress.jsp");
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String progressid = req.getParameter("progressid");
		String updatedates = req.getParameter("updatedate");
		String progressdescription = req.getParameter("progressdescription");
		String projectid = req.getParameter("projectid");
		
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date updatedate = dateFormat.parse(updatedates);
			ConstructionProgress progress = new ConstructionProgress(progressid, progressdescription, updatedate, projectid);
			ProgressDAO progressDAO = new ProgressDAO();
			ConstructionProgress exits = progressDAO.getByID(progressid);
			if(exits == null) {
				progressDAO.insert(progress);
				resp.sendRedirect("progress");
			} else {
				req.setAttribute("error", "Mã"+progressid+" đã tồn tại!");
				req.getRequestDispatcher("/views/admin/addprogress.jsp");
			}
;		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
