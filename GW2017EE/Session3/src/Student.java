
public class Student {

	// Attributes
	int roll;
	String name;
	String phone;
	String email;
	int age;
	
	public Student() {
		roll = 0;
		name = "NA";
		phone = "NA";
		email = "NA";
		age = 0;
	}
		
	public Student(int roll, String name, String phone, String email, int age) {
		this.roll = roll;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.age = age;
	}



	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", phone=" + phone + ", email=" + email + ", age=" + age
				+ "]";
	}

}
