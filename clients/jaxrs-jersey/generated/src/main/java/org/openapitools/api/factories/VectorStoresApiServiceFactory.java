package org.openapitools.api.factories;

import org.openapitools.api.VectorStoresApiService;
import org.openapitools.api.impl.VectorStoresApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T14:09:10.882541726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class VectorStoresApiServiceFactory {
    private static final VectorStoresApiService service = new VectorStoresApiServiceImpl();

    public static VectorStoresApiService getVectorStoresApi() {
        return service;
    }
}
