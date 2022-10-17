package p2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import p1.Connectionfactory;

public class EmployeeService  implements EmployeeDao{
	
	
    public static void selection(Employee employee)
	{
		 System.out.println("select\n1.insert\n2.delete\n3.update\n4.display");
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 if(n==1)
		    {
			 try
		        {
		   Connection con = Connectionfactory.getConnection();
		  Statement stmt= con.createStatement();
		 stmt.executeUpdate("insert into employee1(`id`,`name`,`salary`) values('"+emp.getId()+"','"+emp.getName()+"','"+emp.getSalary()+"'))");
		                
		        }
		        catch(Exception e)
		        {
		            System.out.println(e);
		        }
				}
			else if(n==2) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					System.out.println(" driver found");
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/usha","root","root");
					Statement statement=connection.createStatement();
					String query ="delete from usha.employee1 where empid=6";
					statement.executeUpdate(query);
					
					System.out.println("data deleted successfully");
				
				}
				catch(Exception e) {
					System.out.println(e);
					
				}
				}
			else if(n==3) {
				
				
		update employee1 set name='"+employee.getUsername()+"'  where id ='"+employee.getId()+"'
			}
					
				
	else if(n==4) {
		try
        {
			
			Connection con = Connectionfactory.getConnection();
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM usha.employee1");
			System.out.println("id\tname\tsalary");
			while (rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
	
			}
        }
		
        catch(Exception e)
        {
            System.out.println(e);
        }
		
	}
	else {
		
		System.out.println("selection is not found");
	}
	}		
			
		
		 	
public static void main(String args[])
{
	Controller c=new Controller();
	c.operations();
}
@Override
public void Display() {
	// TODO Auto-generated method stub
	
}

@Override
public void Insert() {
	
}

@Override
public void delete() {
	
	
}

@Override
public void update() {// TODO Auto-generated method stub
}

}

