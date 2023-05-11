//Aaron Prince Anu
class sinNumber
{
    public static void main(String[] args)
    {
        //initialize vars
        int sin = 0;
	    int one = 0;
	    int two = 0;
	    int three = 0;
	    int four = 0;
	    int five = 0;
	    int six = 0;
	    int seven = 0;
	    int eight = 0;
	    int nine = 0;

        //loop
	    while(sin < 999999999)
	    {
	        System.out.println("Please enter your 9 digit SIN number: ");
	        sin = In.getInt();
	        //Isolating digits
	        one = sin / 100000000 % 10;
	        two = 2 * (sin / 10000000 % 10);
	        if(two >=10)
	        {
		    two = (two % 10) + (two / 10);
	        }
	        three = sin / 1000000 % 10;
	        four = 2 * (sin / 100000 % 10);
	        if(four >=10)
	        {
		    four = (four % 10) + (four / 10);
	        }
	        five = sin / 10000 % 10;
	        six = 2 * (sin / 1000 % 10);
	        if(six >=10)
	        {
		    six = (six % 10) + (six / 10);
	        }
	        seven = sin / 100 % 10;
	        eight = 2 * (sin / 10 % 10);
	        if(eight >=10)
	        {
		    eight = (eight % 10) + (eight / 10);
	        }
	        nine = sin % 10;
	        //valid?
	        int add = (two + four + six + eight) + (one + three + five + seven);
	        int add2 = 10 - (add % 10);
	        //valid? print
	        if(add2 == nine)
	        {
		    System.out.println("That is a valid SIN number.");
	        }
	        if(add2 != nine)
	        {
		    System.out.println("That is an invalid SIN number.");
	        }
        }
    }
}