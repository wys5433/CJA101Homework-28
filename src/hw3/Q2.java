package hw3;

import java.util.Scanner;

//• 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//對則顯示正確訊息,如圖示結果:
//
//(提示:Scanner,亂數方法,無窮迴圈)
//(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
public class Q2 {
	public static void main(String[] args) {
		//先隨機生成一個數字i
		//再將這個數字i去對應輸進來的數字
		int random_number = 0;
		random_number = (int)(Math.random()*10);
		System.out.println("Let's starting guess number! (0~9)");
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter a number to guessing: ");
			int guess = sc.nextInt();
			if(random_number == guess) {
				System.out.println("Congratulations! You got the right answer!");
				break;
			}
			else {
				System.out.println("Please try angin");
			}
	
		
		}
		sc.close();
	}

}
