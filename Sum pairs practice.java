//  Program to find the total number of pairs in the arrays whose sum is equal to the given value x
// practice

public class Main{

   static int twoSum(int[] arr, int target){
    int n = arr.length;
    int count = 0;

    for(int i = 0; i<n;i++){
      for(int j =i+1; j<n; j++){

        if(arr[i] + arr[j] == target){
          count++;
        }
      }
    }
    return count;

  }
  public static void main(String[] args) {
    int arr[] = {1,5,7,-1,5};
    int target = 6;
    System.out.println(twoSum(arr,target));
  }
}
