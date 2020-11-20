package Tandem20;

	public class CircleProgram  {
		private String r;
		private String d;
		private String C;
		private String S;
	
	
	
	CircleProgram (){
		this.r = "3";
		this.d = "6";
		
		this.C = "(2 * Math.PI  * r) ";
		this.S = "Math.PI * ( r * r)";
	}
	CircleProgram (String r , String d , String C , String S) {
		this.r = "3";
		this.d = "6";
		this.C = "(2 * Math.PI  * r) ";
		this.S = "Math.PI * ( r * r)";	
	}
	public void scream () {
		System.out.println( "C" );
		System.out.println( "S" );
		}
		@Override
		public String toString () {
			return "Rectangle [r = " + r + ",d = " + d + ", C = " + C + ", S = " + S + " ]";
		} 
	}


