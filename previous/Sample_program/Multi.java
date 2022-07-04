/*
@author Nilanjan Dasgupta
*/
class Multi{
//function for multiply two floating numbers
public static float mul(float a,float b)
{
	return a*b;
}
//execution point using command line arguments
public static void main(String[] args)
{
float x=Float.parseFloat(args[0]);//first argument.
float y=Float.parseFloat(args[1]);//2nd argument.
System.out.println("Multiplication of two numbers :"+mul(x,y));
}
}
