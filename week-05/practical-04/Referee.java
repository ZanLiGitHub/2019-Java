import java.util.*;

/**
* This is a class that controls the game. Referee instantiates the players and control the flow of the RPS game.
* a1750906/2019/s1/fcs/week-05/practical-04.
* 
* @Author Zan Li
* @Time 10/04/2019 
*/
class Referee{
	Human human = new Human();
	Computer computer = new Computer();
	Scanner input = new Scanner(System.in);
    
    /**
    * Sets human player's name.
    *
    * @return a String hName
    */
	public String humanName(){
        System.out.print("Please insert your name: ");
		String hName = input.nextLine();
		return hName;
	}
    
    /**
    * Sets computer player's name.
    *
    * @return a String cName
    */
    public String computerName(){
        System.out.print("Please insert computer's name: ");
		String cName = input.nextLine();
		return cName;
	}
    
    /**
    * Asks human player to move, the input is restricted. User can only input Rock/rock/R/r for rock, 
    * Paper/paper/P/p for paper, Scissors/scissors/S/s for scissors. Other input will lead to an error
    * warnning, and a while loop will lead user to input again.
    * The printed information will use the setted name straightly.
    * When the move is rock, number h = 0. When the move is paper, number h = 1. When the move is 
    * scissors, number h = 2. This is for the futer referee part. 
    *
    * @param a String hName
    * @return an int h
    */
	public int humanMove(String hName){
		int h = 0;
        boolean loop = true;
		while(loop){
			String hMove = human.performMove();
			if (hMove.equals("Rock")||hMove.equals("rock")||hMove.equals("R")||hMove.equals("r")){
				System.out.println(hName+"'s move is: "+hMove);
				h = 0;
				loop = false;
			}else if (hMove.equals("Paper")||hMove.equals("paper")||hMove.equals("P")||hMove.equals("p")){
				System.out.println(hName+"'s move is: "+hMove);
				h = 1;
				loop = false;
			}else if (hMove.equals("Scissors")||hMove.equals("scissors")||hMove.equals("S")||hMove.equals("s")){
				System.out.println(hName+"'s move is: "+hMove);
				h = 2;
				loop = false;
			}else{
				System.out.println("Please insert a right form: Rock/rock/R/r; Paper/paper/P/p; Scissors/scissors/S/s");
				loop = true;
			}
		}
		return h;
    }
    
    /**
    * Asks computer player to move. 
    * The printed information will use the setted name straightly.
    * When the move is rock, number c = 0. When the move is paper, number c = 1. When the move is 
    * scissors, number c = 2. This is for the futer referee part. 
    *
    * @param a String cName
    * @return an int c
    */
    public int computerMove(String cName){
		int c = 0;
		String cMove = computer.performMove();
		if(cMove.equals("Rock")){
			System.out.println(cName+"'s move is: Rock");
			c = 0;
		}else if (cMove.equals("Paper")){
			System.out.println(cName+"'s move is: Paper");
			c = 1;
		}else if (cMove.equals("Scissors")){
			System.out.println(cName+"'s move is: Scissors");
			c = 2;
		}
		return c;
    }

    /**
    * Compare the two int which represents human and computer's moves.
    * The printed information will use the setted name straightly.
    * When h=0 and c=2 or h=1 and c=0 or h=2 and c=1, human player win.
    * When h=0 and c=1 or h=1 and c=2 or h=2 and c=0, computer player win.
    * When h equals c, draw.
    *
    * @param int h, int c, String hName, String cName
    */
    public void referee(int h, int c, String hName, String cName){ 
		if(h==0&&c==2||h==1&&c==0||h==2&&c==1){
            System.out.println("The winner is "+hName+"!");
		}else if (h==0&&c==1||h==1&&c==2||h==2&&c==0){
			System.out.println("The winner is "+cName+"!");
		}else{
			System.out.println("Draw");
		}
	}
}