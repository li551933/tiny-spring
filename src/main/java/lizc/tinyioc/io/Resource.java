package lizc.tinyioc.io;

import java.io.InputStream;

public interface Resource {
    InputStream getInputStream() throws Exception;
}
