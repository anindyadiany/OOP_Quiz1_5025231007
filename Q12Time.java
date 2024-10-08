package Q12;

public class Q12Time {
    	//properties and fields which is minute and hours
	private int minute;
	private int hour;
	//constructor Q12Time
	public Q12Time(int hour, int minute) {
		super();
		this.minute = minute;
		this.hour = hour;
	}
	//method to calculate the angle 
	public int Angle() {
		//to take care of the hours >12, since we're using military time
		if(hour>12) {
			hour= hour - 12;
		}
		//calculating the angle of minutes and hours, as stated in the problem
        int angleMinutes = minute * 6;
        int angleHour = (30 * hour) + (minute/2); 
        
        //total is the angle of minute+hour
        int total = angleMinutes+angleHour;
        //but if the total exceeds 360, the the angle would be 360 minus the tota;
        if (total>360) {
        	total = angleMinutes-angleHour;
        	return 360-total;
        }else {
        	return total;
        }
        
	}
	
	public static void main(String[] args) {
		//testing test cases
		Q12Time angle = new Q12Time(2, 30);
		Q12Time angle2 = new Q12Time(4, 41);
		Q12Time angle3 = new Q12Time(9, 00);
		Q12Time angle4 = new Q12Time(3, 00);
		Q12Time angle5 = new Q12Time(18, 00);
		Q12Time angle6 = new Q12Time(1, 00);
		System.out.println("the angle is " + angle.Angle() + " degrees");
		System.out.println("the angle is " + angle2.Angle() + " degrees");
		System.out.println("the angle is " + angle3.Angle() + " degrees");
		System.out.println("the angle is " + angle4.Angle() + " degrees");
		System.out.println("the angle is " + angle5.Angle() + " degrees");
		System.out.println("the angle is " + angle6.Angle() + " degrees");
		
		
	}
}
