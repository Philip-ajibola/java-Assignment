public class Employee{
	
private String firstName;
	private String secondName;
	private Date birthDate;
	private Date hiredDate;


	public Employee(String firstName,String secondName,Date birthDate,Date hiredDate){
			this.firstName = firstName;
			this.secondName= secondName;
			this.birthDate = birthDate;
			this.hiredDate = hiredDate;			
	}

	public String toString(){

		return String.format("%s  %s Hired: %s  BirthDay: %s",firstName,secondName,hiredDate,birthDate);

	}



}
	



	