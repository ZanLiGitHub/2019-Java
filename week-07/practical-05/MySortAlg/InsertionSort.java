//==================================
// Foundations of Computer Science
// Student: Zan Li
// id: a1750906
// Semester: 1
// Year: 2019
// Practical Number: 05
//===================================

import java.util.*;

public class InsertionSort extends MySortAlg{

    public int[] sort (int[] array){

		int n = array.length;
		int tmp, i, j;


		for(i = 1; i<n; i++){
			tmp = array[i];
			for (j = i-1; j>=0; j--){
				if (array[j] < tmp){
					array[j+1] = array[j];
				}else{
					break;
				}
			}

			if (array[j+1] != tmp){
				array[j+1] = tmp;
			}
		}
  		return array;
	}
}