package cn.java.constant;
import java.math.BigDecimal;
/**
 * @author zch
 * 190426 数字型常量
 */
public class ConNum {
    /**
     * 0
     */
    public final static int Z0 = 0;
    /**
     * int +
     */
    public final static int P1 = 1;
    public final static int P2 = 2;
    public final static int P3 = 3;
    public final static int P4 = 4;
    public final static int P5 = 5;
    public final static int P6 = 6;
    public final static int P7 = 7;
    public final static int P8 = 8;
    public final static int P9 = 9;
    public final static int P10 = 10;
    public final static int P16 = 16;
    public final static int P32 = 32;
    public final static int P30 = 30;
    public final static int P31 = 31;
    public final static int P36 = 36;
    public final static int P39 = 39;
    public final static int P40 = 40;
    public final static int P41 = 41;
    public final static int P42 = 42;
    public final static int P43 = 43;
    public final static int P44 = 44;
    public final static int P45 = 45;
    public final static int P46 = 46;
    public final static int P47 = 47;
    public final static int P48 = 48;
    public final static int P49 = 49;
    public final static int P50 = 50;
    public final static int P51 = 51;
    public final static int P52 = 52;
    public final static int P53 = 53;
    public final static int P54 = 54;
    public final static int P55 = 55;
    public final static int P56 = 56;
    public final static int P57 = 57;
    public final static int P58 = 58;
    public final static int P59 = 59;
    public final static int P60 = 60;
    public final static int P61 = 61;
    public final static int P62 = 62;
    public final static int P63 = 63;
    public final static int P64 = 64;
    public final static int P65 = 65;
    public final static int P66 = 66;
    public final static int P67 = 67;
    public final static int P68 = 68;
    public final static int P69 = 69;
    public final static int P98 = 98;
    public final static int P99 = 99;
    public final static int P100 = 100;
    public final static int P241 = 241;
    public final static int P243 = 243;
    public final static int P244 = 244;
    public final static int P60000 = 60000;
    public final static int P86400000 = 86400000;
    /**
     * int -
     */
    public final static int N1 = -1;
    public final static int N2 = -2;
    /**
     * 大额数据判断依据值
     */
    public final static Long BADRECORD_MAX = 9437183L;
    /**
     * Monitor log maxLine number
     */
    public final static int LOGMAXLINE = 196605;
    /**
     * 微信充值（消费机）
     */
    public final static Integer DEVICE_WXCHARGE_GOODS = 17;
    /**
     * 微信充值（水控机）
     */
    public final static Integer DEVICE_WXCHARGE_WATER = 117;
    /**
     * 用户状态
     */
    public final static Integer USERSTATUS241 = 241;
    /**
     * 最小支付金额
     */
    public final static float MINPAYFARE = (float) 0.01;
    /**
     * BigDecimal  除法中用
     */
    public final static BigDecimal BIGP100 = new BigDecimal(P100);
    public final static BigDecimal BIGZ0 = new BigDecimal(Z0);
    public final static BigDecimal BIGN1 = new BigDecimal(N1);
    public final static BigDecimal BIG_N86400000 = new BigDecimal(P86400000);
}
