# EmailEvent：定义事件
- EmailEventListener：实现接口、使用@Component修饰自动注入，定义事件监听
- DemoTest:控制台测试 
- DemoController：Controller测试

# com.hc.demo1
- EmailEvent：定义事件
- EmailEventListener：只是实现接口，定义事件监听
- DemoTest1:控制台测试，手动注入EmailEventListener（实际使用意义不大）,会启动项目
- DemoController：Controller测试，手动注入EmailEventListener

# com.hc.demo2
- EmailEvent：定义事件
- EmailEventListener：定义事件监听，不实现接口，使用@Component自动注入类，使用@EventListener定义监听事件
- DemoTest:控制台测试，会启动项目,仅仅发布事件
- DemoController：Controller测试，手动注入EmailEventListener

# com.hc.demo3
- EmailEvent：定义事件
- EmailEventListener：定义事件监听，实现接口
- 在application.yml中注册事件监听
- DemoController：Controller测试，手动注入EmailEventListener