//Create a named loop

public class Task3 
{  
public static void main(String args[])  
{  
int i, j;  
//outer loop  
outer:     //label  
for(i=1;i<=5;i++)  
{  
System.out.println();  
//inner loop  
inner:      //label  
for(j=1;j<=10;j++)  
{  
System.out.print(j + " ");  
if(j==10) 
{  
break outer;      
}  
}  
}  
}  
} 
