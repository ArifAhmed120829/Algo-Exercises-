package Task;

public class t3 {

	public static void main(String[] args) {
	int f = 3;
	int s = 3;
	int t = 3;
	check(f,s,t);
	}

	private static void check(int f, int s, int t) {
		if(f==s && s==t) System.out.println("equal");
		else System.out.println("not equal");
		
	}

}
