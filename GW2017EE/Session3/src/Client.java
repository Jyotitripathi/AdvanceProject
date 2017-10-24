import java.util.ArrayList;

/*class Shape{
	void draw(){
		System.out.println("Drawing a Shape");
	}
}*/

/*abstract class Shape{
	
	int x = 10;
	
	abstract void draw();
	
	void fun(){
		System.out.println("This is fun");
	}
	
	
	Shape() {
		System.out.println("--Shape Object Created--");
	}
}*/

interface Shape{
	
	/*Shape() { -> error
		System.out.println("--Shape Object Created--");
	}*/
	
	void draw(); // public abstract void draw();
}

class Circle implements Shape{//extends Shape{
	public void draw(){
		System.out.println("Drawing a Circle");
	}
}

class Rectangle implements Shape{//{extends Shape{
	public void draw(){
		System.out.println("Drawing a Rectangle");
	}
}

class Polygon implements Shape{//{extends Shape{
	public void draw(){
		System.out.println("Drawing a Polygon");
	}
}

public class Client {

	public static void main(String[] args) {
		/*DBOperations dbRef;
		dbRef = new DBOperations();
		
		DBOps dbOpRef;
		dbOpRef = new DBOps();*/

		/*Shape s;
		s = new Circle();
		s.draw();
		
		s = new Rectangle();
		s.draw();
		
		s = new Polygon();
		s.draw();*/
		
		//s = new Shape();
		//s.draw();
		
		Student s1 = new Student(1,"John","+91 99999 99999","john@example.com",20);
		Student s2 = new Student(2,"Jennie","+91 99999 88899","jennie@example.com",22);
		Student s3 = new Student();
		s3.setName("Jack");
		s3.setRoll(3);
		s3.setEmail("jack@example.com");
		s3.setPhone("+91 88888 88888");
		s3.setAge(21);
		
		
		// Lets execute JDBC Code
		JDBCHelper dbHelper = new JDBCHelper();
		dbHelper.openConnection();
		//dbHelper.insertStudent(s2);
		//dbHelper.insertStudent(s3);
		/*ArrayList<Student> stuList  = dbHelper.retrieveStudents();
		
		for(Student s : stuList){
			System.out.println(s);
		}*/
		
		//s1.setName("John Watson");
		//s1.setEmail("j.watson@example.com");
		
		//dbHelper.updateStudent(s1);
		//dbHelper.deleteStudent(s1);
		//dbHelper.processBatch();
		
		dbHelper.executeProcedure(s1);
		
		dbHelper.closeConnection();
		
	}
	
	

}
