package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProjectDAO;
import model.Project;

@WebServlet (urlPatterns = {"/project"})
public class ProjectController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProjectDAO prDao = new ProjectDAO();
		List<Project> projects = new ArrayList<Project>();
		projects = prDao.getAll();
		req.setAttribute("projects", projects);
		req.getRequestDispatcher("/views/admin/list_project.jsp").forward(req, resp);
	}
}
