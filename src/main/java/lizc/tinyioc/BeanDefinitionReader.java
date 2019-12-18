package lizc.tinyioc;

public interface BeanDefinitionReader {
    void loadBeanDefinitions(String location) throws Exception;
}
