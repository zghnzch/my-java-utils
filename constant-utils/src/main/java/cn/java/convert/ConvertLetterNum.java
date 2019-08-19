package cn.java.convert;
/***
 * @class ConvertLetterNum
 * @description Letter
 * @author zch
 * @date 2019/8/19
 * @version V0.0.1.201908191649.01
 * @modfiyDate 201908191649
 * @createDate 201908191649
 * @package cn.java.convert
 */
public class ConvertLetterNum {
	/**
	 * 数字转字母 1-26 ： A-Z
	 * @param num int
	 * @return String
	 */
	public static String num2Letter(int num) {
		if (num <= 0) {
			return null;
		}
		StringBuilder letter = new StringBuilder();
		num--;
		do {
			if (letter.length() > 0) {
				num--;
			}
			letter.insert(0, ((char) (num % 26 + (int) 'A')));
			num = (num - num % 26) / 26;
		} while (num > 0);
		return letter.toString();
	}
	/**
	 * 字母转数字  A-Z ：1-26
	 * @param letter String
	 * @return int
	 */
	public static int letter2Num(String letter) {
		int length = letter.length();
		int num;
		int number = 0;
		for (int i = 0; i < length; i++) {
			char ch = letter.charAt(length - i - 1);
			num = ch - 'A' + 1;
			num *= Math.pow(26, i);
			number += num;
		}
		return number;
	}
	/**
	 * 测试
	 */
	public static void testMethodNum2Letter() {
		String letter;
		for (int i = 1; i <= 26; i++) {
			letter = ConvertLetterNum.num2Letter(i);
			System.out.println("public final static String " + letter + " = " + "\"" + letter + "\""+";");
		}
	}
}
