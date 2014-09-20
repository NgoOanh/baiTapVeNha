package junit;
public class Main {
	int uscln(int a, int b)
	{
	    while (a>0 && b>0 && a!=b)
	    {
	        if (a>b) a = a % b;
	        else b = b % a;
	    }
	    if (a==0) return b;
	    else return a;
	}
}
