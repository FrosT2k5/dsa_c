import java.util.*;
class ArrayOfObject
{
	public static void main(String[] args)
	{
		Employee[] obj = new Employee[3];
		obj[0] = new Employee("Robert",1996,"64C-WallStreet");
		obj[1] = new Employee("Sam",1996,"68D-WallStreet");
		obj[2] = new Employee("John",1999,"26B-WallStreet");

		System.out.println("Name\t"+"Year of joining\t"+"\tAddress");
		obj[0].showData();
		obj[1].showData();
		obj[2].showData();
	}
}

class Employee
{
	int empId;
	String addr;
	String name;

	Employee(String n,int eid, String ad)
	{
		name=n;
		empId=eid;
		addr=ad;
	}

	public void showData()
	{
		System.out.println(name+"\t\t"+empId+"\t\t"+addr);
		//System.out.println();
	}
}