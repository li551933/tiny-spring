package lizc.tinyioc.factory;

import lizc.tinyioc.BeanDefinition;

public interface BeanFactory {
    void registerBeanDefinition(String name, BeanDefinition beanDefinition)throws Exception;
    Object getBean(String name);
}
