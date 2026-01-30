package org.openapitools.api.factories;

import org.openapitools.api.VectorStoresApiService;
import org.openapitools.api.impl.VectorStoresApiServiceImpl;

public class VectorStoresApiServiceFactory {
    private static final VectorStoresApiService service = new VectorStoresApiServiceImpl();

    public static VectorStoresApiService getVectorStoresApi() {
        return service;
    }
}
