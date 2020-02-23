package pti16042018;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = {"name", "lname", "pass", "email", "repass"})
public class User {
	String name_u;
	String lname_u;
	String email_u;
	String pass_u;
	String repass_u;
	//int u_seat;
	public User() {}
	
	public void setName(String name) {
		this.name_u = name;
	}
	@XmlElement
	public String getName() {
		return name_u;
	}
	
	public void setLName(String lname) {
		this.lname_u = lname;
	}
	@XmlElement
	public String getLName() {
		return lname_u;
	}
	
	public void setPass(String pass) {
		this.pass_u = pass;
	}
	@XmlElement
	public String getPass() {
		return pass_u;
	}
	public void setRePass(String repass) {
		this.repass_u = repass;
	}
	@XmlElement
	public String getRePass() {
		return repass_u;
	}
	public void setEmail(String email) {
		this.email_u = email;
	}
	@XmlElement
	public String getEmail() {
		return email_u;
	}
}
