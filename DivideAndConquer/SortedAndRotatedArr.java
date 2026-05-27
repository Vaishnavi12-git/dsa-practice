class SortedAndRotatedArr {

    public static int search(int arr[], int target, int start, int end){

        //base case
        if(start > end){
            return -1;
        }

        int mid = start + (end - start)/2;

        //target on mid
        if(arr[mid] == target){
            return mid;
        }
        
        //target on L1
        if(arr[start] <= arr[mid]){
            //left
            if(arr[start] <= target && target <= arr[mid]){
                return search(arr, target, start, mid-1);
            }
            else{       
                //right
                return search(arr, target, mid+1, end);
            }
        }
        else {   
            //target on L2
            //right
            if(arr[mid] <= target && target <= arr[end]){
                return search(arr, target, mid+1, end);
            }
            else{           
                //left
                return search(arr, target, start, mid-1);
            }
        }

    }

    public static void main(String args[]){
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}