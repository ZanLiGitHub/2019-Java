//==================================
// Foundations of Computer Science
// Student: Zan Li
// id: a1750906
// Semester: 1
// Year: 2019
// Practical Number: 04
//===================================

import java.util.*;

public class ShakingPartyConstrainted{
	
  	private int nCouples; 
  	private int nPeople = nCouples * 2;
	Random r = new Random();
	
	ShakingPartyConstrainted (){
		nCouples = r.nextInt(50);
	}
    ShakingPartyConstrainted (int nTmp){
        nTmp = nCouples;
    }
    
    /**
    * Sets number of people, the first people shakehands for n-1 times, the next person shakehands for (n-1)-1 times,
	* so we can solve this problem by using recursion.
	*
	* @param int nPeopke
	* @return int count1
	*/
	public int countHandShakes1(int nPeople){
		int count1 = 0;
		if(nPeople == 0){
			count1 = 0;
		}
		else{
			count1 = (nPeople - 1) + countHandShakes1(nPeople - 1);
		}
		return count1;
	}

    
    /**
    * Sets number of couples, the first couple shakehands for nCouples-1 times, the next person shakehands for (nCouples-1)-1 times,
	* so we can solve this problem by using recursion.
	*
	* @param int nCouples
	* @return int count2
	*/
	public int countHandShakes2(int nCouples){
		int count2 = 0;
		if(nCouples == 0){
			count2 = 0;
		}
		else{
			count2 = (nCouples - 1) + countHandShakes2 (nCouples - 1);
	    }
	    return count2;
	}

	/**
	* The final count for this shakingparty problem is the difference of count1 and count2 
	*
	* @param int count1
	* @param int count2
	* @param int count
	*/
	public int countHandShakes(int count1, int count2){
		int count = count1 - count2;
		return count;
	}
} 