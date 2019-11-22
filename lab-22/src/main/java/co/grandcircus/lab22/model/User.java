package co.grandcircus.lab22.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id // this is used to represent the primary key and will always be @Id
	@GeneratedValue(strategy= GenerationType.IDENTITY) // 
	private int id = -1;
	
	private String first = "";
	private String last = "";
	private String email = "";
	private String phone = "";
	private String password = "";
	
	public User() {}
	
	public User(String firstName, String lastName, String email, String phoneNum, String password) {
		super();
		this.first = firstName;
		this.last = lastName;
		this.email = email;
		this.phone = phoneNum;
		this.password = password;
	}
	
	public User(int userId, String firstName, String lastName, String email, String phoneNum, String password) {
		super();
		this.id = userId;
		this.first = firstName;
		this.last = lastName;
		this.email = email;
		this.phone = phoneNum;
		this.password = password;
	}
	
	public int getUserId() {
		return id;
	}
	
	public void setUserId(int userId) {
		this.id = userId;
	}

	public String getFirstName() {
		return first;
	}

	public void setFirstName(String firstName) {
		this.first = firstName;
	}

	public String getLastName() {
		return last;
	}

	public void setLastName(String lastName) {
		this.last = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNum() {
		return phone;
	}

	public void setPhoneNum(String phoneNum) {
		this.phone = phoneNum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Hello " + first + " " + last + "!  Thanks for registering.\nEmail: " + email + "\nPhone: " + phone;
	}
	
	
} 
