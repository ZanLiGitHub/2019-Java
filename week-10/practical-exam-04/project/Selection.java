/*
*   Foundations of Computer Science
*   2019, Semester 01
*   Practical-Exam-04
*
*   student (id): a1750906
*   student (name): ZanLi
*
* Note: in order to finish your exam you need to make changes in this class
* Problem 03
*/
import java.util.*;
public class Selection extends Sort{

	@Override
	public int [] sortIntByIndex(int [] arr){
		for(int i=0; i<arr.length-1; i++){
			int min = i;
			for(int j = i+1; j<arr.length; j++){
				if(arr[min] > arr[j]){
					min = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
		}
		return arr;
	}

	@Override
	public int [] sortInt(int [] arr){
		throw new java.lang.UnsupportedOperationException("Not implemented yet!");
	}


	@Override
	public int [] sortStringByIndex(String [] arr){
		for(int i=0; i<arr.length-1; i++){
			int min = i;
			for(int j = i+1; j<arr.length; j++){
				if(arr[min].compareTo(arr[j])>0){
					min = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
		}
		return arr;
	}

	@Override
	public String [] sortString(String [] arr){
		for(int i=0; i<arr.length-1; i++){
			int min = i;
			for(int j = i+1; j<arr.length; j++){
				if(arr[min].compareTo(arr[j])>0){
					min = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
		}
		return arr;
	}
}
