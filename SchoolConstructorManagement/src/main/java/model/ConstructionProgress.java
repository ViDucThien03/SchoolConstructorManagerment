package model;

import java.util.Date;

public class ConstructionProgress {
	private String progressid;
	private String progressdescription;
	private Date updatedate;
	private String status;
	private String projectid;
	public String getProgressid() {
		return progressid;
	}
	public void setProgressid(String progressid) {
		this.progressid = progressid;
	}
	public String getProgressdescription() {
		return progressdescription;
	}
	public void setProgressdescription(String progressdescription) {
		this.progressdescription = progressdescription;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	public String getProjectid() {
		return projectid;
	}
	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ConstructionProgress() {
		super();
	}
	public ConstructionProgress(String progressid, String progressdescription, Date updatedate, String status,
			String projectid) {
		super();
		this.progressid = progressid;
		this.progressdescription = progressdescription;
		this.updatedate = updatedate;
		this.status = status;
		this.projectid = projectid;
	}
}
