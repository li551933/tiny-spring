package lizc.tinyioc;


public class BeanDefinition {

    private Object bean;
    private String beanClassName;

    private Class beanClass;
    private PropertyValues propertyValues;

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public String getBeanClassName() {
        return beanClassName;
    }

    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;
        try {
            this.beanClass=Class.forName(beanClassName);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public BeanDefinition()
    {

    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public Object getBean()
    {
        return bean;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
