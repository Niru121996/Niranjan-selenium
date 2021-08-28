package traing;

public class Static1 {
String name;
int rollNo;
static int counter=0;
public Static1(String name)
{
	this.name=name;
	this.rollNo=setrollNo();
}
static int setrollNo()
{
	counter++;
	return counter;
}
static void setCllg(String name)
{
	cllgName=name;
}
}
