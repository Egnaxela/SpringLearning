####


#### 依赖注入的两种方式:  
1. 属性注入
2. 构造器注入

注意点：属性注入必须要有一个无参的构造器，因为IOC会调用无参构造类创建Bean
bean配置的继承: 使用parent属性
bean配置位置的确定: 可使用 type index属性
bean配置为集合类型：使用对应的集合类型如  list、map
bean配置的引用:可使用 ref属性
如![applicationContext.xml](https://github.com/Egnaxela/springLearning/blob/master/src/applicationContext.xml)

