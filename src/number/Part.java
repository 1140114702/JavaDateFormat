package number;

/**
 * Created by bin on 2017/5/21.
 */
public class Part {

    private static final double PI = 3.14;
    private static int age = 23;

    public static void main(String[] args) {
        final int number;
        number = 12345;
//        number = 1236; //错误的代码，因为number为常量，只能进行一次赋值
        age = 22;
        System.out.println("常量PI的值为：" + PI);
        System.out.println("赋值后number的值为：" + number);
        System.out.println("赋值后age的值为：" + age);
    }
}
