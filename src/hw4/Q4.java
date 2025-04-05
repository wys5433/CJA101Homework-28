package hw4;

import java.util.Scanner;

//• 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//表如下:
//
//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//員工編號: 25 19 27 共 3 人!」
//
//(提示:Scanner,二維陣列)
public class Q4 {
	public static void main(String[] args) {
		int userIDMoney[][] = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number you want to borrow: ");
		int i = sc.nextInt();
		int count = 0;
		String has_money ="";

		for (int k = 0; k < userIDMoney.length; k++) {
			int userId = userIDMoney[k][0];
			int userMoney = userIDMoney[k][1];

			if (userMoney >= i) {
				has_money += userId +" ";
				count++;
			}
		}
		System.out.println(has_money + "\nTotal will be: " + count + " people could lend you money");
		sc.close();
	}
}
