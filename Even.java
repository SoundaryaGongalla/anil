class Even
{
public static void main(String []args)
{
int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
for(int i=0;i<=a.length;i++)
{
System.out.println(a[i]);
}
display(a[i]);
}
int count=0;
public static void display( int a[i])
{
if(count<=10)
{
if(a[i]%2==0)
{
count++;
}
System.out.println(a[i]);
}
display();
}
}
}