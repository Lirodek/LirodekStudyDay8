package org.newDay08.text;
import static java.lang.System.out;
class ArrayUtill{
	public static int [] concat(int[] a,int[] b) {
		int langs = a.length+b.length;
		int al = a.length;
		int[] c=new int[langs];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[al+i] = b[i];
		}
		return  c;
	}
	public void print(int[] c) {
		out.print("[ ");
		for(int i=0;i<c.length;i++) {
			out.print(c[i]+" ");
		}
		out.print("]");
	}
}
public class staticEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayUtill au = new ArrayUtill();
		int[] array1 = {1,5,7,9};
		int[] array2 = {3,6,-1,100,77};
		int[] array3 = ArrayUtill.concat(array1, array2);
		au.print(array3);
	}

}
