public class Main{
  static int countPairs(int[] arr1, int[] arr2, int m, int n, int x){
    int count = 0;

    for (int i = 0; i<m; i++){
      for(int j =0; j<n; j++){
        if(arr1[i] + arr2[j] == x){
          count++;
        }
      }
    }
    return count;
  }
  public static void main(String[] args) {
    int[] arr1 = {1,3,5,7};
    int[] arr2 = {2,3,5,8};
    int m = arr1.length;
    int n = arr2.length;
    int x = 10;

    System.out.println(("count = " + countPairs(arr1,arr2, m,n,x ) ));

  }
}