package search;
// java.util.Comparator의 정의

public interface ComparatorEx <T> {
	int compare(T o1, T o2);
	boolean equals(Object obj);
	
	/*
		public int compare(T d1, T d2) {
			if(d1 > d2) return 양수;
			if(d1 < d2) return 음수;
			if(d1 == d2) return 0;
		}
	*/
}
