package co.grandcircus.lab22;

public class User {
	private String firstName = "";
	private String lastName = "";
	private String email = "";
	private String phoneNum = "";
	private String password = "";
	
	public User(String firstName, String lastName, String email, String phoneNum, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNum = phoneNum;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Hello " + firstName + " " + lastName + "!  Thanks for registering.\nEmail: " + email + "\nPhone: " + phoneNum;
	}
	
	
} 
