package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ResourceDAO;
import model.Resource;

@WebServlet (urlPatterns = {"/updateresource"})
public class UpdateResourceController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String resourceId = req.getParameter("resourceId");
		try {
			ResourceDAO resourceDAO = new ResourceDAO();
			Resource resource = resourceDAO.getByID(resourceId);
			req.setAttribute("resource", resource);
			req.getRequestDispatcher("/views/admin/updateresource.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String resourceId = req.getParameter("resourceId");
        String resourceName = req.getParameter("resourceName");
        
        String estimatedQuantitys = req.getParameter("estimatedQuantity");
        String resourceDescription = req.getParameter("resourceDescription");
        String typeId = req.getParameter("typeId");
        String projectId = req.getParameter("projectId");
        String expectedAmounts = req.getParameter("expectedAmount");
        String expectedTotals = req.getParameter("expectedTotal"); 
        try {
            if (estimatedQuantitys != null) {
                
                double estimatedQuantity = Double.parseDouble(estimatedQuantitys);
                double expectedAmount = Double.parseDouble(expectedAmounts);
                double expectedTotal = Double.parseDouble(expectedTotals);
                Resource rs = new Resource(resourceId, resourceName, estimatedQuantity, resourceDescription, typeId, projectId, expectedAmount, expectedTotal);
                ResourceDAO resourceDAO = new ResourceDAO();
                resourceDAO.update(rs);
                resp.sendRedirect("/SchoolConstructorManagement/resource?typeid="+typeId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
