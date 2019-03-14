
#### AOP
面向切面编程，核心原理是**使用动态代理模式在方法执行前后或出现异常时加入相关逻辑**。
* AOP是基于动态代理模式
* AOP是方法级别的
* AOP可以分离业务代码和关注点(即切面 重复的代码)代码，在执行业务代码时动态注入切面代码
在Spring中使用了JDK动态代理和CGLIB代理两种方式。  
如果目标对象有实现接口，使用JDK代理; 若没有实现接口，则使用CGLIB代理。在
DefaultAopProxyFactory类中  
```java
public class DefaultAopProxyFactory implements AopProxyFactory, Serializable {

	public AopProxy createAopProxy(AdvisedSupport config) throws AopConfigException {
		if (config.isOptimize() || config.isProxyTargetClass() || hasNoUserSuppliedProxyInterfaces(config)) {
			Class targetClass = config.getTargetClass();
			if (targetClass == null) {
				throw new AopConfigException("TargetSource cannot determine target class: " +
						"Either an interface or a target is required for proxy creation.");
			}
			if (targetClass.isInterface()) {
				return new JdkDynamicAopProxy(config);
			}
			return CglibProxyFactory.createCglibProxy(config);
		}
		else {
			return new JdkDynamicAopProxy(config);
		}
	}

...
	
}	
```