import java.util.*;
public class Otp {
    
    
    public static void main(String[] args) 
    {   //Taking the otp lenght as 4
        int l = 4; 
        System.out.println(gen_otp(l)); 
    } 

    public static char[] gen_otp(int len) 
    { 
        System.out.println("Generating OTP using random() : "); 
        System.out.print("The OTP is : "); 
  
        // Using numeric values 
        String numbers = "0123456789"; 
  
        // Using random method 
        Random rm = new Random(); 
  
        char[] otp = new char[len]; 
  
        for (int i = 0; i < len; i++) 
        { 
            // Use of charAt() method : to get character value 
            // Use of nextInt() as it is scanning the value as int 
            otp[i] = 
             numbers.charAt(rm.nextInt(numbers.length())); 
        } 
        return otp; 
    } 
}
