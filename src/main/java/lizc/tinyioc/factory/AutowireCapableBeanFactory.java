package lizc.tinyioc.factory;

import lizc.tinyioc.BeanDefinition;
import lizc.tinyioc.PropertyValue;

import java.lang.reflect.Field;

public class AutowireCapableBeanFactory extends AbstractBeanFactory {
    protected Object doCreateBean(BeanDefinition beanDefinition)throws Exception
    {
        Object bean=createBeanInstance(beanDefinition);
        applyPropertyValues(bean,beanDefinition);
        return bean;
    }


    protected Object createBeanInstance(BeanDefinition beanDefinition)throws Exception
    {
        return beanDefinition.getBeanClass().newInstance();
    }

    protected void applyPropertyValues(Object bean,BeanDefinition mbd) throws Exception
    {
        for (PropertyValue propertyValue:mbd.getPropertyValues().getPropertyValueList())
        {
            Field declaredField=bean.getClass().getDeclaredField(propertyValue.getName());
            declaredField.setAccessible(true);
            declaredField.set(bean,propertyValue.getValue());
        }
    }
}
