package practiceANDrevision;
class Employee{
	private String name;
	private int empid;
	private double salary;
	public Employee(String name, int empid, double salary) {
		this. name=name;
		this. empid=empid;
		this.salary=salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {                                                     
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void printDetails() {
		System.out.println("---------EMPLOYEE DETAILS------");
		System.out.println("name:"+name);
		System.out.println("empid:"+empid);
		System.out.println("salary :"+salary);
		System.out.println();
		
	}
}
public class EmpSalaryUpdate {
	public static  void updateSalary(Employee emplye,int rating) {
		System.out.println("------PERFORMANCE RATING-------" +"\n");
		if(rating>=5) {
			emplye.setSalary(emplye.getSalary() + 1000);
			System.out.println("+1000 bonus for good rating" +"\n");
		}else {
			System.out.println("no hike for this month due to less rating"+"\n");
		}
		emplye.printDetails();
	}
	public static void main(String[] args) {
		Employee emp=new Employee("siddu",12345000,20000);
		emp.printDetails();
		updateSalary(emp,5);
		Employee emp2=new Employee("MISBA",18985000,40000);
		emp2.printDetails();
		updateSalary(emp2,4);
		
		
		
		
		
		
	}
	

}
