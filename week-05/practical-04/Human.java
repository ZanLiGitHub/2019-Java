import java.util.*; 

/**
* This is a class Human which extends Player, it includes a method performMove.
* a1750906/2019/s1/fcs/week-05/practical-04.
* 
* @Author Zan Li
* @Time 10/04/2019 
*/
class Human extends Player{
	private String name;
    public Human(){}
    public Human(String name){
        this.name = name;
    }
    public void setName(String name){
    	this.name = name;
    }
    public String getName(){
    	return name;
    }

	/**
	* The method requires user's input, and then return this input.
	*
	* @return The input from user.
	*/
    public String performMove(){
		String move;
		Scanner input = new Scanner(System.in);
        System.out.println("Please perform: ");
		move = input.nextLine();
        return move;
    }
}
