package ja;

public class ¾Å¾Å³Ë·¨±í {

	public static void main(String[] args) {
	  int[] a=new int[] {1,2,3,4,5,6,7,8,9};
	  int[] b=new int[] {1,2,3,4,5,6,7,8,9};
	  for(int i=1;i<=a.length;i++){
		  for(int j=1;j<=i;j++){
			  System.out.printf("%dX%d=%d ",j, i, i*j);
		  }
		  System.out.println(); 
	  }

	}

}
