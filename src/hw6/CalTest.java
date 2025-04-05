package hw6;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
//• 請設計三個類別Calculator.java,CalException.java與CalTest.java,在Calculator.java裡有個自訂
//方法為powerXY(int x, int y),功能是會計算x的y次方並回傳結果。 CalTest.java執行後,使用者可
//以輸入x與y的值,請加入例外處理機制,讓程式能解決以下狀況:
//1. x與y同時為0,(產生自訂的CalException例外物件)
//2. y為負值,而導致x的y次方結果不為整數
//3. x與y皆正確情況下,會顯示運算後結果
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		Scanner sc = new Scanner(System.in);
		int x = getInt(sc);
		int y = getInt(sc);
		sc.close();

		try {
			int result = c1.powerXY(x, y);
			System.out.println("Result is: " + result);
		} catch (CalException e) {
			System.out.println(e.getMessage());
		}
	}

	public static int getInt(Scanner sc) {
		while (true) {
			try {
				System.out.println("Please enter a value for x: ");
				return sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("It is not an integer, please enter again.");
				sc.next();
			} catch (NoSuchElementException e) {
				System.out.println("Please enter a valid number. Input cannot be blank! ");
				sc.next();
			} catch (IllegalStateException e) {
				System.out.println("The system is in an invalid state. Please restart the program. ");
				sc.next();
			}
		}

	}

}
