package com.zjh.interview.linux;

/**
 * linux 常用命令
 * (命令:su -） --输入密码可以切换到root目录。
 * (命令:sudo su - ） --从当前用户切换到root用户
 * (命令：su - www ） --再从root 切换到www用户
 *
 * sudo  命令标识临时授权root用户权限
 * su 命令标识切换目录
 *
 *
 * 服务器磁盘清理命令
 *  du -sh * 查看文件大小
 *  echo >文件名清空文件内容
 *  启动tomcat并输出日志
 *  ./catalina.sh run
 * df -h 查看服务器内存使用情况
 * free -h 查看服务器剩余资源情况
 * top 查看服务器cpu使用情况
 *
 *
 * nginx 常用命令
 * nginx -t ：测试配置文件是否有语法错误
 * nginx -s reload：重新加载Nginx配置文件，然后以优雅的方式重启Nginx
 * nginx -s stop：强制停止Nginx服务
 * nginx -s quit：优雅地停止Nginx服务（即处理完所有请求后再停止服务）
 *
 *
 * java jvm常用命令
 * jps -l 查询java应用的进程号
 * jinfo -flags <进程号> 查询当前运行jvm属性和参数值
 * jstat [option] <进程号> [interval] [count] 用于监视虚拟机运行时状态信息的命令，它可以显示出虚拟机进程中的类装载、内存、垃圾收集、JIT编译等运行数据。
 *          option: gc 垃圾回收堆的行为统计
 *                  gcutil 垃圾回收统计概述。
 * @author: jinheng.zhao
 * @create: 2020-11-12
 **/
public class linux {
}
