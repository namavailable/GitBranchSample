package GitBranchApp1_40;

public class MainApp_40 {

	public static void main(String[] args) {
		// leader 40
		System.out.println("1st version 40");
		// leader 40 new content
		Math cMath=new Math();
		System.out.println();
		System.out.println(cMath.add(10, 20));

	}

}

class Math {
	Math(){
		
	}
	int add(int a, int b) {
		return a + b;
	}
}