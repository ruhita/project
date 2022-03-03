package searchElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class searchElement{
public static boolean isValidEmail(String email) {
		 String regex = "^(.+)@(.+)$";
		 //initialize the Pattern object
		  Pattern pattern = Pattern.compile(regex);
 		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
}

public static void main(String[] args) {
	String YN;
	 do
	 {
        List<String> emails = new ArrayList<String>();  
        	// add valid email addresses
        
        emails.add("abc@gmail.co.in");  
        emails.add("ruu@yahoo.com");  
        emails.add("priyanka@gmail.com");  
        emails.add("lizzie#@domain.co.in");  
        emails.add("raptabs@domain.com");  
        emails.add("aruuu_25@gmail.com");  
        
        //Add invalid email in list  
        
        emails.add("@google.com");  
        emails.add("tomholland#domain.com");  

        for(String value: emails)
        {
	 	System.out.println(" The Email address : " + value );
	 }
        System.out.println("\n Enter any one email address in the list for 						check :");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("The Email address ( " + input + " ) is - " + 					(isValidEmail(input) ? "valid" : "invalid"));
        
        System.out.printf("\n Do you want to continue (press Y for YES & N for 						NO) : ");
	     
		YN=sc.next();
}while(YN.equals("Y")||YN.equals("Y"));
}
}