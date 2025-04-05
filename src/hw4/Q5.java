package hw4;

import java.util.Scanner;

//• 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//
//(提示1:Scanner,陣列)
//(提示2:需將閏年條件加入)
//(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = 0;
		int year = 0;
		int day = 0;

		// year
		while (true) {
			System.out.println("Please enter year (yyyy): ");
			if (!sc.hasNextInt()) {
				System.out.println("It is not a integer, please enter again");
				sc.next();
				continue;
			}
			year = sc.nextInt();
			break;
		}

		// month
		while (true) {
			System.out.println("Please enter month (mm): ");

			if (!sc.hasNextInt()) {
				System.out.println("It is not a integer, please enter again");
				sc.next();
				continue;
			}
			month = sc.nextInt();

			if (month < 1 || month > 12) {
				System.out.println("Wrong month, please enter again");
				continue;
			}
			break;
		}
		// day
		while (true) {
			System.out.println("Please enter day (dd): ");

			if (!sc.hasNextInt()) {
				System.out.println("It is not a integer, please enter again");
				sc.next();
				continue;
			}
			day = sc.nextInt();
			break;
		}

		int[] dayInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			dayInMonth[1] = 29;
		}

		if (day < 1 || day > dayInMonth[month - 1]) {
			System.out.println("Wrong day, please enter again");
			return;
		}

		int dayOfYear = 0;

		for (int i = 0; i < month - 1; i++) {
			dayOfYear += dayInMonth[i];

		}
		dayOfYear += day;
		System.out.println("The date entered is the " + getOrdinal(dayOfYear) + " day of the year.");

		sc.close();
	}
	
	// Identify the suffix of date
	public static String getOrdinal(int n) {
	    if (n % 100 >= 11 && n % 100 <= 13) {
	        return n + "th";
	    }
	    switch (n % 10) {
	        case 1: return n + "st";
	        case 2: return n + "nd";
	        case 3: return n + "rd";
	        default: return n + "th";
	    }
	}

}
