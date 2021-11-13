

public class PatternUseFor {

	int r = 6;
	int c = 6;
	int col,row;
	{
		for (int row = 0; row < r; row++) {
			for (int col = 0; col < c; col++) {
				System.out.print("\t"+"*");
			}
			System.out.println();
		}

		for (int row = 0; row <= r; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print("\t"+"*");
			}
			System.out.println();
		}
		for (int row = 0; row <= r; row++) {
			for (int col = 6; col >= row; col--) {
				System.out.print("\t"+ "*");
			}
			System.out.println();
		}	
	
		for(int row=1;row<=6;row++){
			for(int col=1;col<=5;col++){
			//System.out.print("");
			if(col>row  ){
				System.out.print("\t"+"*");
			}else{
				System.out.print(" ");
			}
		}
		System.out.println();	
		} 	
		
		for(int row=1;row<=5;row++){
			for(int col=1;col<=5;col++){
				if(row==col){
					System.out.print("*");
				}else
				if( row==5 ){
					System.out.print("*");
				}else if(col==1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int row=1;row<=5;row++){
			for(int col=1;col<=5;col++){
				if(row==1 ){
					System.out.print("*");
				}else
				if( col==5 ){
					System.out.print("*");
				}else if(col==row){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int row=1;row<=5;row++){
			for(int col=1;col<=5;col++){
				if(row==col){
					System.out.print("*");
				}else if(row+col==6){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int row=1;row<=5;row++){
			for(int col=1;col<=5;col++){
				if(row+col==6 && row>=col){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println( );
		}
}
}




