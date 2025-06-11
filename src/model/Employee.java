package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import dao.Dao;
import dao.DaoImplHibernate;
import main.Logable;

@Entity
@Table(name = "employee")
public class Employee extends Person implements Logable {

	@Id
	@Column(name = "employeeId")
	private int employeeId;

	@Column(name = "password")
	private String password;

	@Transient
	private Dao dao = new DaoImplHibernate();

	public Employee() {
	}

	public Employee(int employeeId, String password) {
		this.employeeId = employeeId;
		this.password = password;
	}

	@Override
	public boolean login(int user, String password) {
		Employee employee = dao.getEmployee(user, password);
		return employee != null;
	}

	// Getters and Setters
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}



//public class Employee extends Person implements Logable {
//
//	// Hardcoded version to enter the shop menu.
////	private final static int USER = 123;
////	private final static String PASSWORD = "test";
//	private int employeeId;
//	private String password;
//
//	// Connection using JDBC.
//	//public Dao dao = new DaoImplMongoDB();
//	public Dao dao = new DaoImplHibernate();
//	public Employee() {
//	}
//
//	public Employee(int user, String pw) {
//
//	}
//
//	public boolean login(int user, String password) {
//		dao.connect();
//		Employee employee = dao.getEmployee(user, password);
//		return employee != null;
//	}
//}

