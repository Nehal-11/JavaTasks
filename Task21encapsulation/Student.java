package Task21encapsulation;

public class Student {
	private String name, email;
	private int admissionId; 
	private long phNum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAdmissionId() {
		return admissionId;
	}
	public void setAdmissionId(int admissionId) {
		this.admissionId = admissionId;
	}
	public long getPhNum() {
		return phNum;
	}
	public void setPhNum(long phNum) {
		this.phNum = phNum;
	}

}
