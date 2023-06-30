//Find a non-unique duplicate in an array of integers
import java.util.Scanner; 
class Task5 
{ 
    public static void main(String[] args)
    { 
        int i,j,n,p=0; 
        Scanner sc=new Scanner(System.in); 
        n=sc.nextInt(); 
        int []a=new int[n]; 
        for(i=0;i<a.length;i++)
        { 
            a[i]=sc.nextInt(); 
        } 
        for(i=0;i<a.length-1;i++)
        {  
            int count=1;
            for(j=i+1;j<a.length;j++) 
            { 
                if(a[i]==a[j]) 
                 count++;
            } 
            if(count==2)
            { 
                System.out.println(a[i]+" ");
                p=1;
            } 
        } 
        if(p!=1) 
        { 
            System.out.println(-1);
        }
    }
}