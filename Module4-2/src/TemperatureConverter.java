
public class TemperatureConverter {
	int newTemp;
	char newLetter;	
	public String convertTemp (int temperature, char convertTo) {
		switch (convertTo) { 
			case 'F':  
				newTemp = (temperature - 32)*5/9;
				newLetter = 'C';
				break;
			case'C':
				newTemp = (temperature + 32)*9/5;
				newLetter = 'F';
				break;
			}
		String currentTemp = String.valueOf(newTemp);
		String tempType = String.valueOf(newLetter);
		return (currentTemp + " " +  tempType);
	 					
	}
	
		}
