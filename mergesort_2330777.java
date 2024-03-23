import java.util.*;
class mergesort_2330777{
  public static void merge(ArrayList<Integer> array, int x, int y, int z){
      int a1 = y - x + 1;
      int a2 = z - y;
      int A[] = new int[a1];
      int B[] = new int[a2];
      for (int p = 0; p < a1; p++)
         A[p] = array.get(x + p);
      for (int q = 0; q < a2; q++)
         B[q] = array.get(y + 1 + q);
      int p, q, r;
      p = 0;
      q = 0;
      r = y;
      while (p < a1 && q < a2) {
        if (A[p] <= B[q]) {
        array.set(r, A[p]);
        p++;
        } else {
        array.set(r, B[q]);
        q++;
        }
        r++;
      }
      while (p < a1) {
       array.set(r, A[p]);
       p++;
       r++;
      }
      while (q < a2) {
       array.set(r, B[q]);
       q++;
       r++;
      }
  }
  public static void mergeSort(ArrayList<Integer> array, int right, int left) {
     if (left < right) {
       int mid = (left + right) / 2;
       mergeSort(array, left, mid);
       mergeSort(array, mid + 1, right);
       merge(array, left, mid, right);
     }
  }
  public static void main(String args[]){
     ArrayList<Integer> getnum = getNumbers();
     System.out.println(getnum);
     mergeSort(getnum,0,getnum.size()-1);
     System.out.println("SortedArray: ");
     getOutput(getnum);
  }
  public static void getOutput(ArrayList<Integer> getNum){
     for (int i = 0; i < getNum.size(); i++){
      System.out.println(getNum.get(i));
     }
  }
  public static ArrayList<Integer> getNumbers(){
     ArrayList<Integer> digits = new ArrayList<Integer>();
     digits.add(10);
     digits.add(45);
     digits.add(67);
     digits.add(4);
     digits.add(12);
     digits.add(80);
     digits.add(30);
     return digits;
  }
}