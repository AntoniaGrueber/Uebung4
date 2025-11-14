package h3;

public class H3_main {
public static void main (String[] args) {
	float celsiusFloat=14.2f;
	float fahrenheitFloat;
	double celsiusDouble = 14.2;
	//double celsiusDoubleFromFloat= celsiusFloat;
	double fahrenheitDouble;
	
	fahrenheitFloat= celsiusFloat*(9f/5f)+32f;
	System.out.println("fahrenheitFloat:" + fahrenheitFloat);
	
	fahrenheitDouble= celsiusDouble*(9.0/5.0)+32.0;
	System.out.println("fahrenheitDouble:" + fahrenheitDouble);
}
}
