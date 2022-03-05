public class DataStructure implements Structurable{

	public int[] sort(int[] array){
		if(array.length == 0)
			throw new UnsupportedOperationException ("No elements.");
		for(int i=0; i<array.length-1; i++){
			for(int j = i+1; j<array.length; j++){
				if(array[i]<array[j]){
				    int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		return array;
	}

	public int search(String [] array, String value){
		if(array.length == 0)
			throw new UnsupportedOperationException ("​No elements.");
		for(int i=0; i< array.length; i++){
			if(array[i].equals(value)){
				return i;
			}
		}
		return -99;
	}
}