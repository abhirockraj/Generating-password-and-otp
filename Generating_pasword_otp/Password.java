import java.util.*;
public class Password {
	public static void main(String[] args) 
	{   System.out.println("Upon running the each time different password is generated");
		// Length of your password as I have choose 
		int length = 12; 
		System.out.println(create_password(length)); 
	} 

	public static char[] create_password(int len) 
	{ 
		System.out.println("Generating password using random() function : "); 
		System.out.print("New password : "); 

		// A strong password has Cap_chars, Lower_chars, 
		// numeric value and symbols. So we are using all of 
		// them to generate our password 
		String Capital_char = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		String Small_char = "abcdefghijklmnopqrstuvwxyz"; 
		String number = "0123456789"; 
		String symbol = "!@#$%^&*_=+-/.?<>)"; 


		String values = Capital_char + Small_char + number + symbol; 

		// Using random method 
		Random rm = new Random(); 

		char[] password = new char[len]; 

		for (int i = 0; i < len; i++) 
		{ 
			// Use of charAt() method : to get character value 
			// Use of nextInt() as it is scanning the value as int 
			password[i] = values.charAt(rm.nextInt(values.length())); 
		} 
		return password; 
	} 
} 
