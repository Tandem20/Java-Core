package Tandem20;

public class Rectangle {
	
	private String a;
	private String b;
	private String P;
	private String S;
	
	Rectangle (){
		this.a = "3";
		this.b = "4";
		this.P = "(a + b) * 2";
		this.S = "(a * b) ";

	}
	Rectangle (String a , String b , String P , String S) {
		this.a = "3";
		this.b = "4";
		this.P = "(a + b) * 2";
		this.S = "(a * b) ";	
	}
		
		
		public void scream () {
		System.out.println( "P" );
		System.out.println( "S" );
		}
		@Override
		public String toString () {
			return "Rectangle [a = " + a + ",b = " + b + ", P = " + P + ", S = " + S + " ]";
		} 	 
		
		
		
		
	}
	



		  

