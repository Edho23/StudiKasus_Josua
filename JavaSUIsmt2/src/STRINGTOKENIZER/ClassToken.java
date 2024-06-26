import java.util.*;

class ClassToken{
	public static void main(String args[]){
		String MathExpr=new String("100+3*A/10-100%C");
		String DelExpr= new String("+-*/%");
		
		StringTokenizer st= new StringTokenizer(MathExpr,DelExpr,true);
		
		System.out.println("String    = "+MathExpr);
		System.out.println("Delimiter = "+DelExpr);
		System.out.println();
		 
		System.out.println("Token Dengan Delimiter = ");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}

		System.out.println();
		StringTokenizer st1= new StringTokenizer(MathExpr,DelExpr,false);
		System.out.println("Token Tanpa Delimiter = ");
		while(st1.hasMoreTokens()){
			System.out.println(st1.nextToken());
		}
	}
}
