public class EmployeeTest{

	public static void main(String[] args){
		Date hiredDate = new Date(3,12,1988);
		Date birthDate = new Date(7,24,1949);
		Employee employee = new Employee("Philip","Ajibola",birthDate,hiredDate);

	System.out.println(employee);
	}

}