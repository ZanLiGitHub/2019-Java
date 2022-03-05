import java.util.*;

/**
* This is main class which performs the RPS game.
* a1750906/2019/s1/fcs/week-05/practical-04.
* 
* @Author Zan Li
* @Time 10/04/2019 
*/
public class Main{
	
	/**
	* Sets human player and computer player's name, then sets two int which represents
	* human and computer's move. Finally, compare two ints by using the referee method.
	*/
	public static void main(String[] args){
		Referee re = new Referee();
		String hname = re.humanName();
		String cname = re.computerName();
		int h = re.humanMove(hname);
		int c = re.computerMove(cname);
		re.referee(h, c, hname, cname);
	}
}