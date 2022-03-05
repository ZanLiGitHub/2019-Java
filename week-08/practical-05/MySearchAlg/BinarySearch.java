class BinarySearch extends MySearchAlg{

    /**
    * Returns index of x if it is present in array[], else return -1
    *
    * @return int i
    * @param  int arr[], int query
    */
    public int search(int arr[], int query){

        return binarySearch(arr, 0, arr.length, query);
    }


    private int binarySearch(int arr[], int lower, int upper, int x){
        
        if (upper >= lower){
            int mid = (lower + upper)/2;
 
            if (arr[mid] == x)
                return mid;

            else if (arr[mid] > x)
                return binarySearch(arr, lower, mid-1, x);
 
            else if (arr[mid] < x)
                return binarySearch(arr, mid+1, upper, x);
 
        }

        return -1;
    }
}