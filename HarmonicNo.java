import java.util.Scanner;
class HarmonicNo
{
        public static void main(String[] args)
        {
                Scanner sc=new Scanner(System.in);
                int num=sc.nextInt();
       		if(num>0)			        
		 {
			float h=0; 
			for(int i=1;i<=num;i++)
                        {
				h=h+(float)1/i;	


			 }
		System.out.println(h);	
		 }
                else
                {
                        System.out.println("Please Enter a number which is greatear than zero");
                }
        }
}       

