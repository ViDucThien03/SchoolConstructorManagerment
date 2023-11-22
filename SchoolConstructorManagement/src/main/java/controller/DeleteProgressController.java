package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProgressDAO;

@WebServlet (urlPatterns = {"/deleteprogress"})
public class DeleteProgressController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String progressid = req.getParameter("progressid");
		try {
			ProgressDAO progressDAO = new ProgressDAO();
			progressDAO.delete(progressid);
			resp.sendRedirect("progress");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
