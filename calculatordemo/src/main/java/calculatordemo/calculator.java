package calculatordemo;

import org.junit.Test;
import java.lang.System;
import java.util.Scanner;

public class calculator {
	@Test
	public void main()
	{
	Scanner s=new Scanner(System.in);
	application a=new application();
	System.out.println("enter the two numbers:");
	int i=s.nextInt();
	int j=s.nextInt();
	System.out.println("enter the choice of operation :\n1. addition\n2.subtraction\n3.multiplication \n4.division\n");
	int k=s.nextInt();
	switch(k)
	{
	case (1):
	a.addition(i,j);
	break;
	case (2):
	a.subtraction(i,j);
	break;
	case (3):
	a.multiplication(i,j);
	break;
	case (4):
	a.division(i,j);
	break;
	default :
	System.out.println("enter the correct option:");
	}
	}
	}
	class application {
	void addition(int i,int j)
	{ 
	i=i+j;
	System.out.println("addition is:"+i);

		}
	void subtraction(int i,int j)
		{

	i=i-j;
	System.out.println("subtraction is:"+i);
		}
	void multiplication(int i,int j)
	{ 
	i=i*j;
	System.out.println("multiplication is:"+i);  
	}
	void division(int i,int j)
	{ double t;
	t=i/j;
	System.out.printf("%.3f",t);
	  }
	}

