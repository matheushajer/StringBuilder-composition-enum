package entities;

import java.util.Date;

public class Client {
	
	private String name;
	private String email;
	private Date birthDate;
	
	public Client() {
	}
	
	public Client(String name, String email, Date date) {
		this.name = name;
		this.email = email;
		birthDate = date;
	}

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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Client: " +name+ " " +birthDate+ " - " +email);
		return sb.toString();
		
	}

	
}
