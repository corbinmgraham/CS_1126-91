public class temperatureConversionTest
{
	public static void main(String[] args)
	{
		temperatureConversion display = new temperatureConversion();
		if (args.length != 3)
	         System.out.printf(
	            "Error: Please re-enter the entire command, in this format:%n" + 
	            "java temperatureConversion (Temperature) (Scale to convert from) (Scale to convert to)%n");
		else
		{
			int temperature = Integer.parseInt(args[0]);
			
			String convert = args[1];
			String to = args[2];
			
			switch (convert)
			{
			case "c":
				
				switch (to)
				{
				case "f":
					
					display.displayF(temperature);
					break;
				default:
					System.out.println("Incorrect second operator entered.");
				}
				
				break;
			case "f":
				
				switch (to)
				{
				case "c":
					display.displayC(temperature);
					break;
				default:
					System.out.println("Incorrect second operator entered.");
				}
				
				break;
			default:
				System.out.println("Incorrect first operator entered.");
			}
			
			
		}
	}
}