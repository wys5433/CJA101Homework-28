package hw5;

import java.util.Random;

//• 身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//與數字的亂數組合,如圖:
public class Q5 {
	public static void main(String[] args) {
		System.out.println("Random number is: " + genAuthCode());

	}

	public static String genAuthCode() {
		String random_num = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		Random rand= new Random();
		String code = "";
		for (int i = 0; i < 8; i++) {
			int index = rand.nextInt(random_num.length()); //nextInt is to find the index
			char ch = random_num.charAt(index); //charAt 這是從 random_num 字串裡，取出第 index 個字元。
			code += ch; 
		}
		return code;
	}

}
