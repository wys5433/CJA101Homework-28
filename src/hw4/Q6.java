package hw4;

//• 班上有8位同學,他們進行了6次考試結果如下:
//
//請算出每位同學考最高分的次數
//(提示:二維陣列)
public class Q6 {
	public static void main(String[] args) {

		int[][] scores = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 95 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		// so this array can have 8 elements in it, which only stores "student" not
		// scores
		int[] topScore = new int[8];

		// find the highest score in each test
		// loop through each test
		for (int i = 0; i < scores.length; i++) {
			int max = scores[i][0]; // start with first student's score
			int maxIndex = 0; // Assume first student has highest score
			
			// Compare with other students in the same test
			for (int j = 1; j < scores[i].length; j++) {
				if (max < scores[i][j]) {
					max = scores[i][j];
					maxIndex = j;
				}
			}
			topScore[maxIndex]++;

		}
		for (int i = 0; i < scores.length; i++) {
			System.out.println("Student " + (i + 1) + " got highest score " + topScore[i] + " times");
		}

	}

}
