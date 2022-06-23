/*
@author Nilanjan Dasgupta
*/
class Add1{
//function for add two  numbers
public static int add(int a,int b)
{
	return a+b;
}
//execution point using command line arguments
public static void main(String[] args)
{
int x=Integer.parseInt(args[0]);//first argument.
int y=Integer.parseInt(args[1]);//2nd argument.
System.out.println("Addition of two numbers :"+add(x,y));
}
}