package lizc.tinyioc.beans.factory;

import lizc.tinyioc.beans.BeanDefinition;

public interface BeanFactory {
    Object getBean(String name)throws Exception;
}
