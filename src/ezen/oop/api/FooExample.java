package ezen.oop.api;

public class FooExample {

	public static void main(String[] args) {
		Foo foo = Foo.getInstance();
		Foo foo2 = Foo.getInstance();
		System.out.println(foo.equals(foo2)); // 같은 객체니까..
		System.out.println(foo.getName());

	}

}
