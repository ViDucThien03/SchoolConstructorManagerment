package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ResourceDAO;
import model.Resource;

@WebServlet (urlPatterns = {"/deleteresource"})
public class DeleteResourceController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String resourceId = req.getParameter("resourceId");
		String typeId = req.getParameter("typeid");
//		try {
//			ResourceDAO resourceDAO = new ResourceDAO();
//			resourceDAO.delete(resourceId,typeId);
//			resp.sendRedirect("/SchoolConstructorManagement/resource?typeid="+typeId);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		 if (typeId != null) {
	            try {
	                ResourceDAO resourceDAO = new ResourceDAO();
	                resourceDAO.delete(resourceId, typeId);
	                resp.sendRedirect("/SchoolConstructorManagement/resource?typeid=" + typeId);
	            } catch (Exception e) {
	                // Xử lý ngoại lệ nếu cần
	            }
	        } else {
	            // Xử lý khi typeId là null
	            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "typeId is null");
	        }
	}	
}
