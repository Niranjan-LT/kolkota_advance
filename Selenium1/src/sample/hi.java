package sample;
import java.util.Arrays;
public class hi {
	public static void main(String[] args) {
		int [] arr1= {1,4,6,3,2};
		int [] arr2= {8,5,4,2,7};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int[] res=new int[(arr1.length+arr2.length)];
		int pos=0;
		for(int a:arr1){
			res[pos]=a;
			pos++;
		}
		for(int a:arr2) {
			res[pos]=a;
			pos++;
		}
		Arrays.sort(res);
		for (int i = 0; i < res.length; i++){
			System.out.print(res[i]+" ");
		}
	}
}
