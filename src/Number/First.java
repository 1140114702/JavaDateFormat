package Number;

public class First {

    static String s1 = "你好";//成员变量(全局变量)

    public static void main(String[] args) {
        // write your code here
        String s2 = "Java";//局部变量
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("Java有8种基本数据类型");

        System.out.println("十进制123=" + 123);
        System.out.println("八进制0123=" + 0123);
        System.out.println("十六进制0x123=" + 0x123);

        char d = 'd';
        char c = '@';
        System.out.println((int) d);
        System.out.println((int) c);
        System.out.println((char) 54321);
        System.out.println((char) 13245);
    }
}
