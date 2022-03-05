/*==================================
Foundations of Computer Science
Student: Zan Li
id: a1750906
Semester: 1
Year: 2019
Practical Exam Number: 03
===================================*/
import java.util.*;

public class Garage{
	Scanner input = new Scanner(System.in);
	private int numPlayers;
	private int cars = 10;		
	int [] carIds = new int[];

	public void setNumPlayers(int numPlayers){
		this.numPlayers = numPlayers;
	}
	public int getNumplayers(){
		return numPlayers;
	}
	public void setCars(int cars){
		this.cars = cars;
	}
	public int getCars(){
		return cars;
	}

    /**
    * Given a numPlayer, perform refill(100) and displayTravel() for each vehicle;
    *
    * @param int numPlayers
    */
	public void serviceCar(int numPlayers){

	}

	/**
    * Given n in numPlayer, serviceCar(n)
    */
	public void serviceCars(){

	}

	/**
    * This method aims to set a position numPlayer of the array cars a typeVehicle (1: Ferrari, 2: Porche and 3: Tesla);
    *
    * @param int numPlayers, int cars
    */
	public void setCar(int numPlayers, int cars){

	}
    
    /** 
    * This methods aims to set a list of cars, where each element in the array corresponds to values of Ferrari (1), 
    * Porche (2), or Tesla (3), and the index of the array corresponds to the numPlayer; This method depends on the 
    * method setCar
    *
    */
	public void setCars(int [] carIds){

	}

}