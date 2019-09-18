/**
* Description:  JiSuanQi
* Author:		Lai
* Date:			2019-9-16
*/
	 
public class JiSuanQi{
	public static void main(String[] args){
		//int res;
		int n1 = 12 ;
		int n2 = 24 ;
		int n3 = 16 ;
		int n4 = 3 ;
		double d ;
		double v1 = 10.0 ;
		double v2 = 3.1416 ;
		
		
		double res = (double)n1 / n4 ;
		System.out.printf(" res = %.2f\n",res);
		
		d = (double)n1 / n4 ;
		System.out.printf(" d = %.2f\n",d);
		
		res = (double)n3 / n4 ;
		System.out.printf(" res = %.2f\n",res);
		
		d = (double)n3 / n4 ;
		System.out.printf(" d = %.2f\n",d);
		
		d = (double)v1 / n4 ;
		System.out.printf(" d = %.2f\n",d);
		
		d = (double)v1 / v2 ;
		System.out.printf(" d = %.2f\n",d);
		
		res = n1 / n2 ;
		System.out.printf(" res = %.2f\n",res);
		
		d = (double)n1 / n2 ;
		System.out.printf(" d = %.2f\n",d);
		
		d = n1 / (double)n2 ;
		System.out.printf(" d = %.2f\n",d);
		
		d = (double)(n1 / n2);
		System.out.printf(" d = %.2f\n",d);
	}
	
}