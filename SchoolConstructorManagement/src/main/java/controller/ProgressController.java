package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProgressDAO;
import model.ConstructionProgress;

@WebServlet (urlPatterns = {"/progress"})
public class ProgressController extends HttpServlet{
	private ProgressDAO prDao;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		prDao = new ProgressDAO();
		List<ConstructionProgress> listProgress = new ArrayList<ConstructionProgress>();
		listProgress = prDao.getAll();
		req.setAttribute("progress", listProgress);
		req.getRequestDispatcher("/views/admin/construction_progress.jsp").forward(req, resp);
	}
}
