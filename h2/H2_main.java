package h2;

public class H2_main {
public static void main(String[] args) {
	boolean x = true;
	boolean y = false;
	boolean a = true;
	boolean b =false;
	boolean c = true;
	int input = 10;
	switch (input) {
	case 0:
		x=false;
		y=false;
		break;
	case 1:
		x=false;
		y=true;
		break;
	case 10:
		x=true;
		y=false;
		break;
	case 11:
		x=true;
		y=true;
		break;
	
	}
	if (x==true && y==true){
		a=true;
	} else {
		a=false;
	}
	if (x==true||y==true && x==false) {
		b=true;
	}else {
		b=false;
	}
	if (y==false) {
		c=true;
	}else {
		c=false;
	}
	System.out.println("X: " + x + ", Y: " + y + ", A: " + a + ", B: " + b + ", C: " +c +", Input: " + input);
}
}
