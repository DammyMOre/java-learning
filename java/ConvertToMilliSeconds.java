public class ConvertToMilliSeconds{

	public static void main(String[] args){

	long milliSeconds = System.currentTimeMillis();


	
	System.out.print(convertMillis(milliSeconds));

	}


public static String convertMillis(long millis){

	long milliSeconds = System.currentTimeMillis();

	long milliToSeconds = milliSeconds / 1000;

	long finalSeconds = milliToSeconds % 60;

	long minute = milliToSeconds / 60;

	long finalMinute = minute % 60;
	
	long hour = minute / 60;

	long hours = hour % 24;

	long finalHour = hours + 1;

	return String.format("%d : %d : %d", finalHour, finalMinute, finalSeconds);




}

}