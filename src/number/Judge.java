package number;

/**
 * 101page-102page正则表达式
 * Created by bin on 2017/5/31.
 */
public class Judge {

    public static void main(String[] agrs) {
        //定义要匹配E-mail地址的正则表达式
        String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
        String str1 = "aaa@";
        String str2 = "aaaaaaaa";
        String str3 = "1140114702@zhou.won.bin";
        if (str1.matches(regex)) {
            System.out.println(str1+"是一个合法的E-mail地址格式");
        }

        if (str2.matches(regex)) {
            System.out.println(str2+"是一个合法的E-mail地址格式");
        }

        if (str3.matches(regex)) {
            System.out.println(str3+"是一个合法的E-mail地址格式");
        }
    }
}
