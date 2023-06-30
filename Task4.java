//Find a single duplicate in an array of integers 
import java.util.Scanner; 

class Task4
{ 
    public static void main(String[] args) {
        { 
            int i,j,n,p=0; 
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt(); 
            int[] a=new int[n]; 
            for(i=0;i<a.length;i++){ 
                a[i]=sc.nextInt();
            }
            for(i=0;i<a.length-1;i++)
            { 
                for(j=i+1;j<a.length;j++)
                { 
                     if(a[i]==a[j]) 
                     { 
                        System.out.println(a[j]+" "); 
                        p=1;
                        break;
                     }
                }
            } 
            if(p!=1)
            { 
                System.out.println(-1);
            }
        }
    }
}