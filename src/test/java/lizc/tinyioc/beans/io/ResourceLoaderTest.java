package lizc.tinyioc.beans.io;

import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;

public class ResourceLoaderTest {

    @Test
    public void test() throws Exception {
        ResourceLoader resourceLoader = new ResourceLoader();
        Resource resource = resourceLoader.getResource("tinyioc.xml");
        InputStream inputStream = resource.getInputStream();
        Assert.assertNotNull(inputStream);
    }
}
