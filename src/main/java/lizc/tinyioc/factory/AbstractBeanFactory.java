package lizc.tinyioc.factory;

import lizc.tinyioc.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractBeanFactory implements BeanFactory {
    private Map<String,BeanDefinition> beanDefinitionMap=new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name,BeanDefinition beanDefinition)throws Exception
    {
        Object bean=doCreateBean(beanDefinition);
        beanDefinition.setBean(bean);
        beanDefinitionMap.put(name,beanDefinition);
    }

    protected abstract Object doCreateBean(BeanDefinition beanDefinition)throws Exception;
}
