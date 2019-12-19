package lizc.tinyioc.beans.io;

import java.net.URL;

public class ResourceLoader {
    public Resource getResource(String location)
    {
        URL resoure=this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resoure);
    }
}
