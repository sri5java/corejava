package languagefunda;

import javainroduction.HelloVivek;
import javainroduction.JvmArchitectureDemo;

import java.util.ArrayList;

public class KeywordsDemo {

	int a = 1000;

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Sai");

		KeywordsDemo k = new KeywordsDemo();// k is reference variable

		k.bonus();
		String s1 = k.getName();
		k.method1();

//		System.out.println(x);
		System.out.println(s1);

		KeywordsDemo k1 = k.getDetails();

		System.out.println("Object Info " + k1.a);

	}

	void bonus() {
		int a = 1000;
		System.out.println(a);
	}

	String getName() {
		String s = "Java";
		return s;
	}

	void method1() {
		System.out.println("Hello method1");
	}

	KeywordsDemo getDetails() {
		KeywordsDemo k = new KeywordsDemo();
		System.out.println("A value : " + k.a);
		return k;
	}

	boolean isConfirmed() {
		boolean a = true;

		return a;
	}

}
