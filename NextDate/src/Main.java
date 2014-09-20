
public class Main {
	public static void main(String []args){
		try{
			Date today1 = new Date(29, 2, 2012);
			today1.nextDate();
			Date today2 = new Date(28, 2, 2012);
			today2.nextDate();
			Date today3 = new Date(28, 2, 2011);
			today3.nextDate();
			Date today4 = new Date(31, 12, 2011);
			today4.nextDate();
			Date today5 = new Date(0, 12, 2011);
			today5.nextDate();
		}
		catch(Exception e){
			System.err.print("Invalid Input");
		}
	}
}
