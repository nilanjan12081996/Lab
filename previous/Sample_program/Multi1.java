/*
@author Nilanjan Dasgupta
*/
class Multi1{
//function for multiply two numbers
public static int mul(int a,int b)
{
	return a*b;
}
//execution point using command line arguments
public static void main(String[] args)
{
int x=Integer.parseInt(args[0]);//first argument.
int y=Integer.parseInt(args[1]);//2nd argument.
System.out.println("Multiplication of two numbers :"+mul(x,y));
}
}
