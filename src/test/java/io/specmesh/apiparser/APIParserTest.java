package io.specmesh.apiparser;

import io.specmesh.apiparser.model.APISpec;
import org.junit.jupiter.api.Test;

import java.io.IOException;
//import amf.apicontract.client.platform.*;

public class APIParserTest {

    @Test
    public void shouldTestId() throws IOException {

        APIParser apiParser = new APIParser();
        APISpec apiSpec = apiParser.loadResource(getClass().getClassLoader().getResourceAsStream("streetlights-simple-api.yaml"));

//        APISpec apiSpec = apiParser.loadResource("streetlights-simple-api.yaml");
        System.out.println("IDDDDD:" + apiSpec.id());
        apiSpec.getChannels().forEach((k,v) -> {
            System.out.println("k: " + k);
            v.forEach((kk,vv) ->
                    System.out.println("operationId:" + vv.getOperationId())
            );
        });



    }


    @Test
    public void shouldASMF() {
//        final AMFBaseUnitClient client = OASConfiguration.OAS20().baseUnitClient();
//        final AMFBaseUnitClient client = OASConfiguration.OAS20().baseUnitClient();
//        APIParser apiParser = new APIParser();
//        APISpec apiSpec = apiParser.loadResource("stretlights-simple-api.yaml");

    }
}
