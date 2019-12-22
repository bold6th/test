package javasilver_chapter6;

public class Sample {
private String value;

public String getValue() {
	return value;
}

public void setValue(String value) {
	this.value = value;
}
public void Greed() {
	if(value.equals("hello")) {
		System.out.println("英語です。");
	}else if(value.equals("こんにちは")) {
		System.out.println("日本語です。");
	}
}

}
