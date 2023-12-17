package model;

import java.util.Date;

public class Report {
	private String reportId;
	private String reportName;
	private Date reportDate;
	private String challenge;
	private String nextPlan;
	private String evaluation;
	private String reportProgress;
	private String reportResource;
	private String projectId;
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	public String getReportName() {
		return reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}
	public Date getReportDate() {
		return reportDate;
	}
	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}
	public String getChallenge() {
		return challenge;
	}
	public void setChallenge(String challenge) {
		this.challenge = challenge;
	}
	public String getNextPlan() {
		return nextPlan;
	}
	public void setNextPlan(String nextPlan) {
		this.nextPlan = nextPlan;
	}
	public String getEvaluation() {
		return evaluation;
	}
	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}
	public String getReportProgress() {
		return reportProgress;
	}
	public void setReportProgress(String reportProgress) {
		this.reportProgress = reportProgress;
	}
	public String getReportResource() {
		return reportResource;
	}
	public void setReportResource(String reportResource) {
		this.reportResource = reportResource;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public Report() {
		super();
	}
	public Report(String reportId, String reportName, Date reportDate, String challenge, String nextPlan,
			String evaluation, String reportProgress, String reportResource, String projectId) {
		super();
		this.reportId = reportId;
		this.reportName = reportName;
		this.reportDate = reportDate;
		this.challenge = challenge;
		this.nextPlan = nextPlan;
		this.evaluation = evaluation;
		this.reportProgress = reportProgress;
		this.reportResource = reportResource;
		this.projectId = projectId;
	}
	
}
