import java.util.*;

public class quick {
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int num = sc.nextInt();
		int list[] = new int[num];
		for(int i = 0; i<num; i++) {
			list[i] = sc.nextInt();
		}
		int lb = 0;
		int ub = num-1;
		quicksort(list,lb,ub);
		for(int l = 0; l<num; l++) {
			System.out.println(list[l]);
		}
}
	       public static void quicksort(int list[], int lb, int ub) {
		if (lb<ub) {
		    System.out.print("1");
			int sortin = sorting(list,lb,ub);
			quicksort(list,lb,sortin-1);
			quicksort(list,sortin+1,ub);
			System.out.print("2");
		}
               }
	public static int sorting(int list[], int lb, int ub) {
		int pivot = list[lb];
		int start = lb;
		int end = ub;
		while(start<end) {
			while(list[start]<=pivot) {
				start++;
			}
			while(list[end]>pivot) {
				end--;
			}
			if(start<end) {
				int temp = list[start];
				list[start] = list[end];
				list[end] = temp;
			}
		}
		int temp = list[lb];
		list[lb] = list[end];
		list[end] = temp;
		return end;
	}
}