# Blog_2018
所用工具：
数据库：MySQL 8.0.12
前端框架：bootstraps 4.0.0 , jquery 3.2.1 , popper 1.12.9
后端使用：spring-boot 2.1.1、thymeleaf模板引擎、spring-security、
Mybatis 1.3.2
JDK版本：1.8 


使用说明
如果想在自己电脑上使用请尤其注意mysql版本和application.yml文件的配置

因为mysql版本更改后所使用的驱动式不同的，如果驱动不同，请到demo_3文件中的application.yml文件中进行修改

而如果以上工具版本不同，请到pom.yml文件中修改版本

Jdk环境不同请自行修改jdk版本，jdk 9 ，10是不能运行的

首先请运行表文件中的建表语句，先users，再pages，comment，最后才是最后一个sql文件

 
我的表建好后是这样的

最后请回到application.yml文件，修改自己的username，password，url三项，即可运行
 
