import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Wind Chill Calculator");
		double windChillTemp, temp, windSpeed;
		System.out.print("\nEnter Value For Temperature in degrees Fahrenheit " + "(values must be >=-45 and <= 40):");
		temp = scan.nextDouble();
		System.out.print("\nEnter the speed of the wind " + "(values must be >=5 and <=60):");
		windSpeed = scan.nextDouble();
		final double value1= 35.74;
		final double value2= 0.6215;
		final double value3=35.75;
		final double value4=0.16;
		final double value5=0.4275;
		windChillTemp = (value1 + (value2 * temp)) - (value3 * Math.pow(windSpeed, value4))
				+ (value5 * temp * Math.pow(windSpeed, value4));
		System.out.print("\nWind Chill Temperature:" + windChillTemp + " degrees Fahrenheit");
		System.out.println();
		System.out.println("\nProgrammer: Malcolm Albright");
scan.close();
	}

}
