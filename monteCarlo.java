import java.util.Random;			
	import java.util.*;
	class monteCarlo{

	public static void main(String[]args){

		Scanner input= new Scanner (System.in);
		System.out.println("Number of test you want to run?");
		//number of times you want to run the program
		int numOfTests=input.nextInt();
		//declare a variable for the number of samples which fall in the circle	set it equal to 0 to start.
		double randomSamples=0;
		double inCircle=0;
		//just a loop to run through the test
		while(randomSamples<numOfTests){

			//declare variables x and y as type double
			double x=Math.random();
			double y=Math.random();
			double square=Math.sqrt(x*x+y*y);
			//if the square root of (x * x + y * y) is less than 1, then the point is within the circle
			if(square<1){

					inCircle++;
			}

		randomSamples++;
		//this is to keep count hits in circle against the number of tries (this is purely visual, so when the test is run I can keep track)
		System.out.println(inCircle+" "+randomSamples+"    "+4*inCircle/randomSamples);
		}
		//estimation of pi, is 4 times (number of samples found inside the circle)/(total number of samples)
		System.out.println("Estimantion of Pi is "+4*inCircle/randomSamples);
	}
}
