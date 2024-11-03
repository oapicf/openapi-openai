package org.openapitools.api.factories;

import org.openapitools.api.ImagesApiService;
import org.openapitools.api.impl.ImagesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-03T11:08:40.472203335Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ImagesApiServiceFactory {
    private static final ImagesApiService service = new ImagesApiServiceImpl();

    public static ImagesApiService getImagesApi() {
        return service;
    }
}
