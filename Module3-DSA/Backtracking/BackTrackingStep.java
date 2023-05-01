// BackTracking -Array

class BackTrackingStep{
    public static void changeArr(int[] arr,int i, int val){
        //base case
        if( i == arr.length){
            printArr(arr); // 1 2 3 4 5 
            return;
        }
        //Recursion (Kaam)
        arr[i] = val;
        changeArr(arr, i+1, val+1); // fnx call step
        arr[i] = arr[i] - 2;      // Backtracking step - recursion call se jab vapas aate hai
    }
    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();  
    }
    public static void main(String[] args){
        int[] arr = new int[5];
        changeArr(arr,0,1);  
        System.out.println("After change array");
        printArr(arr);  //  -1 0 1 2 3

    }
}