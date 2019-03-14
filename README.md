# keep looking until you get it
[![License MIT](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/iluwatar/java-design-patterns/master/LICENSE.md)

### Spring源码学习
- [SpringFramework](#Spring-Framwork)
  - [结构组成](#结构组成)
  - [IOC AOP](#IOC-AOP)
- [Spring Boot](#Spring-Boot)
  - [基础概念](#基础概念)
  - [底层原理](#底层原理)
- [Spring Cloud](#Spring-Cloud)

  



#### Spring Framwork
##### 结构组成
Spring框架是一个轻量级的(Spring 全家桶)、Java企业级应用的开源框架。(3.2.0  4.0.1)  
是一个分层架构，包含一系列的功能，包含约20个模块。
![image](https://github.com/Egnaxela/springLearning/blob/master/img/SpringFramework.png)

1. Core Container  
    核心容器包括Core、Bean、Context和Expression Language模块
2. Data Access/Integration  
    包含JDBC、ORM、OXM、JMS和Transaction模块。
    JMS(Java Messaging Service)模块包含了一些制造和消费消息的特性
    Transaction模块支持编程和声明式事务管理     
3. Web  
    Web上下文模块建立在应用上下文模块之上，为基于Web的应用提供了上下文
4. AOP  
    AOP模块提供了符合面向切面编程的实现
5. Test  
    Test模块提供了对JUnit和TestNG对Spring组件测试  

Spring中核心的类：DefaultListableBeanFactory、XmlBeanDefinitionReader  

##### IOC AOP
IOC

AOP  
Aspect Oriented Programming即**面向切面编程**, 大概就是把业务流程中通用的功能抽取出来，形成独立的切面，在需要的时候再把这些切面切入到具体的位置中。  
Spring框架的AOP机制可以把业务流程中的通用功能抽取出来形成一个个切面，单独编写功能代码。再在实际的业务流程执行过程中，Spring框架会根据业务流程要求，自动把独立编写的功能代码切入到流程的合适位置。


#### Spring Boot

