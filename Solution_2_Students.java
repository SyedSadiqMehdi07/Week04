package com.abc;

import java.util.Scanner;

import com.abc.service.Delete;
import com.abc.service.Display;
import com.abc.service.Modify;
import com.abc.service.Signup;

/**
 * Hello world!
 *
 */
public class Solution_2_Students 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("1.)Registration\t2.)Deletion\t3.)Modify\t4.)Display");
        System.out.println("Please Enter");
        int n=sc.nextInt();
        switch(n) {
        case 1: Signup.signup();
        break;
        case 2:try {
				Delete.delete();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        break;
        case 3: Modify.modify();
        break;
        case 4:Display.display();
        break;
        }
        
    }
}
