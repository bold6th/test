package javasilver6;

public class SuperDog extends Dog{
	SuperDog () {
		super("aaa");
		System.out.println("スーパードッグです。");
	}
	SuperDog(String s) {
		super("aaa");
		System.out.println(s + "スーパードックです。");
	}
	SuperDog(int a){
		super("aaa");
		System.out.println(a + "スーパードックです。");
	}

}
