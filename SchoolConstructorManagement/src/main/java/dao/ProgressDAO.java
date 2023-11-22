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
	public ConstructionProgress getByID(String progressid) {
		ConstructionProgress progress = null;
		Connection conn = DBConnect.getConnection();
		String sql = "select * from construction_progress where progress_id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, progressid);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				progress = new ConstructionProgress();
				progress.setProgressid(rs.getString("progress_id"));
				progress.setProgressdescription(rs.getNString("progress_description"));
				progress.setUpdatedate(rs.getDate("update_date"));
				progress.setProjectid(rs.getString("project_id"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return progress;
	}
	public boolean insert(ConstructionProgress progress) {
		boolean check = false;
		Connection conn = DBConnect.getConnection();
		String sql = "INSERT INTO construction_progress (progress_id, update_date, progress_description, project_id) VALUES (?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, progress.getProgressid());
			ps.setDate(2, new java.sql.Date(progress.getUpdatedate().getTime()));
			ps.setString(3, progress.getProgressdescription());
			ps.setString(4, progress.getProjectid());
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
	public boolean update(ConstructionProgress progress) {
		boolean check = false;
		Connection conn = DBConnect.getConnection();
		String sql = "update construction_progress set update_date=?, progress_description=?,project_id=? where progress_id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setDate(1, new java.sql.Date(progress.getUpdatedate().getTime()));
			ps.setString(2, progress.getProgressdescription());
			ps.setString(3, progress.getProjectid());
			ps.setString(4, progress.getProgressid());
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

	public void delete(String progressid) {
		Connection conn = DBConnect.getConnection();
		String sql = "delete from construction_progress where progress_id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, progressid);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
