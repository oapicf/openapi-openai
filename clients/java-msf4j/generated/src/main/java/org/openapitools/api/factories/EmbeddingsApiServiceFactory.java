package org.openapitools.api.factories;

import org.openapitools.api.EmbeddingsApiService;
import org.openapitools.api.impl.EmbeddingsApiServiceImpl;

public class EmbeddingsApiServiceFactory {
    private static final EmbeddingsApiService service = new EmbeddingsApiServiceImpl();

    public static EmbeddingsApiService getEmbeddingsApi() {
        return service;
    }
}
