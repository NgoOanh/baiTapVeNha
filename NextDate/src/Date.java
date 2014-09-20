
public class Date {
	private int day, month, year;
	public Date(){
		day = 1;
		month = 1;
		year = 1812;
	}
	public Date(int d, int m, int y)throws Exception{
		if(d<1 || d>31 || m <1 || m>12 || y < 1812) throw new Exception();
		day = d;
		month = m;
		year = y;
	}
	public String getDate(){
		return this.day+"/"+this.month+"/"+this.year;
	}
	public void nextDate(){
		try{Date tomorrow = new Date(this.day, this.month, this.year);
		if(this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 
				|| this.month == 8 || this.month == 10){
			if(this.day < 31) tomorrow.day = this.day+1;
			else{
				tomorrow.day = 1;
				tomorrow.month = this.month + 1;
			}
		}
		if(this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11){
			if(this.day < 30) tomorrow.day = this.day+1;
			else{
				tomorrow.day = 1;
				tomorrow.month = this.month + 1;
			}
		}
		if(this.month == 12){
			if(this.day<31) {
				tomorrow.day = this.day + 1;
			}
			else{
				tomorrow.day = 1;
				tomorrow.month = 1;
				tomorrow.year = this.year + 1;
			}
		}
		if(this.month == 2){
			if(this.year % 4 == 0 && this.year % 400 != 0){
				if(this.day < 29) tomorrow.day = this.day+1;
				else{
					tomorrow.day = 1;
					tomorrow.month = 3;
				}
			}
			else{
				if(this.day < 28) tomorrow.day = this.day + 1;
				else{
					tomorrow.day = 1;
					tomorrow.month = 3;
				}
			}
		}
		System.out.println("The next day of "+this.getDate()+ " is "+tomorrow.getDate());
		}catch(Exception e){
			System.out.print("Invalid Input");
		}
	}
}
