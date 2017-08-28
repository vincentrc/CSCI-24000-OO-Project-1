/*Honor Pledge: I pledge that I have neither given
nor received any help on this assignment**/

public class Student 
{
	//Attributes
	private String firstname;
	private String lastname;
	private String id;
	private String gpa;
	private Address address = new Address();
	
	
	//Getters
	public String getfirstname()
	{
		return this.firstname;
	}
	
	public String getlastname()
	{
		return this.lastname;
	}
	
	public String getid()
	{
		return this.id;
	}
	
	public String getgpa()
	{
		return this.gpa;
	}
	
	public Address getaddress()
	{
		return this.address;
	}
	
	
	//Setters
	public void setfirstname(String input)
	{
		this.firstname=input;
	}
	
	public void setlastname(String input)
	{
		this.lastname=input;
	}
	
	public void setid(String input)
	{
		this.id=input;
	}
	
	public void setgpa(String input)
	{
		this.gpa=input;
	}
	
	public void setaddressline1(String input)
	{
		this.address.setline1(input);
	}
	
	public void setaddressline2(String input)
	{
		this.address.setline2(input);
	}
	
	public void setaddresscity(String input)
	{
		this.address.setcity(input);
	}
	
	public void setaddressstate(String input)
	{
		this.address.setstate(input);
	}
	
	public void setaddresszip(String input)	
	{
		this.address.setzip(input);
	}
	
	
}
