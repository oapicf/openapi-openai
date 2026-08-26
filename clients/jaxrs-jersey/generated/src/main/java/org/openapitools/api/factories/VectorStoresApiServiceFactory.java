package org.openapitools.api.factories;

import org.openapitools.api.VectorStoresApiService;
import org.openapitools.api.impl.VectorStoresApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-26T05:16:07.346796379Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class VectorStoresApiServiceFactory {
    private static final VectorStoresApiService service = new VectorStoresApiServiceImpl();

    public static VectorStoresApiService getVectorStoresApi() {
        return service;
    }
}
