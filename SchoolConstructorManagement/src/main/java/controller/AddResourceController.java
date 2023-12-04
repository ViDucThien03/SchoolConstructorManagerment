package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ResourceDAO;
import model.Resource;

@WebServlet(urlPatterns = { "/addresource" })
public class AddResourceController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("views/admin/addresource.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String resourceId = req.getParameter("resourceId");
        String resourceName = req.getParameter("resourceName");
        String currentQuantitys = req.getParameter("currentQuantity");
        String estimatedQuantitys = req.getParameter("estimatedQuantity");
        String resourceDescription = req.getParameter("resourceDescription");
        String typeid = req.getParameter("typeId");
        String projectId = req.getParameter("projectId");

        try {
            if (currentQuantitys != null && estimatedQuantitys != null) {
                double currentQuantity = Double.parseDouble(currentQuantitys);
                double estimatedQuantity = Double.parseDouble(estimatedQuantitys);
                Resource rs = new Resource(resourceId, resourceName, estimatedQuantity, currentQuantity,
                        resourceDescription, typeid, projectId);
                ResourceDAO resourceDAO = new ResourceDAO();
                Resource exits = resourceDAO.getByID(resourceId);
                if (exits == null) {
                    resourceDAO.insert(rs);
                    resp.sendRedirect("/SchoolConstructorManagement/resource?typeid="+typeid);
                } else {
                    req.setAttribute("error", "Mã " + resourceId + " đã tồn tại!");
                    req.getRequestDispatcher("/views/admin/addresource.jsp").forward(req, resp);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

