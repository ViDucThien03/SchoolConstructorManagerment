package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Project;

public class ProjectDAO {
	public List<Project> getAll(){
		List<Project> listproject = new ArrayList<Project>();
		Connection conn = DBConnect.getConnection();
		String sql = "select * from project";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Project project = new Project();
				project.setPorjectid(rs.getString("project_id"));
				project.setProjectname(rs.getNString("project_name"));
				project.setProjectdescription(rs.getNString("project_description"));
				project.setStartdate(rs.getDate("start_date"));
				project.setEnddate(rs.getDate("end_date"));
				listproject.add(project);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listproject;
	}
}
