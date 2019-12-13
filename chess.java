public class chess{
	static int chess1=0;
	static int chess2=0;
	static int chess3=0;
	static int chess4=0;
	static int chess5=0;
	static int chess6=0;
	static int chess7=0;
	static int chess8=0;
	static int chess9=0;
	static char place1=' ';
	static char place2=' ';
	static char place3=' ';
	static char place4=' ';
	static char place5=' ';
	static char place6=' ';
	static char place7=' ';
	static char place8=' ';
	static char place9=' ';
	static int winans=0;
	public static void main(String[] args){
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.println("Welcome to the noughts-and-crosses game");
		System.out.println("The board is like this, when you want to put chess there, just enter the number on that place:");
		System.out.println("1    2    3");
		System.out.println("4    5    6");
		System.out.println("7    8    9");
		System.out.print("it's first person's turn:");
		chess1=s.nextInt();
		if(chess1<1||chess1>9 ){
				System.out.println("sorry,you enter the wrong number, please restart.");
				return;
			}
		chess.step(chess1);
			
		
		chess.print();
		System.out.print("now is second person's turn:");
		chess2=s.nextInt();
		if(chess2<1||chess2>9 ){
				System.out.println("sorry,you enter the wrong number, please restart.");
				return;
	}
		chess.step(chess2);
		
		chess.print();
		System.out.print("now is first person's turn:");
		chess3=s.nextInt();
		if(chess3<1||chess3>9 ){
				System.out.println("sorry,you enter the wrong number, please restart.");
				return;
	}
		chess.step(chess3);
		
		chess.print();
		System.out.print("now is second person's turn:");
		chess4=s.nextInt();
		if(chess4<1||chess4>9 ){
				System.out.println("sorry,you enter the wrong number, please restart.");
				return;
	}
		chess.step(chess4);
		
		chess.print();
		System.out.print("now is first person's turn:");
		chess5=s.nextInt();
		if(chess5<1||chess5>9 ){
				System.out.println("sorry,you enter the wrong number, please restart.");
				return;
	}
		chess.step(chess5);
		
		chess.print();
		chess.win();
		if (winans==1){
			
			return;
		}
		System.out.print("now is second person's turn:");
		chess6=s.nextInt();
		if(chess6<1||chess6>9 ){
				System.out.println("sorry,you enter the wrong number, please restart.");
				return;
	}
		chess.step(chess6);
		
		chess.print();
		chess.win();
		if (winans==2){
			
			return;
		}
		System.out.print("now is first person's turn:");
		chess7=s.nextInt();
		if(chess7<1||chess7>9 ){
				System.out.println("sorry,you enter the wrong number, please restart.");
				return;
	}
		chess.step(chess7);
		
		chess.print();
		chess.win();
		if (winans==1){
			
			return;
		}
		System.out.print("now is first person's turn:");
		chess8=s.nextInt();
		if(chess8<1||chess8>9 ){
				System.out.println("sorry,you enter the wrong number, please restart.");
				return;
	}
		chess.step(chess8);
		
		chess.print();
		chess.win();
		if (winans==2){	
			return;
		}
		System.out.print("now is first person's turn:");
		chess9=s.nextInt();
		if(chess9<1||chess9>9 ){
				System.out.println("sorry,you enter the wrong number, please restart.");
				return;
	}
		chess.step(chess9);
		
		chess.print();
		chess.win();
		if (winans==1){
			return;
		}else if(winans==0){
			System.out.println("Not one wins");
		}
		
	}
	public static void print(){
	System.out.println(place1+"    "+place2+"    "+place3);	
	System.out.println();	
	System.out.println(place4+"    "+place5+"    "+place6);	
	System.out.println();	
	System.out.println(place7+"    "+place8+"    "+place9);	
	}
	public static void step(int x){
		
		
		switch(x){
			
			case 1:
			if (place1=='O'||place1=='X'){
				System.out.println("You choose the wrong place, you lose the turn.");
			}else if (chess1==x||chess3==x||chess5==x||chess7==x||chess9==x){
				place1='O';
			}else{
				place1='X';
			}
			break;
			
			case 2:
			if (place2=='O'||place2=='X'){
				System.out.println("You choose the wrong place, you lose the turn.");
			}else if (chess1==x||chess3==x||chess5==x||chess7==x||chess9==x){
				place2='O';
			}else{
				place2='X';
			}
			break;
			
			case 3:
			if (place3=='O'||place3=='X'){
				System.out.println("You choose the wrong place, you lose the turn.");
			}else if (chess1==x||chess3==x||chess5==x||chess7==x||chess9==x){
				place3='O';
			}else{
				place3='X';
			}
			break;
			
			case 4:
			if (place4=='O'||place4=='X'){
				System.out.println("You choose the wrong place, you lose the turn.");
			}else if (chess1==x||chess3==x||chess5==x||chess7==x||chess9==x){
				place4='O';
			}else{
				place4='X';
			}
			break;
			
			case 5:
			if (place5=='O'||place5=='X'){
				System.out.println("You choose the wrong place, you lose the turn.");
			}else if (chess1==x||chess3==x||chess5==x||chess7==x||chess9==x){
				place5='O';
			}else{
				place5='X';
			}
			break;
			
			case 6:
			if (place6=='O'||place6=='X'){
				System.out.println("You choose the wrong place, you lose the turn.");
			}else if (chess1==x||chess3==x||chess5==x||chess7==x||chess9==x){
				place6='O';
			}else{
				place6='X';
			}
			break;
			
			case 7:
			if (place7=='O'||place7=='X'){
				System.out.println("You choose the wrong place, you lose the turn.");
			}else if (chess1==x||chess3==x||chess5==x||chess7==x||chess9==x){
				place7='O';
			}else{
				place7='X';
			}
			break;
			
			case 8:
			if (place8=='O'||place8=='X'){
				System.out.println("You choose the wrong place, you lose the turn.");
			}else if (chess1==x||chess3==x||chess5==x||chess7==x||chess9==x){
				place8='O';
			}else{
				place8='X';
			}
			break;
			
			case 9:
			if (place9=='O'||place9=='X'){
				System.out.println("You choose the wrong place, you lose the turn.");
			}else if (chess1==x||chess3==x||chess5==x||chess7==x||chess9==x){
				place9='O';
			}else{
				place9='X';
			}
			break;
			
			
	}
}
	public static void win(){
		 if(place3=='O'&&place5=='O'&&place7=='O'){
			winans=1;
			System.out.println("The first  person wins");
			
		}else if(place1=='O'&&place3=='X'&&place9=='O'){
			
			winans=1;
			System.out.println("The first person wins");
			
		}else if(place1=='O'&&place2=='O'&&place3=='O'){
			
			winans=1;
			System.out.println("The first person wins");
			
		}else if(place4=='O'&&place5=='O'&&place6=='O'){
			
			winans=1;
			System.out.println("The first person wins");
			
		}else if(place7=='O'&&place8=='O'&&place9=='O'){
			
			winans=1;
			System.out.println("The first person wins");
			
		}else if(place1=='O'&&place4=='O'&&place7=='O'){
			
			winans=1;
			System.out.println("The first person wins");
			
		}else if(place2=='O'&&place5=='O'&&place8=='O'){
			
			winans=1;
			System.out.println("The first person wins");
			
		}else if(place3=='O'&&place6=='O'&&place9=='O'){
			
			winans=1;
			System.out.println("The first person wins");
			
		}else if(place3=='X'&&place5=='X'&&place7=='X'){
			winans=2;
			System.out.println("The second  person wins");
			
		}else if(place1=='X'&&place3=='X'&&place9=='X'){
			
			winans=2;
			System.out.println("The second person wins");
			
		}else if(place1=='X'&&place2=='X'&&place3=='X'){
			
			winans=2;
			System.out.println("The second person wins");
			
		}else if(place4=='X'&&place5=='X'&&place6=='X'){
			
			winans=2;
			System.out.println("The second person wins");
			
		}else if(place7=='X'&&place8=='X'&&place9=='X'){
			
			winans=2;
			System.out.println("The second person wins");
			
		}else if(place1=='X'&&place4=='X'&&place7=='X'){
			
			winans=2;
			System.out.println("The second person wins");
			
		}else if(place2=='X'&&place5=='X'&&place8=='X'){
			
			winans=2;
			System.out.println("The second person wins");
			
		}else if(place3=='X'&&place6=='X'&&place9=='X'){
			
			winans=2;
			System.out.println("The second person wins");
			
		}else{
			
		}
	
}
}
