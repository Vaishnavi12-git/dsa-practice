class MergeSort {

public static void printArr(int arr[]){
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }

    System.out.println();
}

public static void mergeSort(int arr[], int start, int end){
    //base case
    if(start >= end ){
        return;
    }

    //kaam
    int mid = start + (end - start)/2;
    mergeSort(arr, start, mid);
    mergeSort(arr, mid+1, end);

    merge(arr, start, mid, end);
}


public static void merge(int[] arr, int start, int mid, int end){
    int temp[] = new int[end-start+1];
    int i = start;  //For left part
    int j = mid+1;  //For right part 
    int k = 0;      //For temp array

    while(i <= mid && j <= end){
        if(arr[i] > arr[j]){
            temp[k] = arr[j];
            j++;
        }else {
            temp[k] = arr[i];
            i++;
        }
        k++;
    }
    
    //To add remaining elements
    while( i <= mid){
        temp[k++] = arr[i++];
    }

    while( j <= end){
        temp[k++] = arr[j++];
    }

    //Copy temp to original array
    for(k=0, i=start; k<temp.length; k++,i++){
        arr[i] = temp[k];
    }
}

public static void main(String args[]){
    int[] arr = {6, 3, 9, 5, 2, 8, -4};
    mergeSort(arr, 0, arr.length-1);
    printArr(arr);
}

}