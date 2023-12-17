package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Report;

public class ReportDAO {
	public List<Report> getAll(){
		List<Report> list = new ArrayList<Report>();
		Connection conn = DBConnect.getConnection();
		String sql = "select report_id, report_name from report";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			//ps.setDate(1, new java.sql.Date(reportDate.getTime()));
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Report rp = new Report();
				rp.setReportId(rs.getNString("report_id"));
				rp.setReportName(rs.getNString("report_name"));
				list.add(rp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
//	public Report getInfor(String reportId) {
//		Report rp = null;
//		Connection conn = DBConnect.getConnection();
//		String sql = "Select * form report where report_id=?";
//		
//	}
	public Report getByID(String reportId) {
		Report rp = null;
		Connection conn = DBConnect.getConnection();
		String sql = "select * from report where report_id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, reportId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				rp = new Report();
				rp.setReportId(rs.getNString("report_id"));
				rp.setReportName(rs.getNString("report_name"));
				rp.setReportDate(rs.getDate("report_date"));
				rp.setEvaluation(rs.getNString("evaluation"));
				rp.setNextPlan(rs.getNString("next_plan"));
				rp.setChallenge(rs.getNString("challenge"));
				rp.setReportResource(rs.getNString("report_resource"));
				rp.setReportProgress(rs.getNString("report_progress"));
				rp.setProjectId(rs.getNString("project_id"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rp;
	}
	public boolean insert(Report report) {
		boolean check = false;
		Connection conn = DBConnect.getConnection();
		String sql = "insert into report values (?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, report.getReportId());
			ps.setString(2, report.getReportName());
			ps.setDate(3, new java.sql.Date(report.getReportDate().getTime()));
			ps.setString(4, report.getChallenge().replaceAll("\n", "\r\n"));
			ps.setString(5, report.getNextPlan().replaceAll("\n", "\r\n"));
			ps.setString(6, report.getEvaluation().replaceAll("\n", "\r\n"));
			ps.setString(7, report.getReportResource().replaceAll("\n", "\r\n"));
			ps.setString(8, report.getReportProgress().replaceAll("\n", "\r\n"));
			ps.setString(9, report.getProjectId());
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
	public boolean update(Report report) {
		boolean check = false;
		Connection conn = DBConnect.getConnection();
		String sql = "update report set report_name=?,report_date=?,challenge=?,next_plan=?,evaluation=?,report_resource=?,report_progress=?,project_id=? where report_id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, report.getReportName());
			ps.setDate(2, new java.sql.Date(report.getReportDate().getTime()));
			ps.setString(3, report.getChallenge().replaceAll("\n", "\r\n"));
			ps.setString(4, report.getNextPlan().replaceAll("\n", "\r\n"));
			ps.setString(5, report.getEvaluation().replaceAll("\n", "\r\n"));
			ps.setString(6, report.getReportResource().replaceAll("\n", "\r\n"));
			ps.setString(7, report.getReportProgress().replaceAll("\n", "\r\n"));
			ps.setString(8, report.getProjectId());
			ps.setString(9, report.getReportId());
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
	public void delete(String reportId) {
		Connection conn = DBConnect.getConnection();
		String sql = "delete from report where report_id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, reportId);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
