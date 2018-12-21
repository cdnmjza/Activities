/*What is the output of each of the following code fragments?
(given the declaration int a=1, b=2, c=3;):
1. if (6 < 2 * 5)
System.out.print("Hello");
System.out.print(" There");
Prints out Hello There

2. if(a>b)
if(a>c)
System.out.println("1111");
else
System.out.println("2222");
Prints 2222

3. if (a < c)
System.out.println("*");
else if (a == b)
System.out.println("&");
else
System.out.println("$");
Prints *

4. if(a<b)
System.out.println("####");
else
System.out.println("&&&&");
System.out.println("****");
#####****

5. if(a>b)
System.out.println("####");
else
{System.out.println("&&&&");
System.out.println("****");}
&&&&****

6. int x = 100; int y = 200;
if (x > 100 && y <=200)
System.out.print(x+" "+y+" "+(x+y));
else
System.out.print(x+" "+y+" "+(2*x-y));
 Prints 100 200 0

7. if (a < c)
System.out.println("*");
else if (a == c)
System.out.println("&");
else
System.out.println("$");
Prints out *

8. if(++a > b++ || a-- > 0)
c++;
else
c--;
System.out.println(a+" "+b+" "+c);

9. if(a<b){
System.out.println("####");
System.out.println("****");
}
else
System.out.println("&&&&");
Prints out #### ****


10.if ('a' > 'b' || 66 > (int)('A'))
System.out.println("#*#");
Prints out #*#
*/

public class thom{
	
	public static void main(String[] args) {
		if (6 < 2 * 5) {
			System.out.print("Hello");
			System.out.print(" There");
		}
	}
}
