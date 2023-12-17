package model;

/**
 * 
 */
public class Resource {
	private String resourceId;
	private String resourceName;
	private double estimatedQuantity;
	
	private String resourceDescription;
	private String typeId;
	private String projectId;
	private double expectedAmount;
	private double expectedTotal;
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
	
	public double getExpectedAmount() {
		return expectedAmount;
	}
	public void setExpectedAmount(double expectedAmount) {
		this.expectedAmount = expectedAmount;
	}
	
	public double getExpectedTotal() {
		return expectedTotal;
	}
	public void setExpectedTotal(double expectedTotal) {
		this.expectedTotal = expectedTotal;
	}
	public Resource() {
		super();
	}
	public Resource(String resourceId, String resourceName, double estimatedQuantity, String resourceDescription,
			String typeId, String projectId, double expectedAmount, double expectedTotal) {
		super();
		this.resourceId = resourceId;
		this.resourceName = resourceName;
		this.estimatedQuantity = estimatedQuantity;
		this.resourceDescription = resourceDescription;
		this.typeId = typeId;
		this.projectId = projectId;
		this.expectedAmount = expectedAmount;
		this.expectedTotal = expectedTotal;
	}
	
	
}
