/*
@author Nilanjan Dasgupta
*/

class Com{
//variables to holds real and img part.
	int real,img;
//constructor which will be used while creating complex number
	public Com(int r,int i)
{
this.real=r;
this.img=i;
}
//function for print the numbers
public void show()
{
System.out.println(this.real+"+i"+this.img);
}
//funtion for addtion
public static Com add(Com n1,Com n2)
{
Com res=new Com(0,0);
res.real=n1.real+n2.real;
res.img=n1.img+n2.img;
return res;
}
//Executor
public static void main(String[] args){
//creating two complex number
Com c1=new Com(4,5);
Com c2=new Com(10,5);
//printing complex numbers
System.out.println("First num: ");
c1.show();
System.out.println("Second num: ");
c2.show();
Com res=add(c1,c2);
System.out.print("Ans is: ");
res.show();
}
}