package com.util;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.to.User;


public class UserUtil {

	public static User captureUserDetails()
	{
		User user = new User();
		
		BufferedReader br = null;
		
		 try {

			System.out.println("Enter Login Credentials");
	    		
	    	System.out.print("User Name : ");
	    		
	            
			br = new BufferedReader(new InputStreamReader(System.in));
	            
	            
			user.setLoginUserName(br.readLine());
	    		
	    	System.out.print("Password : ");
	    		
	    	user.setLoginPassWord(br.readLine());

		 }  catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (br != null) {
	                try {
	                    br.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
		
		
		return user;
	}
	
	
	public static void main(String[] args) {
		User user = captureUserDetails();
		
		System.out.println("User Name "+user.getLoginUserName());
		System.out.println("Password "+user.getLoginPassWord());
	}
}
