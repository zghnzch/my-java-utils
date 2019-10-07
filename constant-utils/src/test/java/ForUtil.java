/***
 * @class ForUtil
 * @description 利用for循环来制造变量
 * @author zch
 * @date 2019/10/7
 * @version V0.0.1.201910071347.01
 * @modfiyDate 201910071347
 * @createDate 201910071347
 * @package PACKAGE_NAME
 */
public class ForUtil {
	public static void main(String[] args) {
		String s1 = "public static final byte B_0";
		String s2 = " = 0x";
		String s3 = ";";
		for (int i = 1; i <= 80; i++) {
			// public static final byte B_010 = 0x010;
			System.out.println(s1 + i + s2 + i + s3);
		}
	}
}
