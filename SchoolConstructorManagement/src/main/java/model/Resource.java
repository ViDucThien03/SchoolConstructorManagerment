package model;

public class Resource {
	private String resourceId;
	private String resourceName;
	private double estimatedQuantity;
	private double currentQuantity;
	private String resourceDescription;
	private String typeId;
	private String projectId;
	public String getResourceId() {
		return resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public double getEstimatedQuantity() {
		return estimatedQuantity;
	}
	public void setEstimatedQuantity(double estimatedQuantity) {
		this.estimatedQuantity = estimatedQuantity;
	}
	public double getCurrentQuantity() {
		return currentQuantity;
	}
	public void setCurrentQuantity(double currentQuantity) {
		this.currentQuantity = currentQuantity;
	}
	public String getResourceDescription() {
		return resourceDescription;
	}
	public void setResourceDescription(String resourceDescription) {
		this.resourceDescription = resourceDescription;
	}
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public Resource() {
		super();
	}
	public Resource(String resourceId, String resourceName, double estimatedQuantity, double currentQuantity,
			String resourceDescription, String typeId, String projectId) {
		super();
		this.resourceId = resourceId;
		this.resourceName = resourceName;
		this.estimatedQuantity = estimatedQuantity;
		this.currentQuantity = currentQuantity;
		this.resourceDescription = resourceDescription;
		this.typeId = typeId;
		this.projectId = projectId;
	}
	
}
