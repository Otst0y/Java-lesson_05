package lesson_05_2;

public class Constructor {

	private int a;
	private int b;
	private int c;
	
	Constructor(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	Constructor(int a, int b, int c) {
		this(a, b);
		this.c = c;
	}
	
}
