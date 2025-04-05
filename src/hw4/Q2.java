package hw4;

//• 請建立一個字串,經過程式執行後,輸入結果是反過來的
//例如String s = “Hello World”,執行結果即為dlroW olleH
//(提示:String方法,陣列)
public class Q2 {
	public static void main(String[] args) {
		String s = "Hello World";
		String t = "";
		for (int i = s.length()  - 1; i >= 0; i--) {// s.length() = 11, 但index 最多到10
			t += s.charAt(i);
		}
		System.out.println(t);
	}

}
