package p1;

public class GreaterValue{
	int value=0;
	int greater(Integer a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i]>value) {
				value=a[i];
			}
		}
		return value;
	}
}

