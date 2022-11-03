package kr.co.ezenac.global02;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setEmplyeeName("이순신");
		
		Employee employee2 = new Employee();
		employee2.setEmplyeeName("신사임당");
		
		System.out.println(employee1.getEmplyeeName() +", "+ employee1.getEmployeeId());
		System.out.println(employee2.getEmplyeeName() +", "+ employee2.getEmployeeId());

		System.out.println(Employee.serialNum);
	}

}
