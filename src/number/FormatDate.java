package number;

import java.util.Date;

/**
 * 格式化Date（日期和时间）
 * Created by bin on 2017/5/23.
 */
public class FormatDate {

    public static void main(String[] args) {
        System.out.println("----------对日期的格式化----start--------");
        Date date = new Date();//获取一个日期对象
        System.out.println(date);//Tue May 23 22:10:45 CST 2017
        System.out.println(String.format("%te", date));//一个月中的第一天（1～31）23
        System.out.println(String.format("%td", date));//一个月中的第一天（01～31）23
        System.out.println(String.format("%tb", date));//指定语言环境的月份简称--May（英文），五月（中文）
        System.out.println(String.format("%tB", date));//指定语言环境的月份全称--May（英文），五月（中文）
        System.out.println(String.format("%ta", date));//指定语言环境的星期几简称--Tue（英文），星期二（中文）
        System.out.println(String.format("%tA", date));//指定语言环境的星期几全称--Tuesday（英文），星期二（中文）
        System.out.println(String.format("%tc", date));//包括全部日期和时间的信息--星期二 五月 23 22:10:45 CST 2017
        System.out.println(String.format("%tY", date));//4位年份--2017
        System.out.println(String.format("%ty", date));//2位年份--17
        System.out.println(String.format("%tj", date));//一年中的第几天（001-366）--143
        System.out.println(String.format("%tm", date));//月份--03
        System.out.println("----------对日期的格式化----end--------");

        System.out.println("----------对时间的格式化----start--------");
//        Tue May 23 22:57:24 CST 2017
        System.out.println(String.format("%tH", date));//2位数字的24小时制(00～23)--22
        System.out.println(String.format("%tI", date));//2位数字的12小时制(01～12)--10
        System.out.println(String.format("%tk", date));//2位数字的24小时制(0～23)--22
        System.out.println(String.format("%tl", date));//2位数字的12小时制(1～12)--10
        System.out.println(String.format("%tM", date));//2位数字的分钟(00～59)--57
        System.out.println(String.format("%tS", date));//2位数字的秒数(00～60)--24
        System.out.println(String.format("%tL", date));//3位数字的毫秒数(000～999)--809
        System.out.println(String.format("%tN", date));//9位数字的微秒数(000000000～999000000000)--809000000
        System.out.println(String.format("%tp", date));//指定语言环境的上午或者下午--下午(中文)，pm(英文)
        System.out.println(String.format("%tz", date));//相对于GMT RFC 82 格式的数字时区偏移量-- +0800
        System.out.println(String.format("%tZ", date));//时区缩写形式的字符串-- CST
        System.out.println(String.format("%ts", date));//1970-01-01 00:00:00至现在经过的秒数--1495551444
        System.out.println(String.format("%tQ", date));//1970-01-01 00:00:00至现在经过的毫秒数--1495551444809
        System.out.println("----------对时间的格式化----end--------");

        System.out.println("----------对常见的日期时间组合的格式化----start--------");
//        Tue May 23 23:08:44 CST 2017
        System.out.println(String.format("%tF", date));//“年-月-日”格式(4位年份)--2017-05-23
        System.out.println(String.format("%tD", date));//“月/日/年”格式(2位年份)--05/23/17
        System.out.println(String.format("%tc", date));//全部日期和时间的信息--星期二 五月 23 23:08:44 CST 2017
        System.out.println(String.format("%tr", date));//“时:分:秒 PM(AM)”格式(12时制)--11:08:44 下午
        System.out.println(String.format("%tT", date));//“时:分:秒”格式(24时制)--23:08:44
        System.out.println(String.format("%tR", date));//“时:分”格式(24时制)--23:08
        System.out.println("----------对常见的日期时间组合的格式化----end--------");
    }
}
