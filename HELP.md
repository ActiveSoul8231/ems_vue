# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.3.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.3.RELEASE/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.3.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [MyBatis Framework](https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.3.3.RELEASE/reference/htmlsingle/#using-boot-devtools)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [MyBatis Quick Start](https://github.com/mybatis/spring-boot-starter/wiki/Quick-Start)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

1、项目准备

  需求分析	模块		功能
  库表设计	数据库
  详细设计	流程图伪代码方式
  编码环节
    a.环境准备
    b.正式进入编码环节

  测试
  部署上线

 2、技术选型

  	前端：VUE  +  axios
  	后端：springboot  +  mybatis  +  mysql  +  tomcat  +  Redis

 ==============================================================================
 3、需求分析
 	用户模块
	 	a.用户登录
	 	b.用户注册
	 	c.验证码实现
	 	d.欢迎XX用户
	 	e.安全退出
	 	f.员工列表展示
 	员工模块
	 	g.员工添加
	 	h.员工删除
	 	i.员工修改
	 	j.员工列表加入redis缓存实现

4、库表设计

	1.分析系统中有哪些表  2.分析标语表之间的关系

	用户表
		id  username   realname password  sex  status registerTime

	员工表
		id  name  photopath  salary age 


	2.创建库表
		create table t_user(
			id int(6) primary key auto_increment,
			username varchar(60),
			realname varchar(60),
			password varchar(50),
			sex varchar(4),
			status varchar(4),
			registerTime timestamp
		);

		create table t_emp(
			id int(6) primary key auto_increment,
			name varchar(40),
			path varchar(100),
			salary double(10,2),
			age int(3)
		);

	3.库表入库  emp(员工管理)

	===================================================================================
5、编码环节
	a.环境搭建
		springboot + mybatis + mysql 引入员工管理系统页面


		项目名：ems_vue1.0
		项目中包结构：
			src/main/java
				com.wenlan.XXX
							.util
							.dao
							.service
							......
			src/main/resource
						aplication.yml（properties）				springboot 配置文件
						application-dev.yml			开发环境
						application-prod.yml		生产配置
						com/wenlan/apper/
						com/wenlan/sql/
						static

		项目编码：UTF-8
		