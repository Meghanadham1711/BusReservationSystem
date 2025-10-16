package firstProject;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	Booking()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your Name:");
		passengerName=scn.nextLine();
		
		System.out.println("Enter Bus Number you went to Book");
		busNo=scn.nextInt();
		System.out.println("Enter date dd-mm-yyyy: ");
		String dateInput=scn.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses)
	{
		int capacity=0;
		for(Bus bus:buses)
		{
			if(bus.getBusNo()==busNo)
			{
				capacity=bus.getCapacity();
			}
		}
		int booked=0;
		for(Booking b:bookings)
		{
			if(b.busNo==busNo && b.date.equals(date))
			{
				booked++;
			}
		}
		
		return booked<capacity?true:false;
	}
	

}
