package hw1;

public class HW1 {
	public static void main(String args[]) {
		// • 請設計一隻Java程式,計算12,6這兩個數值的和與積
		int int1 = 12, int2 = 6;
		int addition = int1 + int2;
		int multiply = int1 * int2;
		System.out.println("The result of 12 + 6 is " + addition);
		System.out.println("The result of 12 * 6 is " + multiply);

		// • 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int eggs = 200;
		int dozen = eggs / 12;
		int reminder = eggs % 12;
		System.out.println("The result is " + dozen + " dozens and " + reminder + " eggs");
		// 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int total_seconds = 256559;
		int days = total_seconds / (24 * 60 * 60);
		int days2 = total_seconds % (24 * 60 * 60);
		int hours = days2 / (60 * 60);
		int hours2 = days2 % (60 * 60);
		int minutes = hours2 / 60;
		int minutes2 = hours2 % 60;
		int seconds = minutes2 % 60;

		System.out.println("256559 seconds would be " + days + "  days " + hours + " hours " + minutes + " minutes "
				+ seconds + " seconds.");

		// • 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		double pi = 3.1415;
		int r = 5;
		double area = r * r * pi;
		double perimeter = r * 2 * pi;
		double roundArea = Math.round(area * 100.0) / 100.0;
		perimeter = (float) perimeter;
		System.out.println("The area and perimeter of circle are: " + roundArea + ", " + perimeter);

		// • 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
		// 金加利息共有多少錢 (用複利計算,公式請自行google)
		//FV ＝本金pv ×（1 ＋ 每期利率 R）^時間 n 
		
		int pv = 1500000;
		double rate = 0.02;
		int years = 10;
		double fv = pv * Math.pow((1 + rate),years);
		double fv2 = Math.round(fv * 100.0) / 100.0;
		System.out.println("本金加利息十年後有" + fv2 + "元");
		
		//• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
		//5 + 5
		//5 + ‘5’
		//5 + “5”
		//並請用註解各別說明答案的產生原因
		
		System.out.println(5 + 5);
		//因為5+5為整數相加,故得10
		System.out.println(5 + '5');
		//因為是一個字元 (char)，其 ASCII 值為 53。
		System.out.println(5 + "5");
		// 5 是數字，但 "5" 是字串 (String)。
        //Java 會將 5 轉成字串 "5"，然後執行字串連接，結果變成 "55"。

	}

}
