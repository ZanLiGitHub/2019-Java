/*
*   Foundations of Computer Science
*   2019, Semester 01
*   Practical-Exam-04
*
*   student (id): a1750906
*   student (name): ZanLi
*
* Note: in order to finish your exam you need to make changes in this class.
* Note that you have to implemented lines from 57 - 67
*
*/
import java.util.*;
public class Insertion extends Sort{

	@Override
	public int [] sortIntByIndex(int [] arr){
		int [] index = this.getIndex(arr.length);

		for(int i = 1; i < arr.length; i++){
			int key = arr[i];
			int keyIndex = index[i];
			int j = i - 1;
			while( j >= 0 && arr[j] > key){
				if(arr[j] > key){
					arr[j+1] = arr[j];
					index[j+1] = index[j];
					j--;
				}
			}
			arr[j+1] = key;
			index[j+1] = keyIndex;
		}
		return index;
	}

	@Override
	public int [] sortInt(int [] arr){
		int [] index = this.getIndex(arr.length);

		for(int i = 1; i < arr.length; i++){
			int key = arr[i];
			int keyIndex = index[i];
			int j = i - 1;
			while( j >= 0 && arr[j] > key){
				if(arr[j] > key){
					arr[j+1] = arr[j];
					index[j+1] = index[j];
					j--;
				}
			}
			arr[j+1] = key;
			index[j+1] = keyIndex;
		}
		return arr;
	}

	@Override
	public int [] sortStringByIndex(String [] arr){
		for(int i=1; i<arr.length; i++){
			for(int j=i; j>0; j--){
				if(arr[j].compareTo(arr[j-1])<0){
					int tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				}
			}
		}
		return arr;
	}

	@Override
	public String [] sortString(String [] arr){
		throw new java.lang.UnsupportedOperationException("Not implemented yet!");
	}


}