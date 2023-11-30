package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ResourceDAO;
import model.Resource;

@WebServlet (urlPatterns = {"/resource"})
public class ListResourceController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String typeid = req.getParameter("typeid");
		try {
			ResourceDAO resourceDAO = new ResourceDAO();
			List<Resource> resources = resourceDAO.getAll(typeid);
			req.setAttribute("resources", resources);
			req.getRequestDispatcher("/views/admin/listresource.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
