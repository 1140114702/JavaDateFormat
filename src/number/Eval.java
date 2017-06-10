package number;

/**
 * Created by bin on 2017/5/21.
 */
public class Eval {

    public static void main(String[] args) {
        int a, b, c;
        a = 15;
        c = b = a + 4; //将a+4赋值给变量b，然后再赋值给变量c
        System.out.println("c值为：" + c);
        System.out.println("b值为：" + b);

        System.out.println(2 << 3);//等价于2*2的3次方
        System.out.println(16 >> 3);//等价于16/2的3次方
        byte b1 = (byte) 129;
        System.out.println(b1);

        int[] arr = {1, 5, 7, 5, 4, 3, 8, 8, 9, 3, 3};
        for (int i : arr) {
            System.out.println(i);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println("反着来" + arr[i]);
            for (int j = 0; j < 4; j++) {
                System.out.println(i);
                if (i == 4) {
                    break;//结束内循环
                }
            }
        }

        end:
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            for (int j = 0; j < 18; j++) {
                if (j > 10) {
                    break end;//用标签名结束外循环
                }
                System.out.println(j);
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;//跳到下一次循环
            }
            System.out.println(i);
        }

        String s = "dfasfasdfk;askf";
        System.out.println(s.substring(2));
        System.out.println(s.replace("j", "new"));
        System.out.println(s.startsWith("fa",1));
        System.out.println(s.endsWith("kf"));
        String s2 = "jdlsjflaksjfd";
        System.out.println(s.compareTo(s2));
        String str1 = "啊";
        String str2 = "吧";
        System.out.println(str1.compareTo(str2));
    }
}
