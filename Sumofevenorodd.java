import java.util.Scanner;
public class Sumofevenorodd {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
        int sum_of_even=0,sum_of_odd=0;
        while(n!=0)
        {
            int temp=n%10;
            if(temp%2==0)
            {sum_of_even+=temp;}
            if(temp%2!=0)
            {sum_of_odd+=temp;}
            n=(int)(n/10);
        }
	    System.out.println(sum_of_even+"   "+sum_of_odd);
	}
}
