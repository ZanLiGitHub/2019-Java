//==================================
// Foundations of Computer Science
// Student: Zan Li
// id: a1750906
// Semester: 1
// Year: 2019
// Practical Number: 05
//===================================

import java.util.*;

public class MergeSort extends MySortAlg {

    public int[] sort (int[] array){
        mergeSort(array, 0, array.length-1);
        for (int i = 0; i < array.length / 2; i++) {
        int temp = array[i];
        array[i] = array[array.length - 1 - i];
        array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public void mergeSort(int[] array, int low, int high) {
        int mid = low + (high - low) / 2; 
        if(low < high) {
            mergeSort(array, low, mid); 
            mergeSort(array, mid+1, high);  
            mergeArray(array, low, mid, high);
        }
    }
    
    public void mergeArray(int[] array, int low, int mid, int high) {
        int[] temp = new int[mid-low+1]; 
        for(int i = 0, j = low; i < temp.length; i++, j++) {
            temp[i] = array[j]; 
        }
        int i = 0, j = mid+1, m = low;
        while(i < temp.length && j <= high) { 
            if(temp[i] <= array[j]) { 
                array[m] = temp[i];
                i++; m++;
                continue;
            }
            else {
                array[m] = array[j];
                m++; j++;
                continue;
            }
        }
        while(i < temp.length)
            array[m++] = temp[i++];
    }
}