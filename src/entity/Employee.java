package entity;

public class Employee extends AbstractEntity{
	private String fio;
	private String phone;
	private String email;
	public Employee() {
		super();
	}
	public Employee(String fio, String phone, String email) {
		super();
		this.fio = fio;
		this.phone = phone;
		this.email = email;
	}
	public String getFio() {
		return fio;
	}
	public void setFio(String fio) {
		this.fio = fio;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return fio;
	}
	
}
