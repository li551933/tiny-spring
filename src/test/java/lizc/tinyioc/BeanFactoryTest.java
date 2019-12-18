package lizc.tinyioc;

import lizc.tinyioc.factory.AutowireCapableBeanFactory;
import lizc.tinyioc.factory.BeanFactory;
import org.junit.Test;

public class BeanFactoryTest {
    @Test
    public void test()throws Exception
    {
        BeanFactory beanFactory=new AutowireCapableBeanFactory();

        BeanDefinition beanDefinition=new BeanDefinition();
        beanDefinition.setBeanClassName("lizc.tinyioc.HelloWorldService");

        PropertyValues propertyValues=new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("text","Hello World!"));
        beanDefinition.setPropertyValues(propertyValues);

        beanFactory.registerBeanDefinition("helloWorldService",beanDefinition);

        HelloWorldService helloWorldService=(HelloWorldService)beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }
}
