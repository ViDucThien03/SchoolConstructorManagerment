package model;

import java.util.Date;

public class ConstructionProgress {
	private String progressid;
	private String progressdescription;
	private Date updatedate;
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
	public ConstructionProgress() {
		super();
	}
	public ConstructionProgress(String progressid, String progressdescription, Date updatedate, String projectid) {
		super();
		this.progressid = progressid;
		this.progressdescription = progressdescription;
		this.updatedate = updatedate;
		this.projectid = projectid;
	}
}
