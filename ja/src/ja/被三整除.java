package ja;
import java.util.*;
public class 被三整除 {
  public static void main(String[] args) {
	  System.out.print("请输入一个数");
	  Scanner scanner=new Scanner(System.in);
	  int N=scanner.nextInt();
	  for( int i=1;i<N;i++){
		  if(i%2==0&&i%3==0){
			 System.out.print(i);
		  }
	  }
	  
	  
		
		

	}

}
