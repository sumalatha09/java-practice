package p1;

public class SmallerValue {
	int smaller(Integer a[]) {
		int sum=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<sum) {
				sum=a[i];
			}
		}
		return sum;
	}
}
