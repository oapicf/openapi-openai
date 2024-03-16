package org.openapitools.api.factories;

import org.openapitools.api.EditsApiService;
import org.openapitools.api.impl.EditsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-16T01:13:32.134709667Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class EditsApiServiceFactory {
    private static final EditsApiService service = new EditsApiServiceImpl();

    public static EditsApiService getEditsApi() {
        return service;
    }
}
