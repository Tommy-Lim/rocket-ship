
public class RocketShip {
		
	//Top and Bottom Pyramid portion	
	public static void TopBottom(int scale){			
		for(int i=1; i<=scale*2-1; i++){
			for(int k=0;k<=scale*2-i-1;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("/");
			}
			System.out.print("**");
			for(int j=1;j<=i;j++){
				System.out.print("\\");
			}
			System.out.println();
		}
	}	
		
	
	//Horizontal line portion
	public static void HLine(int scale){	
		System.out.print("+");
		for(int i=1;i<=scale*2;i++){
			System.out.print("=*");
		}
		System.out.print("+");
		System.out.println();
	}
		
		
	//Upper middle section
	public static void UpperMid(int scale){
		for(int i=1; i<=scale; i++){
			System.out.print("|");	
			for(int j=1; j<=scale-i;j++){
				System.out.print(".");
			}
			for(int k=1;k<=i;k++){
				System.out.print("/\\");
			}
			for(int j=1; j<=scale-i;j++){
				System.out.print("..");
			}
			for(int k=1;k<=i;k++){
				System.out.print("/\\");
			}
			for(int j=1; j<=scale-i;j++){
				System.out.print(".");
			}
			System.out.print("|");
			System.out.println();
		}
	}	
		
		
	//Lower middle section
	public static void LowerMid(int scale){
		for(int i=1; i<=scale; i++){
			System.out.print("|");	
			for(int j=1; j<i; j++){
				System.out.print(".");
			}
			for(int k=1;k<=scale-i+1;k++){
				System.out.print("\\/");
			}
			for(int j=1; j<i; j++){
				System.out.print("..");
			}
			for(int k=1;k<=scale-i+1;k++){
				System.out.print("\\/");
			}
			for(int j=1; j<i; j++){
				System.out.print(".");
			}
			System.out.print("|");
			System.out.println();
		}
	}
	
		
}
