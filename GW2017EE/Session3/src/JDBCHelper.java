import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 

public class JDBCHelper {

	Connection con;
	Statement stmt;
	PreparedStatement pStmt;
	CallableStatement cStmt;
	
	// Default Constructor
	public JDBCHelper() {
		
		try {
			//1. Load the Driver. Before loading driver link jar file for Type4 Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("--Driver Loaded--");
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
	}
	
	//2. Create the connection
	void openConnection(){
		try {
			String url = "jdbc:mysql://localhost/GW2017EE";
			String user = "root";
			String password = "";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("--Connection Created--");
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
	}
	
	void insertStudent(Student s){
		try {
			//3. Write SQL Statement
			//String sql = "insert into Student values("+s.getRoll()+",'"+s.getName()+"','"+s.getPhone()+"','"+s.getEmail()+"',"+s.getAge()+")";
			
			//stmt = con.createStatement();
			
			//4. Execute SQL Statement
			//stmt.executeUpdate(sql);
			//System.out.println("--Student Inserted-- "+s.getName());
			
			//3. Write SQL Statement
			String sql = "insert into Student values(?,?,?,?,?)";
			pStmt = con.prepareStatement(sql);
			pStmt.setInt(1, s.getRoll());
			pStmt.setString(2, s.getName());
			pStmt.setString(3, s.getPhone());
			pStmt.setString(4, s.getEmail());
			pStmt.setInt(5, s.getAge());
			
			pStmt.executeUpdate();
			System.out.println(s.getName()+ " inserted into DB");
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
	}
	
	ArrayList<Student> retrieveStudents(){
		
		ArrayList<Student> stuList = new ArrayList<Student>();
		
		try {
			String sql = "select * from Student";
			pStmt = con.prepareStatement(sql);
			
			ResultSet rs = pStmt.executeQuery();
			
			String n="",p="",e="";
			int r=0,a=0;
			while(rs.next()){
				
				r = rs.getInt(1);
				n = rs.getString(2);
				p = rs.getString(3);
				e = rs.getString(4);
				a = rs.getInt(5);
				
				
				//System.out.println(r+" - "+n+" - "+p+" - "+e+" - "+a);
				//System.out.println("--------------------------------");
				
				Student s = new Student(r,n,p,e,a);
				stuList.add(s);
			}
			
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
		
		return stuList;
	}
	
	void processBatch(){
		try {
			
			String sql1 = "update Student set name = 'Jennie Watson' where roll = 2";
			String sql2 = "update Student set email = 'jackiej@example.com' where roll = 3";
			
			con.setAutoCommit(false);
	
			stmt = con.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);			
			stmt.executeBatch();
			
			con.commit();
			
			System.out.println("Batch Processed");
			
		} catch (Exception e) {
			System.out.println("Some Exeception: "+e);
			try {
				con.rollback();
				System.out.println("Transaction Rollbacked: "+e);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	void executeProcedure(Student s){
		try {
			
			String sql = "{call insertStudent(?,?,?,?,?)}";
			cStmt = con.prepareCall(sql);
			
			cStmt.setInt(1, s.getRoll());
			cStmt.setString(2, s.getName());
			cStmt.setString(3, s.getPhone());
			cStmt.setString(4, s.getEmail());
			cStmt.setInt(5, s.getAge());
			
			cStmt.execute();
			
			System.out.println("Procedure Executed");
			
		} catch (Exception e) {
			System.out.println("Some Exeception: "+e);
		}
	}
	
	
	// Update Student
	void updateStudent(Student s){
		try {
			String sql = "update Student set name = ?, email = ? where roll = ?";
			pStmt = con.prepareStatement(sql);
			
			pStmt.setString(1, s.getName());
			pStmt.setString(2, s.getEmail());
			pStmt.setInt(3, s.getRoll());
			
			int i = pStmt.executeUpdate();
			System.out.println(s.getName()+" updated: "+i);
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
				
	}
	
	// Update Student
		void deleteStudent(Student s){
			try {
				String sql = "delete from Student where roll = ?";
				pStmt = con.prepareStatement(sql);
				pStmt.setInt(1, s.getRoll());
				
				int i = pStmt.executeUpdate();
				System.out.println(s.getName()+" deleted: "+i);
			} catch (Exception e) {
				System.out.println("Exception is: "+e);
			}
					
		}

	
	//5. Close the connection
	void closeConnection(){
		try {
			con.close();
			System.out.println("--Connection Closed--");
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
	}
	
	
}
