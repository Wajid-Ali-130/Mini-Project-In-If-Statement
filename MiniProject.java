import java.util.Scanner;

class MiniProject{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		System.out.println("1. Calculator :");
		System.out.println("2. Unit Converter :");
		System.out.println("3. Atm :");
		System.out.println("4. Transport To Trolly Load :");
		System.out.println("5. Employee Salary Calculator :");
		System.out.println("6. Marksheet :");
		System.out.println("7. Age Comparator :");
		System.out.println("8. Even / Odd :");
		System.out.println("9. Positive / Negative :");
		System.out.println("10. About Developex :");
		System.out.println("11. Exit :");


		System.out.println("\nEnter Your Selection :");
        int selection = obj.nextInt();

        int num1;
        int num2;
        if (selection==1) {                              //Calculator
        	System.out.println("1. Addition :");
		    System.out.println("2. Subtraction :");
		    System.out.println("3. Multiplication :");
		    System.out.println("4. Division :");
		    System.out.println("5. Reminder :");

		    System.out.println("\nEnter Your Selection :");
            selection = obj.nextInt();

		if (selection == 1) {
			System.out.println(" Enter First Number :");
			num1 = obj.nextInt();
		    System.out.println("Enter Second Number :");
		    num2 = obj.nextInt();

		    System.out.println("Addition Is :"+(num1+num2));
		}
		if (selection == 2) {
			System.out.println(" Enter First Number :");
			num1 = obj.nextInt();
		    System.out.println("Enter Second Number :");
		    num2 = obj.nextInt();

		    System.out.println("Addition Is :"+(num1-num2));
		}
		if (selection == 3) {
			System.out.println(" Enter First Number :");
			num1 = obj.nextInt();
		    System.out.println("Enter Second Number :");
		    num2 = obj.nextInt();

		    System.out.println("Addition Is :"+(num1*num2));
		}
		if (selection == 4) {
			System.out.println(" Enter First Number :");
			num1 = obj.nextInt();
		    System.out.println("Enter Second Number :");
		    num2 = obj.nextInt();

		    System.out.println("Addition Is :"+(num1/num2));
		}
        if (selection == 5) {
			System.out.println(" Enter First Number :");
			num1 = obj.nextInt();
		    System.out.println("Enter Second Number :");
		    num2 = obj.nextInt();

		    System.out.println("Addition Is :"+(num1%num2));
		}
	    
	    }


        if (selection==2) {                                                  //Unit Converter
	    	System.out.println("---Now You Entered in Unit Converter---");
	    	System.out.println("1. Feet To Inch :");
	    	System.out.println("2. Inches To Feet :");
	    	System.out.println("3. Kilo To Gram :");
	    	System.out.println("4. Gram To Kilo :");

	    	System.out.println("---Enter Your Selection Here---");
	    	selection = obj.nextInt();

	    	if (selection==1) {
	    		System.out.println("Enter Feet :");
		        int feet =obj.nextInt();
		        int inch = feet * 12;

		        System.out.println("Feet = "+feet+"\n"+"Inch = "+inch);
	    	}
	    	if (selection==2) {
	    		System.out.println("Enter Inches :");
		        int inches =obj.nextInt();
		        int feet = inches / 12;

		        System.out.println("Inches = "+inches+"\n"+"Feet = "+feet);
	    	}
	    	if (selection==3) {
	    		int kilo =obj.nextInt();
		        float gram = kilo * 1000;

		        System.out.println("Kilo = "+kilo+"\n"+"Grams = "+gram);
	    	}
	    	if (selection==4) {
	    		int gram =obj.nextInt();
		        float kilo = gram / 1000;

		        System.out.println("Kilo = "+kilo+"\n"+"Grams = "+gram);
	    	}
	    }
             
        if (selection==3) {                                        //ATM
             	System.out.println("Enter Rupees :");
		         int rupees = obj.nextInt();

		         int fivethousand = rupees/5000;
		         int remFiveThousand=rupees%5000;

		         int thousand = remFiveThousand/1000;
		         int remthousand = remFiveThousand%1000;

		         int fivehundred = remthousand/500;
		         int remfivehundred = remthousand%500;

		         int hundred = remfivehundred/100;
		         int remhundred = remfivehundred%100;

		         int fifty = remhundred/50;
		         int remfifty = remhundred%50;

		         int twenty = remfifty/20;
		         int remtwenty = remfifty%20;

		         int ten = remtwenty/10;
		         int remten = remtwenty%10;

		         int five = remten/5;
		         int remfive = remten%5;

		         int two = remfive/2;
		         int remtwo = remfive%2;

		         int one = remtwo/1;

		         System.out.println("Five Thousand ="+fivethousand);
		         System.out.println("Thousand ="+thousand);
	         	 System.out.println("Five Hundred ="+fivehundred);
		         System.out.println("Hundred ="+hundred);
		         System.out.println("Fifty ="+fifty);
	           	 System.out.println("Twenty ="+twenty);
		         System.out.println("Ten ="+ten);
		         System.out.println("Five ="+five);
		         System.out.println("Two ="+two);
		         System.out.println("One ="+one);

        }

        if (selection==4) {                                              //Transport To Trolly Load
             	System.out.println("Enter TrollyLoad :");
		        int load = obj.nextInt();

		        int trollyload = load * 800;
		        int driver = load*150;
		        int tax = load * 80;
		        int diesel = load*210;
		        int profit = trollyload - (driver+tax+diesel);

		        System.out.println("Total TrollyLoad ="+trollyload);
		        System.out.println("Driver ="+driver);
		        System.out.println("Tool Tax ="+tax);
		        System.out.println("Diesel ="+diesel);
		        System.out.println("Total Profit ="+profit);
        }
        if (selection==5) {                                                //Employee Salary Calculator
        	System.out.println("Enter Basic Pay :");
		    int basicpay = obj.nextInt();

		    int houserent = basicpay *45/100;                                                                    
		    int medicalallowance = basicpay*15/100;
		    int bonus = basicpay*5/100;
		    int grosspay = basicpay+houserent+medicalallowance+bonus;

		    System.out.println("House Rent :"+houserent);
		    System.out.println("Medical Allowance :"+medicalallowance); 
		    System.out.println("Bonus :"+bonus);
            System.out.println("Gross Pay = "+grosspay); 

            int convenceallowance = basicpay*8/100;
		    System.out.println("Convence Allowance = "+convenceallowance); 

		    int zakwat = basicpay*2/100;
		    System.out.println("Zakwat = "+zakwat); 
        
            int incometax = basicpay*5/100;
		    System.out.println("Income Tax = "+incometax); 

		    int netincome = grosspay-(convenceallowance+zakwat+incometax);
		    System.out.println("Net Income = "+netincome);

        }
        if (selection==6) {                                             //Marksheet
        	int java;
	        int php;
	        int cpp;
	        int vb;
	        int oracle;

		System.out.print("Enter Java Marks :");
		java=obj.nextInt();


		System.out.print("Enter PHP Marks :");
		php=obj.nextInt();


		System.out.print("Enter CPP Marks :");
		cpp=obj.nextInt();


		System.out.print("Enter VB Marks :");
		vb=obj.nextInt();         


		System.out.print("Enter Oracle Marks :");
		oracle=obj.nextInt();

		System.out.println("Java="+java);
		System.out.println("PHP="+php);
		System.out.println("CPP="+cpp);
		System.out.println("VB="+vb);
		System.out.println("Oracle="+oracle);


		System.out.println("Total Marks = 500");
		int obtainedMarks=(java+php+cpp+vb+oracle);
		System.out.println("Obtained Marks :"+obtainedMarks);

		float percentage = (obtainedMarks*100)/500;
		System.out.println("Total Percentage Is :"+ percentage);
        }

        if (selection==7) {                                 //Age Comparator
        	System.out.println("Enter First Age :");
		    int age1 = obj.nextInt();

		    System.out.println("Enter Second Age :");
		    int age2 = obj.nextInt();

		    if (age1 > age2) {
			System.out.println("Age 1 Is Greater :");
		    }
		    if (age1 < age2) {
			System.out.println("Age 2 Is Greater :");
		    }
        }

        if (selection==8) {                                            //Even / Odd
        	System.out.println("Enter Any Number :");
		     num1 = obj.nextInt();

		    if (num1%2==0) {
			System.out.println(num1+" Is Even Number");
		    }
		    else{
			System.out.println(num1+" Is Odd Number");
		    }
        }

        if (selection==9) {                                                //Positive / Negative Numbers
        	 System.out.println("Enter Any Number :");
		     num1= obj.nextInt();

		    if (num1<0) {
			System.out.println(num1+": Is Negative Number");
		    }
		    else{
		 	System.out.println(num1+": Is Positive Number");
		    }
        }

        if (selection==10) {                              //About Developex
        	System.out.println("-----GOOD BYE-----");
        	System.out.println("Developer Name: Mr. Wajid Ali Bhutto ");
        	System.out.println("Organization / University: University Of Sinth Jamshoro\n");
        	System.out.println("email:bwajid962@gmail.com");
        	System.out.println("Contact No:0305-1059955");
        }
        if (selection==11) {
        	System.out.println("Good Bye");
        	System.exit(0);

        }

	    	
	}
}	
