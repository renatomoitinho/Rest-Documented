package hello;

import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


@Component
public class HelperDocumentation {

    public String apiDocumentation() {
        Path path = Paths.get(System.getProperty("user.dir"), "data-rest.apidoc");
        String content = "{}";
        try {
            content = IOUtils.toString(path.toUri(), Charsets.UTF_8);
        } catch (IOException ignore) {}
        return content;
    }
}
