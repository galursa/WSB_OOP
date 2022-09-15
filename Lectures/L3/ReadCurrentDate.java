import java.util.Calendar;
import java.util.Formatter;

public class ReadCurrentDate {
	public static void main(String[] args) {
		Formatter date =  new Formatter();
		Calendar today = Calendar.getInstance();
		 date.format("%tr", today); 
		 System.out.println(date);
		 date.close();
		 
		//Now we want full name of month, week and year as four-digit number
		 Formatter date2 = new Formatter();
		 date2.format("%td %tB, %tA, %tY", today, today, today, today); 
		 System.out.println(date2);
		 date2.close();
	}
}
