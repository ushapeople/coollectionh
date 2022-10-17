package p2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import p1.Connectionfactory;

public class Controller
{
	static Scanner sc = new Scanner(System.in);
    public static void operations()
    {
        System.out.println("Enter \n1.Insert\n2.Display\n3.Delete\n4.Update");
        int n = sc.nextInt();
        if(n==1)
        {
        System.out.println("Provide the details to add in data base");
        Controller.insert();
        }
        else if(n==2)
        {
        System.out.println("Your Data in Database is : ");
        Controller.display();
        }
        else if(n==3)
        {
            delete();
            System.out.println("Data deleted");
        }
        else if(n==4)
        {
            
            System.out.println("");
        }
        else
        {
            System.out.println("Invalid selection\nSelect again");
            operations();
        }
    }}
    
    