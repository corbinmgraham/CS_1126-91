public class temperatureConversion
{
	//Array Containing Temperature Message Numbers
	String[] array = {"Very Cold", "Cold", "Mild", "Very Mild", "Warm", "Very Warm", "Hot"};
	
	public void displayF(int temperature)
	{
		double finalTemp = 9.0 / 5.0 * temperature + 32;
		
		if (finalTemp > -75 && finalTemp < 150)
		{
		if (finalTemp < 0)
			System.out.printf("%d%s%.2f%s%s%s%n", temperature, " degrees Celsius is equeal to ", finalTemp, " Degrees Fahrenheit ***", array[0], "***");
		else if (finalTemp >= 0 && finalTemp <= 32)
			System.out.printf("%d%s%.2f%s%s%s%n", temperature, " degrees Celsius is equeal to ", finalTemp, " Degrees Fahrenheit ***", array[1], "***");
		else if (finalTemp >= 33 && finalTemp <= 50)
			System.out.printf("%d%s%.2f%s%s%s%n", temperature, " degrees Celsius is equeal to ", finalTemp, " Degrees Fahrenheit ***", array[2], "***");
		else if (finalTemp >= 51 && finalTemp <= 60)
			System.out.printf("%d%s%.2f%s%s%s%n", temperature, " degrees Celsius is equeal to ", finalTemp, " Degrees Fahrenheit ***", array[3], "***");
		else if (finalTemp >= 61 && finalTemp <= 70)
			System.out.printf("%d%s%.2f%s%s%s%n", temperature, " degrees Celsius is equeal to ", finalTemp, " Degrees Fahrenheit ***", array[4], "***");
		else if (finalTemp >= 71 && finalTemp <= 90)
			System.out.printf("%d%s%.2f%s%s%s%n", temperature, " degrees Celsius is equeal to ", finalTemp, " Degrees Fahrenheit ***", array[5], "***");
		else if (finalTemp > 90)
			System.out.printf("%d%s%.2f%s%s%s%n", temperature, " degrees Celsius is equeal to ", finalTemp, " Degrees Fahrenheit ***", array[6], "***");
		}
		else if (finalTemp < -75 || finalTemp > 150)
			System.out.print("Temperature is out of bounds.");
			
	}
	public void displayC(int temperature)
	{
		double finalTemp = 5.0 / 9.0 * (temperature - 32);
		
		if (temperature > -75 && temperature < 150)
		{
		if (temperature < 0)
			System.out.printf("%d%s%.2f%s%s%s%n", temperature, " degrees Fahrenheit is equeal to ", finalTemp, " Degrees Celsius ***", array[0], "***");
		else if (temperature >= 0 && temperature <= 32)
			System.out.printf("%d%s%.2f%s%s%s%n", temperature, " degrees Fahrenheit is equeal to ", finalTemp, " Degrees Celsius ***", array[1], "***");
		else if (temperature >= 33 && temperature <= 50)
			System.out.printf("%d%s%.2f%s%s%s%n", temperature, " degrees Fahrenheit is equeal to ", finalTemp, " Degrees Celsius ***", array[2], "***");
		else if (temperature >= 51 && temperature <= 60)
			System.out.printf("%d%s%.2f%s%s%s%n", temperature, " degrees Fahrenheit is equeal to ", finalTemp, " Degrees Celsius ***", array[3], "***");
		else if (temperature >= 61 && temperature <= 70)
			System.out.printf("%d%s%.2f%s%s%s%n", temperature, " degrees Fahrenheit is equeal to ", finalTemp, " Degrees Celsius ***", array[4], "***");
		else if (temperature >= 71 && temperature <= 90)
			System.out.printf("%d%s%.2f%s%s%s%n", temperature, " degrees Fahrenheit is equeal to ", finalTemp, " Degrees Celsius ***", array[5], "***");
		else if (temperature > 90)
			System.out.printf("%d%s%.2f%s%s%s%n", temperature, " degrees Fahrenheit is equeal to ", finalTemp, " Degrees Celsius ***", array[6], "***");
		}
		else if (finalTemp < -75 || finalTemp > 150)
			System.out.print("Temperature is out of bounds.");
	}
}