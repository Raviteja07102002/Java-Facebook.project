/*
Project Details:
		Project Name		:	FacebookAccount.
		Date of Start		:	22-aug-2024.
		Version No			:	fa.2.1.2.
		Author				:	G. Ravi Teja Reddy
		OS					:	Windows (or) Mac (or) Linux.
		System Requirement	: 	Java Version, Windows 9 above.
*/

/*
Description:
			-> This is a project to replicate facebook account. 
			-> In this project, first it checks the given password and retypePassword is same or not. If the password, retypePassword is same and the given password is in given range, then condition becomes true otherwise false.
			-> After that it checks the given mail id ends with "@gmail.com" or not. If the given mail id ends with the "@gmail.com", then condition becomes true otherwise false.
			-> Next it checks the age whether the user age is eligible or not. If the user age is equal or above 18, then condition becomes true otherwise false.
			-> Next it checks the given mobile number is 10 digits or not. The given mobile number is equals to 10 digits, then condition becomes true otherwise false.
			-> Finally it check the aadharNo is 12 digits or not. The given aadharNo is equals to 12 digits, then condition becomes true otherwise false.
			
			*) After getting the all conditions, it checks the conditions are got true or false. If all conditions get true it displays a message of account creating.
			*) If any one condition gets fails then it does not create the account and it shows in which condition it fails.
			*) If all conditions are true, then it displays the total account creations details of user.
*/

/*
Method Names and Usage:
	checkPassword()				- This method is used to check the password,retypePassword is same or not and the given password is in given range or not.
	checkAge()					- This method is used to check the age is eligible or not.
	checkVerificationMail()		- This method is used to check the mail that ends with "@gmail.com" or not.
	checkMobileNumber()			- This method is used to check the mobile number having 10 digits or not.
	checkAadharNumber()			- This method is used to check the aadhar number having 12 digits or not.
	checkAllDetails()			- This method takes above all methods and checks the conditions is true or not.
	createdUserAccount()		- This method checks the "checkAllDetails()" method. If that method condition is true then it displays the user account details.
*/

/*
variable Names and Usage:
	String uid					:	It is a string type and stores the user id.
    String pwd					:	It is a string type and stores the password.
    String name					:	It is a string type and stores the user name.
    String mail					:	It is a string type and stores the mail id.
	String retypePassword		:	It is a string type and stores the password.
    int age						:	It is a Interger type and stores the age value.
    char gender					:	It is a char type and stores the single charcter.
    long mobileNo				:	It is a long type and stores the mobileNo.
    long aadharNo				:	It is a long type and stores the aadharNo.
    boolean ageCheck			:	It is a boolean type and checks age is true or false.
    boolean mailCheck			:	It is a boolean type and checks mail is true or false.
    boolean mobileCheck			:	It is a boolean type and checks mobileNo is true or false.
    boolean aadharCheck			:	It is a boolean type and checks aadharNo is true or false.
    boolean majorCheck			:	It is a boolean type and checks methods is true or false.
	boolean passwordCheck		:	It is a boolean type and checks password is true or false.
*/


public class FacebookAccount
{
    public static void main(String[] args) 
	{
        Facebook facebook = new Facebook();
        facebook.uid = "LONE_WARRIOR";
        facebook.pwd = "Raviteja778";
		facebook.retypePassword = "Raviteja778";
        facebook.name = "Ravi Teja";
        facebook.gender = 'M';
        facebook.age = 19;
        facebook.mail = "raviteja133@gmail.com";
        facebook.mobileNo = 9652713675L;
        facebook.aadharNo = 260070358004L;
        facebook.createdUserAccount(facebook.uid, facebook.pwd, facebook.name, facebook.mail, facebook.age, facebook.gender, facebook.mobileNo, facebook.aadharNo);
    }
}
class Facebook
{
    String uid;
    String pwd;
    String name;
    String mail;
	String retypePassword;
    int age;
    char gender;
    long mobileNo;
    long aadharNo;
    boolean ageCheck;
    boolean mailCheck;
    boolean mobileCheck;
    boolean aadharCheck;
    boolean majorCheck;
	boolean passwordCheck;
	
	public void checkPassword(String pwd, String retypePassword)
	{
		// This Method Checks the given Password, Retype_Password is Same or Not and the given password is in given range or not.
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		if(pwd.equals(retypePassword)&& pwd.length() >= 7 && pwd.length() <= 12)
		{
			System.out.println("");
			System.out.println("\tYour Password, Retype Password is same and the password is the given range.");
			passwordCheck = true;
		}
		else
		{
			System.out.println("");
			System.out.println("Your Password and Retype Password are incorrecrt or the given is not in given range.");
			passwordCheck = false;
		}
			
	}

    public void checkAge(int age)
	{
		// This Method Checks the given Age is Eligible or Not.

        if (age >= 18)
		{
            System.out.println("\tYour age is Eligible.");
            ageCheck = true;
        }
		else 
		{
            System.out.println("\tYour age is Not Eligible.");
            ageCheck = false;
        }
    }

    public void checkVerificationMail(String mail)
	{
		// This Method Checks the given Mail is Correct or Not.

        if (mail.endsWith("@gmail.com"))
		{
            System.out.println("\tYour Mail Id is Correct.");
            mailCheck = true;
        } 
		else 
		{
            System.out.println("\tYour Mail Id is Incorrect.");
            mailCheck = false;
        }
    }

    public void checkMobileNumber(long mobileNo) 
	{
		// This Method Checks the given Mobile Number is Correct or Not.
        long count = 0;
        long temp = mobileNo;
        while (temp != 0) 
		{
            count++;
            temp = temp / 10;
        }

        if (count == 10) 
		{
            System.out.println("\tValid mobile number.");
            mobileCheck = true;
        } 
		else 
		{
            System.err.println("\tInvalid mobile number.");
            mobileCheck = false;
        }
    }

    public void checkAadharNumber(long aadharNo) 
	{
		// This Method Checks the given Aadhar Number is Correct or Not.
        long count = 0;
        long temp = aadharNo;
        while (temp != 0) 
		{
            count++;
            temp = temp / 10;
        }

        if (count == 12) 
		{
            System.out.println("\tValid Aadhar Number.");
            aadharCheck = true;
        } 
		else 
		{
            System.err.println("\tInvalid Aadhar Number.");
            aadharCheck = false;
        }
    }

    public void checkAllDetails() 
	{
		// This Method Checks the above all given details is Correct or Not.
		checkPassword(pwd,retypePassword);
        checkAge(age);
        checkVerificationMail(mail);
        checkMobileNumber(mobileNo);
        checkAadharNumber(aadharNo);

        if (ageCheck && mailCheck && mobileCheck && aadharCheck && passwordCheck) 
		{
            System.out.println("");
            System.out.println("\tYOUR ALL DETAILS ARE VERIFIED. HERE IS YOUR ACCOUNT DETAILS.");
			System.out.println("");
            majorCheck = true;
        } 
		else 
		{
            System.out.println("");
            System.out.println("\tYOUR DETAILS ARE INCORRECT. PLEASE CHECK YOUR DETAILS.");
            majorCheck = false;
        }
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
    }

    public void createdUserAccount(String uid, String pwd, String name, String mail, int age, char gender, long mobileNo, long aadharNo) 
	{
		// This Method displays the user details.
        checkAllDetails();
		System.out.println("");
		System.out.println("\t\t\t\t\tACCOUNT CREATED SUCCESSFULLY");
        if (majorCheck) 
		{
			System.out.println("");
			System.out.println("********************************************** USER DETAILS ************************************************************");
			System.out.println("");
            System.out.println("\t\tUser Id		:	" + uid);
            System.out.println("\t\tPassword	:	" + pwd);
            System.out.println("\t\tUser Name 	: 	" + name);
            System.out.println("\t\tMail Id 	: 	" + mail);
            System.out.println("\t\tAge 		: 	" + age);
            System.out.println("\t\tGender 		: 	" + gender);
            System.out.println("\t\tMobile No 	: 	" + mobileNo);
            System.out.println("\t\tAadhar No 	: 	" + aadharNo);
			System.out.println("");
			System.out.println("*************************************************************************************************************************");
        }
    }
}

