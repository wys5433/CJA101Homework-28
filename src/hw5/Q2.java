package hw5;

//• 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
public class Q2 {

	public static void main(String[] args) {

		randAvg();

	}

	public static void randAvg() {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 101);
			System.out.print(num + " ");

			sum += num;

		}
		double avg = sum / 10;
		System.out.println("Average of random number is " + avg);

	}

}
