package org.openapitools.api.factories;

import org.openapitools.api.ImagesApiService;
import org.openapitools.api.impl.ImagesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-16T01:13:32.134709667Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ImagesApiServiceFactory {
    private static final ImagesApiService service = new ImagesApiServiceImpl();

    public static ImagesApiService getImagesApi() {
        return service;
    }
}
