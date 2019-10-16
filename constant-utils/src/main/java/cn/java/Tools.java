package cn.java;
import cn.java.convert.ConvertLetterNum;
/***
 * @class Tools
 * @description TODO
 * @author zch
 * @date 2019/10/16
 * @version V0.0.1.201910161929.01
 * @modfiyDate 201910161929
 * @createDate 201910161929
 * @package cn.java
 */
public class Tools {
	public static void main(String[] args) {
		forMakeByte1();
	}
	/**
	 * 生成字节 数字开头
	 */
	private static void forMakeByte1() {
		// public static final byte B_03F = 0x3F;
		String st1 = "public static final byte B_0";
		String stx1 = "";
		String st2 = " = 0x";
		String st3 = ";";
		for (int i = 3; i < 10; i++) {
			for (int j = 1; j < 7; j++) {
				stx1 = i + ConvertLetterNum.num2Letter(j);
				System.out.println(st1 + stx1 + st2 + stx1 + st3);
			}
			System.out.println();
		}
	}
	/**
	 * 生成字节字母开头
	 */
	private static void forMakeByte2() {
		// public static final byte B_03F = 0x3F;
		String st1 = "public static final byte B_0";
		String stx1 = "";
		String st2 = " = 0x";
		String st3 = ";";
		for (int i = 3; i < 17; i++) {
			for (int j = 0; j < 7; j++) {
				if(i<10&&j>0){
					stx1 = i + ConvertLetterNum.num2Letter(j);
				}else if(i>10){
					stx1 = ConvertLetterNum.num2Letter(i);
				}

				System.out.println(st1 + stx1 + st2 + stx1 + st3);
			}
			System.out.println();
		}
	}
}
