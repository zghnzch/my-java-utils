package cn.java.constant;
import java.lang.reflect.Field;
/***
 * @class ConByte
 * @description 字节常量
 * @author zch
 * @date 2019/7/22
 * @version V0.0.1.201907221343.01
 * @modfiyDate
 * @createDate
 * @package
 */
public class ConByte {
	public static final byte B_0DD = (byte) 0xDD;
	/**
	 * common byte
	 */
	public static final byte B_000 = 0x00;
	public static final byte B_001 = 0x01;
	public static final byte B_002 = 0x02;
	public static final byte B_003 = 0x03;
	public static final byte B_004 = 0x04;
	public static final byte B_005 = 0x05;
	public static final byte B_006 = 0x06;
	public static final byte B_007 = 0x07;
	public static final byte B_008 = 0x08;
	public static final byte B_009 = 0x09;
	public static final byte B_010 = 0x10;
	public static final byte B_011 = 0x11;
	public static final byte B_012 = 0x12;
	public static final byte B_013 = 0x13;
	public static final byte B_014 = 0x14;
	public static final byte B_015 = 0x15;
	public static final byte B_016 = 0x16;
	public static final byte B_017 = 0x17;
	public static final byte B_018 = 0x18;
	public static final byte B_019 = 0x19;
	public static final byte B_020 = 0x20;
	public static final byte B_021 = 0x21;
	public static final byte B_022 = 0x22;
	public static final byte B_023 = 0x23;
	public static final byte B_024 = 0x24;
	public static final byte B_025 = 0x25;
	public static final byte B_026 = 0x26;
	public static final byte B_027 = 0x27;
	public static final byte B_028 = 0x28;
	public static final byte B_029 = 0x29;
	public static final byte B_030 = 0x30;
	public static final byte B_031 = 0x31;
	public static final byte B_032 = 0x32;
	public static final byte B_033 = 0x33;
	public static final byte B_034 = 0x34;
	public static final byte B_035 = 0x35;
	public static final byte B_036 = 0x36;
	public static final byte B_037 = 0x37;
	public static final byte B_038 = 0x38;
	public static final byte B_039 = 0x39;
	public static final byte B_040 = 0x40;
	public static final byte B_041 = 0x41;
	public static final byte B_042 = 0x42;
	public static final byte B_043 = 0x43;
	public static final byte B_044 = 0x44;
	public static final byte B_045 = 0x45;
	public static final byte B_046 = 0x46;
	public static final byte B_047 = 0x47;
	public static final byte B_048 = 0x48;
	public static final byte B_049 = 0x49;
	public static final byte B_050 = 0x50;
	public static final byte B_051 = 0x51;
	public static final byte B_052 = 0x52;
	public static final byte B_053 = 0x53;
	public static final byte B_054 = 0x54;
	public static final byte B_055 = 0x55;
	public static final byte B_056 = 0x56;
	public static final byte B_057 = 0x57;
	public static final byte B_058 = 0x58;
	public static final byte B_059 = 0x59;
	public static final byte B_060 = 0x60;
	public static final byte B_061 = 0x61;
	public static final byte B_062 = 0x62;
	public static final byte B_063 = 0x63;
	public static final byte B_064 = 0x64;
	public static final byte B_065 = 0x65;
	public static final byte B_066 = 0x66;
	public static final byte B_067 = 0x67;
	public static final byte B_068 = 0x68;
	public static final byte B_069 = 0x69;
	public static final byte B_070 = 0x70;
	public static final byte B_071 = 0x71;
	public static final byte B_072 = 0x72;
	public static final byte B_073 = 0x73;
	public static final byte B_074 = 0x74;
	public static final byte B_075 = 0x75;
	public static final byte B_076 = 0x76;
	public static final byte B_077 = 0x77;
	public static final byte B_078 = 0x78;
	public static final byte B_079 = 0x79;
	// public static final byte B_080 = 0x80
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
