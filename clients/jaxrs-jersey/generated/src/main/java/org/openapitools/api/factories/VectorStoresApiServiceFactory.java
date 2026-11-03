package org.openapitools.api.factories;

import org.openapitools.api.VectorStoresApiService;
import org.openapitools.api.impl.VectorStoresApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-11-03T06:33:59.727428422Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class VectorStoresApiServiceFactory {
    private static final VectorStoresApiService service = new VectorStoresApiServiceImpl();

    public static VectorStoresApiService getVectorStoresApi() {
        return service;
    }
}
