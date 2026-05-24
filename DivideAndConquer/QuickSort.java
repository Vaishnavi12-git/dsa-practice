class QuickSort {

public static void printarr(int arr[]){
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}

public static void quickSort(int arr[], int start, int end){
    if(start >= end){
        return;
    }

    //last element
    int pIdx = partition(arr, start, end);
    quickSort(arr, start, pIdx-1); //left part
    quickSort(arr, pIdx+1, end); //right part
}

public static int partition(int arr[], int start, int end){
    int pivot = arr[end];
    int i = start-1; //to make place for elem smaller than pivot

    for(int j=start; j<=end-1; j++){
        if(arr[j] <= pivot){
            i++;
            //swap
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }
    //To store pivot
    i++;
    int temp = pivot;
    arr[end] = arr[i];
    arr[i] = temp;
    
    return i;
}

    public static void main(String args[]) {
        int arr[] = {2, 3, 9, 8, 6, 5};
        quickSort(arr, 0, arr.length-1);
        printarr(arr);
    }
}