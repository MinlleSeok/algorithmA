package test;

public class Eratos {

	static void eratos(int n) {
		boolean[] chk = new boolean[101];
		chk[0] = chk[1] = true;
		for (int i = 2; i * i <= n; i++) {
			if (chk[i])
				continue;
			for (int j = i * 2; j <= n; j += i)
				chk[j] = true;
		}
	}
}
