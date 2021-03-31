package cn.demo.gc;

/**
 * exp1: -Xmx20m -Xms20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC -XX:+PrintGCDateStamps -Xloggc:logs/gc.log
 * exp2: -Xmx20m -Xms20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseParallelGC -XX:+PrintGCDateStamps -Xloggc:logs/gc.log
 */
public class HandlePromotionFailure {
    public static final int _1M = 1 * 1024 * 1024;

    public static void allocate() {
        byte[] d1 = new byte[2 * _1M];
        byte[] d2 = new byte[2 * _1M];
        byte[] d3 = new byte[2 * _1M];
        byte[] d4 = new byte[4 * _1M];

    }
    public static void allocate2() {
        byte[] d1 = new byte[2 * _1M];
        byte[] d2 = new byte[2 * _1M];
        byte[] d3 = new byte[2 * _1M];
        byte[] d4 = new byte[3 * _1M];

    }
    public static void main(String[] args) {
        allocate2();
    }
}
