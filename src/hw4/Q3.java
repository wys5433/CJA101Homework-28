package hw4;

//• 有個字串陣列如下 (八大行星):
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//(提示:字元比對,String方法)
public class Q3 {
	public static void main(String[] args) {
		int count = 0;
		String planets[] = { 
				"mercury", 
				"venus", 
				"earth", 
				"mars", 
				"jupiter", 
				"saturn", 
				"uranus", 
				"neptune" 
				};
		for (int i = 0; i < planets.length; i++) {
			for (int j = 0; j < planets[i].length(); j++) {
				if (planets[i].charAt(j) == 'a') {// planets[i].charAt(j)為planets index裡的string
					count++;
				} else if (planets[i].charAt(j) == 'e') {
					count++;
				} else if (planets[i].charAt(j) == 'i') {
					count++;
				} else if (planets[i].charAt(j) == 'o') {
					count++;
				} else if (planets[i].charAt(j) == 'u') {
					count++;
				}
			}

		}
		System.out.println("Total vowels count: " + count);
	}

}

//Smart way!
//public class Q3 {
//    public static void main(String[] args) {
//        String planets[] = {
//            "mercury",
//            "venus",
//            "earth",
//            "mars",
//            "jupiter",
//            "saturn",
//            "uranus",
//            "neptune"
//        };
//        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
//		int count = 0;
//		
//		
//        for (int i = 0; i < planets.length; i++) {
//            for (int j = 0; j < planets[i].length(); j++) {
//                for (int k = 0; k < vowels.length(); k++) {
//                    if (planets[i].charAt(j) == vowels[j]) {
//                        count++;
//                        break;
//                    }
//                }
//            }
//        }
//    }
//}