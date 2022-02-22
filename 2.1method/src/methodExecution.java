
public class methodExecution {

public int multipynumbers(int a,int b) {
	int r=a*b;
	return r;
}

public static void main(String[] args) {

	methodExecution b=new methodExecution();
	int ans= b.multipynumbers(25,5);
	System.out.println("Multipilcation is :"+ans);
	}


}
