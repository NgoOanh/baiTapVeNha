
public class function {
	String triangle(int a, int b, int c){
		String result = null;
		if(a>=b+c||b>=a+c||c>=a+b){
			result = "Not A Triangle";
		}
		else{
			
			if((a==b) && (c==b)) result = "Equilateral";
			else{
				if(a!=b && b!=c && a!=c) result = "Scalene";
				else result = "Isosceles";
			}
			if((a*a+b*b==c*c) || (a*a+c*c==b*b) || (c*c+b*b==a*a)) result = "right triangle";
		}
		
		return result;
	}
}
