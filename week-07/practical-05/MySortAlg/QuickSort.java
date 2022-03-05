//==================================
// Foundations of Computer Science
// Student: Zan Li
// id: a1750906
// Semester: 1
// Year: 2019
// Practical Number: 05
//===================================
public class QuickSort extends MySortAlg{

	public int[] sort (int[] array){
		quickSort(array, 0, array.length-1);
		for (int i = 0; i < array.length / 2; i++) {
        int temp = array[i];
        array[i] = array[array.length - 1 - i];
        array[array.length - 1 - i] = temp;
        }
        
        return array;
        
	}

	public void quickSort(int array[], int low, int high) {
        int i, j, temp;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        temp = array[i]; 
        while (i < j) { 
            while (i < j && array[j] >= temp)
                j--;
            if (i < j)
                array[i++] = array[j];
            while (i < j && array[i] < temp)
                i++;
            if (i < j) 
                array[j--] = array[i];
        }
        array[i] = temp;
        quickSort(array, low, i - 1); 
        quickSort(array, i + 1, high);

	}   
}