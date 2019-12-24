import java.util.*;
class Box{
int length,height;
double depth;
void init(int l,int h,double d){
 length=l;
 height=h;
depth=d;
}
double vol()
{
return length*height*depth;
}
public static void main(String[] args){
Box b=new Box();
b.init(10,5,2.1);
System.out.println("volume is"+b.vol());
}
}
