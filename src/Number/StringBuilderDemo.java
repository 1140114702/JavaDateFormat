package Number;

/**
 * 字符串生成器
 * Created by bin on 2017/5/31.
 */
public class StringBuilderDemo {

    public static void main(String[] agrs) {

        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str = str + i;
        }
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        System.out.println("String消耗的时间：" + time);

        StringBuilder builder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            builder.append(i);
        }
        endTime = System.currentTimeMillis();
        time = endTime - startTime;
        System.out.println("StringBuilder消耗的时间：" + time);
    }
}
