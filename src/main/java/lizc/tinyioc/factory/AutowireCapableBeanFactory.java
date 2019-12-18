package lizc.tinyioc.factory;

import lizc.tinyioc.BeanDefinition;

public class AutowireCapableBeanFactory extends AbstractBeanFactory {
    public Object doCreateBean(BeanDefinition beanDefinition)
    {
        try {
            Object bean=beanDefinition.getBeanClass().newInstance();
            return bean;
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
