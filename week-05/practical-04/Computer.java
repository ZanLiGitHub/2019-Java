import java.util.*; 

/**
* This is a class Computer which extends Player, it includes a method performMove.
* a1750906/2019/s1/fcs/week-05/practical-04.
* 
* @Author Zan Li
* @Time 10/04/2019 
*/
class Computer extends Player{
    private String name;
    public Computer(){}
    public Computer(String name){
        this.name = name;
    }
    public void setName(String name){
    	this.name = name;
    }
    public String getName(){
    	return name;
    }

	/**
	* The method choose a number from 0to2 randomly, and then return a represented String.
	* 0 represents Rock, 1 represents Paper, 2 represents Scissors.
	*
	* @return The represented String.
	*/
    public String performMove() { 
    	Random random = new Random();
        int number = random.nextInt(3);
        String move = "";
        if(number==0){
            move = "Rock";
		}else if (number==1){
			move = "Paper";
		}else if (number==2){
			move = "Scissors";
		}
        return move;
    }
}