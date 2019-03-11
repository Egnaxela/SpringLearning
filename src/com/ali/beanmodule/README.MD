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
* 通过构造器创建Bean的实例
* 为Bean的属性设置值或赋给其他Bean的引用
* 将Bean的实例传递给Bean的后置处理器的 postProcessBeforeInitialization方法
* 调用Bean的初始化方法 init-method
* 将Bean的实例传递给Bean的后置处理器的 postProcessAfterInitialization方法
* 此时就可以使用Bean了
* 当容器关闭时,调用bean的销毁方法 destroy-method

#### SpringMVC的请求处理流程
1. 用户发送请求，请求被前端控制控制器 DispatcherServlet捕获;
2. DispatcherServlet对请求URL进行解析，得到请求资源标识符（URI）。然后根据该URI，调用HandlerMapping获得该Handler配置的所有相关的对象（包括Handler对象以及Handler对象对应的拦截器），最后以HandlerExecutionChain对象的形式返回;
3. DispatcherServlet 根据获得的Handler，选择一个合适的HandlerAdapter。（若成功获得HandlerAdapter后，此时将开始执行拦截器的preHandler(...)方法）;
4. 提取Request中的模型数据，填充Handler入参，开始执行Handler（Controller)。 在填充Handler的入参过程中，根据你的配置，Spring将帮你做一些额外的工作：
      HttpMessageConveter： 将请求消息（如Json、xml等数据）转换成一个对象，将对象转换为指定的响应信息
      数据转换：对请求消息进行数据转换。如String转换成Integer、Double等
      数据根式化：对请求消息进行数据格式化。 如将字符串转换成格式化数字或格式化日期等
      数据验证： 验证数据的有效性（长度、格式等），验证结果存储到BindingResult或Error中
5. Handler执行完成后，向DispatcherServlet 返回一个ModelAndView对象;
6. 根据返回的ModelAndView，选择一个适合的ViewResolver（必须是已经注册到Spring容器中的ViewResolver)返回给DispatcherServlet;
7. ViewResolver 结合Model和View，来渲染视图。



