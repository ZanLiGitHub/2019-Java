//==================================
// Foundations of Computer Science
// Student: Zan Li
// id: a1750906
// Semester: 1
// Year: 2019
// Practical Number: 04
//===================================

import java.util.*;

public class ShakingParty{
	
	private int nPeople; 
	Random r = new Random();
	
	ShakingParty (){
		nPeople = r.nextInt(50);
	}
    ShakingParty (int nTmp){
        nTmp = nPeople;
    }

	/**
	* Sets number of people, the first people shakehands for n-1 times, the next person shakehands for (n-1)-1 times,
	* so we can solve this problem by using recursion.
	*
	* @param int nPeopke
	* @return int count
	*/
	public int countHandShakes(int nPeople){
		int count = 0;
		if(nPeople == 0){
			count = 0;
		}
		else{
			count = (nPeople - 1) + countHandShakes(nPeople - 1);
		}
		return count;
	}
} 