# springCloud-Demo

# **springcloud demo入门**



> 现在很多互联网公司已经摒弃了单体集群架构，逐渐转向分布式架构。所以**springCloud**不得不会，以下做个学习记录，供以后翻看。

###### 各种环境的版本如下：

| jdk         | 1.8            |
| ----------- | -------------- |
| maven       | 3.6.0          |
| springboot  | 2.1.13.RELEASE |
| springcloud | Greenwich.SR5  |

> eureka是springcloud的注册发现服务中心，是首先要集成的第一步。集成之前模拟以下分布式中常见的下单-减库存操作。在分布式架构中，订单和库存是两个不同的微服务，它们通过与eureka组件关联，互相发现对方的服务。所以这里我用maven集成三个服务，分别是eureka注册服务中心、订单服务、库存服务。如下图所示：



![](https://img2020.cnblogs.com/blog/1745124/202003/1745124-20200331145023457-89259684.png)

*（todo:待补充maven项目如何构建和聚合项目形成父子关系和一些基本概念，巩固一下maven知识）*

### shop-eureka-server的主要配置：

###### pom.xml

![](https://img2020.cnblogs.com/blog/1745124/202003/1745124-20200331151906691-1305392937.png)



###### application.yml

![](https://img2020.cnblogs.com/blog/1745124/202003/1745124-20200331151949181-1854979034.png)



###### 启动类

![](https://img2020.cnblogs.com/blog/1745124/202003/1745124-20200331152015993-1435686417.png)



###### 启动类启动，**eureka server** 就可以访问了

![](https://img2020.cnblogs.com/blog/1745124/202003/1745124-20200331152026581-785601266.png)



### shop-stock的主要配置：

###### pom.xml

![](https://img2020.cnblogs.com/blog/1745124/202003/1745124-20200331152044264-1134705131.png)



###### 特别说明一下，eureka的client端一定要依赖**spring-boot-starter-web**,不然client无法注册到eureka server中去。

###### application.yml

![](https://img2020.cnblogs.com/blog/1745124/202003/1745124-20200331152117004-660719759.png)



###### 启动类

![](https://img2020.cnblogs.com/blog/1745124/202003/1745124-20200331152127744-2019872294.png)





###### 启动shop-stock，观察日志，项目在8080端口启动成功，并且成功注册了SHOP-STOCK的服务到eureka服务中心：

![](https://img2020.cnblogs.com/blog/1745124/202003/1745124-20200331152158310-358741126.png)







###### 此时，注意观察shop-eureka-server下的日志，也接收到了一个客户端的注册，因吹斯汀..


![](https://img2020.cnblogs.com/blog/1745124/202003/1745124-20200331152205844-1441352665.png)






###### shop-order服务下的配置与shop-stock类似，故略掉了。

###### 到此，第一个组件eureka 的demo已基本完成。
