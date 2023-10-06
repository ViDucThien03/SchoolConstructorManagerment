package model;

import java.util.Date;

public class Project {
	public String porjectid;
	public String projectname;
	public String projectdescription;
	public Date startdate;
	public Date enddate;
	public String getPorjectid() {
		return porjectid;
	}
	public void setPorjectid(String porjectid) {
		this.porjectid = porjectid;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getProjectdescription() {
		return projectdescription;
	}
	public void setProjectdescription(String projectdescription) {
		this.projectdescription = projectdescription;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public Project() {
		super();
	}
	public Project(String porjectid, String projectname, String projectdescription, Date startdate, Date enddate) {
		super();
		this.porjectid = porjectid;
		this.projectname = projectname;
		this.projectdescription = projectdescription;
		this.startdate = startdate;
		this.enddate = enddate;
	}
}
