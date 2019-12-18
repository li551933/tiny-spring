package lizc.tinyioc;

import lizc.tinyioc.factory.AutowireCapableBeanFactory;
import lizc.tinyioc.factory.BeanFactory;
import org.junit.Test;

public class BeanFactoryTest {
    @Test
    public void test()
    {
        BeanFactory beanFactory=new AutowireCapableBeanFactory();

        BeanDefinition beanDefinition=new BeanDefinition();
        beanDefinition.setBeanClassName("lizc.tinyioc.HelloWorldService");
        beanFactory.registerBeanDefinition("helloWorldService",beanDefinition);

        HelloWorldService helloWorldService=(HelloWorldService)beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }
}
