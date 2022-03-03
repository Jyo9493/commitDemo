package encapsulation;

public class Employee {
	 private String psno;
	 private String firstName;
	 private String jobTitle;
	public String getPsno() {
		return psno;
	}
	public void setPsno(String psno) {
		this.psno = psno;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

}
