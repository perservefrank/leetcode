package com.zjh.interview.linux;

/**
 * linux查找日志技巧
 * 先必须了解两个最基本的命令:
 *
 * tail  -n  10  test.log   查询日志尾部最后10行的日志;
 *
 * tail -n +10 test.log    查询10行之后的所有日志;
 *
 * head -n 10  test.log   查询日志文件中的头10行日志;
 *
 * head -n -10  test.log   查询日志文件除了最后10行的其他所有日志;
 *
 *
 *
 * 场景1: 按行号查看---过滤出关键字附近的日志
 *
 * 因为通常时候我们用grep拿到的日志很少,我们需要查看附近的日志.
 *
 * 我是这样做的,首先: cat -n test.log |grep "地形"  得到关键日志的行号
 *
 *
 *
 * <3>得到"地形"关键字所在的行号是102行. 此时如果我想查看这个关键字前10行和后10行的日志:
 *
 * cat -n test.log |tail -n +92|head -n 20
 *
 * tail -n +92表示查询92行之后的日志
 *
 * head -n 20 则表示在前面的查询结果里再查前20条记录
 *
 *
 *
 * 场景2:那么按日期怎么查呢?  通常我们非常需要查找指定时间端的日志
 *
 * sed -n '/2014-12-17 16:17:20/,/2014-12-17 16:17:36/p'  test.log
 *
 * 特别说明:上面的两个日期必须是日志中打印出来的日志,否则无效.
 *
 *
 *
 * 关于日期打印,可以先 grep '2014-12-17 16:17:20' test.log 来确定日志中是否有该时间点,以确保第4步可以拿到日志
 *
 * 这个根据时间段查询日志是非常有用的命令.
 *
 * 6
 *
 * 如果我们查找的日志很多,打印在屏幕上不方便查看, 有两个方法:
 *
 * (1)使用more和less命令, 如: cat -n test.log |grep "地形" |more     这样就分页打印了,通过点击空格键翻页
 *
 * (2)使用 >xxx.txt 将其保存到文件中,到时可以拉下这个文件分析.如:
 *
 * cat -n test.log |grep "地形"  >xxx.txt
 *
 * @author: jinheng.zhao
 * @create: 2020-11-12
 **/
public class linuxLog {
}
