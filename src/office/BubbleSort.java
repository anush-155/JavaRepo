package office;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[] a = {22,35,3,5,3223,6,33,-12,0,0};
  int temp, l = a.length;
 for(int c=0;c<l;c++) { 
  for(int i=0;i<l-1-c;i++) {
  if(a[i]>a[i+1]) {
	  temp = a[i];
	  a[i] = a[i+1];
	  a[i+1] = temp;
	  
  }}}
        for(int q:a) {
		System.out.println(q);
		
	

}}}
