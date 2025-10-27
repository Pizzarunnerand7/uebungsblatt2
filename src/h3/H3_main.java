package h3;

public class H3_main {
	public static void main(String[] args) {
		int i = 300;
		int j = 400;
		int k;
		k = -10;
		boolean a1 = i > j;
		boolean a2 = i > 200;
		boolean a3 = j > 100;
		if (a1) {
			if (a2) {
				if (a3) {
					k = 3;
				}
				if (!a3) {
					k = 2;
				}
			}
			if (!a2) {
				if (!a3) {
					k = 1;
				}
			}
		}
		if (!a1) {
			if (!a2) {
				if (!a3) {
					k = 4;
				}
			}
		}
	}

}
