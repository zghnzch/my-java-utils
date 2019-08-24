package cn.java.constant;
import java.lang.reflect.Field;
/***
 * @class ConByte
 * @description 字节常量
 * @author zch
 * @date 2019/7/22
 * @version V0.0.1.201907221343.01
 * @function
 * @modfiyDate
 * @createDate
 * @package
 */
public class ConByte {
	public static final byte B_03 = (byte) 0x03;
	public static final byte B_DD = (byte) 0xDD;
	public static final byte B_00 = (byte) 0x00;
	public static final byte B_01 = (byte) 0x01;
	public static final byte B_04 = (byte) 0x04;
	/**
	 * 测试
	 * @param args all bytes
	 */
	public static void main(String[] args) {
		ConByte f = new ConByte();
		// 获取f对象对应类中的所有属性域
		Field[] fields = f.getClass().getDeclaredFields();
		for (Field field : fields) {
			// 对于每个属性，获取属性名
			try {
				String varName = field.getName();
				Object obj = field.get(varName);
				System.out.println(varName + " " + obj);
			}
			catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}
}
