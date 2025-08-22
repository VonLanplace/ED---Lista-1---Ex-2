package controller;

public class Function{
  public static int find(int[] vec, int size,int min){
    if(min > vec[size]){
      min = vec[size];
    }
    // The recursive stops when the vector reaches size 0 or lower
    // since in this line it has already passed the test of min
    // it returns the value of min
    if(size < 1){
      return min;
    }else{
      // We check the values from the last to the first and each time
      // it loops the size decreases and since it is the checked index
      // that changes.
      return find(vec,size-1,min);
    }
  }
}
