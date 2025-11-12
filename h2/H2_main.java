package h2;

public class H2_main {
public static void main(String[] args) {
	boolean x = true;
	boolean y = false;
	boolean a = true;
	boolean b =false;
	boolean c = true;
	int input = 0;
	switch (input) {
	case 0:
		x=false;
		y=false;
		a=false;
		b=false;
		c=true;
		break;
	case 1:
		x=false;
		y=true;
		a=false;
		b=true;
		c=false;
		break;
	case 10:
		x=true;
		y=false;
		a=false;
		b=true;
		c=true;
		break;
	case 11:
		x=true;
		y=true;
		a=true;
		b=true;
		c=false;
		break;
	
	}System.out.println("X:" + x + "Y: " + y + " A: " + a + " B: " + b + " C: " +c +" Input: " + input);
}
}
