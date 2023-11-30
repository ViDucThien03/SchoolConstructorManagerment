package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;

import model.Resource;

public class ResourceDAO {
	public List<Resource> getAll(String typeid) {
		List<Resource> list = new ArrayList<Resource>();
		Connection conn = DBConnect.getConnection();
		String sql = "Select resource_id,resource_name,current_quantity,estimated_quantity,resource_description from resource_detail where type_id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, typeid);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Resource resource = new Resource();
				resource.setResourceId(rs.getString("resource_id"));
				resource.setCurrentQuantity(rs.getDouble("current_quantity"));
				resource.setEstimatedQuantity(rs.getDouble("estimated_quantity"));
				resource.setResourceDescription(rs.getNString("resource_description"));
				resource.setResourceName(rs.getString("resource_name"));
				resource.setTypeId("type_id");
				list.add(resource);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;
	}
	public Resource getByID(String resourceId) {
		Resource resource = null;
		Connection conn = DBConnect.getConnection();
		String sql = "select * from resource_detail where resource_id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, resourceId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				resource = new Resource();
				resource.setResourceId(rs.getString("resource_id"));
				resource.setCurrentQuantity(rs.getDouble("current_quantity"));
				resource.setEstimatedQuantity(rs.getDouble("estimated_quantity"));
				resource.setResourceDescription(rs.getNString("resource_description"));
				resource.setResourceName(rs.getString("resource_name"));
				resource.setTypeId("type_id");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resource;
	}
	public boolean insert(Resource resource) {
		boolean check = false;
		Connection conn = DBConnect.getConnection();
		String sql = "insert into resource_detail value(?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, resource.getResourceId());
			ps.setString(2, resource.getResourceName());
			ps.setDouble(3, resource.getCurrentQuantity());
			ps.setDouble(4, resource.getEstimatedQuantity());
			ps.setString(5, resource.getResourceDescription());
			ps.setString(6, resource.getTypeId());
			ps.setString(7, resource.getProjectId());
			int row = ps.executeUpdate();
			if(row>0) {
				check = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;	
	}
}
