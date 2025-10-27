package h2;

public class H2_main {
	public static void main(String[] args) {
		int i = 3;
		int j = 5;
		int k = 6;
		int min = 0;
		int max = 0;
		if (i > j && i > k) {
			max = i;
		}
		if (j > k && j > i) {
			max = j;
		}
		if (k > j && k > i) {
			max = k;
		}
		if (i < j && i < k) {
			min = i;
		}
		if (j < k && j < i) {
			min = j;
		}
		if (k < i && k < j) {
			min = k;
		}
	}
}
