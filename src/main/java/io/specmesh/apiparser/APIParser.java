package io.specmesh.apiparser;

import io.specmesh.apiparser.model.APISpec;
import org.jetbrains.annotations.NotNull;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.introspector.BeanAccess;
import org.yaml.snakeyaml.representer.Representer;

import java.io.IOException;
import java.io.InputStream;

public class APIParser {
    public APISpec loadResource(final String specYaml) throws IOException {
        Yaml yaml = getYaml();
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream(specYaml);
        if (inputStream == null || inputStream.available() == 0) throw new RuntimeException("ResourceNotFound:"+specYaml);
        return  yaml.load(inputStream);
    }

    @NotNull
    private static Yaml getYaml() {
        Representer representer = new Representer();
        representer.getPropertyUtils().setSkipMissingProperties(true);
        Yaml yaml = new Yaml(new Constructor(APISpec.class), representer);
        yaml.setBeanAccess(BeanAccess.FIELD);
        return yaml;
    }

    public APISpec loadResource(final InputStream inputStream) throws IOException {
        if (inputStream == null || inputStream.available() == 0) throw new RuntimeException("Not found");
        return  getYaml().load(inputStream);
    }

}
