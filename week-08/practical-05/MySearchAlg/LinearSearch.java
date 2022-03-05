class LinearSearch extends MySearchAlg{    
    public int search(int arr[], int query){
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == query)
                return i;
        }
        return -1;
    }
}