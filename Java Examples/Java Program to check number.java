class A
{
int a,b,c,d,e,f,g;
void show()
{
System.out.println("TOTAL AMOUNTS");
}
}
class B extends A
{
void get1(int amount)
{
int a=amount/2000;
amount=amount%2000;
int b=amount/5;
amount=amount%5;
int c=amount/500;
amount=amount%500;
int d=amount/100;
amount=amount%100;
int e=amount/50;
amount=amount%50;
int f=amount/10;
amount=amount%10;
int g=amount/1;
amount=amount%1;
System.out.println("2000*"+a+"="+(2000* a));
System.out.println("1000*"+b+"="+(1000* b));
System.out.println("500*"+c+"="+(500* c));
System.out.println("100*"+d+"="+(100* d));
System.out.println("50*"+e+"="+(50* e));
System.out.println("10*"+f+"="+(10* f));
System.out.println("1*"+g+"="+(1* g));
}
}
class Result
{
public static void main(String args[])
{
B obj=new B();
obj.get1(10000);
obj.show();
}
}









