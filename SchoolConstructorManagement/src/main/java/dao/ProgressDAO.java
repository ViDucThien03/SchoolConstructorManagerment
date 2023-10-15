package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.ConstructionProgress;

public class ProgressDAO {
	public List<ConstructionProgress> getAll(){
		List<ConstructionProgress> listProgress = new ArrayList<ConstructionProgress>();
		Connection conn = DBConnect.getConnection();
		String sql = "select * from construction_progress";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				ConstructionProgress progress = new ConstructionProgress();
				progress.setProgressid(rs.getString("progress_id"));
				progress.setProgressdescription(rs.getNString("progress_description"));
				progress.setUpdatedate(rs.getDate("update_date"));
				progress.setProjectid(rs.getString("project_id"));
				listProgress.add(progress);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listProgress; 
	}
}
