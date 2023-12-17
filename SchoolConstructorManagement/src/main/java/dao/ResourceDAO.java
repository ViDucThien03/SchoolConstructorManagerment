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
		String sql = "Select resource_id,resource_name,estimated_quantity,expected_amount, expected_total, resource_description, type_id from resource_detail where type_id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, typeid);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Resource resource = new Resource();
				resource.setResourceId(rs.getString("resource_id"));
				resource.setEstimatedQuantity(rs.getDouble("estimated_quantity"));
				resource.setResourceDescription(rs.getNString("resource_description"));
				resource.setResourceName(rs.getString("resource_name"));
				resource.setTypeId(rs.getString("type_id"));
				resource.setExpectedAmount(rs.getDouble("expected_amount"));
				resource.setExpectedTotal(rs.getDouble("expected_total"));
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
			if (rs.next()) {
				resource = new Resource();
				resource.setResourceId(rs.getString("resource_id"));
				
				resource.setEstimatedQuantity(rs.getDouble("estimated_quantity"));
				resource.setResourceDescription(rs.getNString("resource_description"));
				resource.setResourceName(rs.getString("resource_name"));
				resource.setTypeId(rs.getString("type_id"));
				resource.setProjectId(rs.getString("project_id"));
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
		String sql = "insert into resource_detail values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, resource.getResourceId());
			ps.setString(2, resource.getResourceName());
			ps.setDouble(3, resource.getEstimatedQuantity());
			ps.setDouble(4, resource.getExpectedAmount());
			ps.setDouble(5, resource.getExpectedTotal());
			ps.setString(6, resource.getResourceDescription());
			ps.setString(7, resource.getProjectId());
			ps.setString(8, resource.getTypeId());
			int row = ps.executeUpdate();
			if (row > 0) {
				check = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}

	public boolean update(Resource resource) {
		boolean check = false;
		Connection conn = DBConnect.getConnection();
		String sql = "update resource_detail set resource_name=?, estimated_quantity=?,expected_amount=?,expected_total=?, resource_description=?,project_id=?, type_id=? where resource_id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, resource.getResourceName());
			ps.setDouble(2, resource.getEstimatedQuantity());
			ps.setDouble(3, resource.getExpectedAmount());
			ps.setDouble(4, resource.getExpectedTotal());
			ps.setString(5, resource.getResourceDescription());
			ps.setString(6, resource.getProjectId());
			ps.setString(7, resource.getTypeId());
			ps.setString(8, resource.getResourceId());
			int row = ps.executeUpdate();
			if (row > 0) {
				check = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}

	public void delete(String resourceId, String typeId) {
		Connection conn = DBConnect.getConnection();
		String sql = "DELETE FROM resource_detail WHERE resource_id=? AND type_id=?";
		try  {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, resourceId);
			ps.setString(2, typeId);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}

}
