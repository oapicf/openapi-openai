package org.openapitools.api.factories;

import org.openapitools.api.ImagesApiService;
import org.openapitools.api.impl.ImagesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T10:45:25.331962823Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ImagesApiServiceFactory {
    private static final ImagesApiService service = new ImagesApiServiceImpl();

    public static ImagesApiService getImagesApi() {
        return service;
    }
}
