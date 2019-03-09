#### IOC容器常见的两种:  
1. BeanFactory  
2. ApplicationContext
#### 依赖注入的两种方式:  
1. 属性注入
2. 构造器注入

##### 注意点：属性注入必须要有一个无参的构造器，因为IOC容器会调用无参构造器创建Bean  
bean配置的继承: 使用parent属性  
bean配置位置的确定: 可使用 type index属性  
bean配置为集合类型：使用对应的集合类型如  list、map  
bean配置的引用:可使用 ref属性  
如 [applicationContext.xml](https://github.com/Egnaxela/springLearning/blob/master/src/applicationContext.xml)  
引入外部文件
<context:property-placeholder location="classpath:db-pro.properties"/>

bean的默认作用域是单例的 即 <bean scope="singleton"/>
* scope="singleton" 默认的，容器初始化时创建bean的实例，在整个容器的生命周期内 只会创建一次.
* scope="prototype" 原型的，容器初始化时不创建bean的实例，每次请求时都会创建一个新的.
* scope="request" 每一次HTTP请求都会创建一个新的实例，该bean只在当前请求内有效.
* scope="session" 每一次HTTP请求都会创建一个新的实例，该bean只在当前session内有效.

#### Bean的生命周期

