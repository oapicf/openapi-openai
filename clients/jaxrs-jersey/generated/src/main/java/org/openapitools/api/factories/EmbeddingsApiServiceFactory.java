package org.openapitools.api.factories;

import org.openapitools.api.EmbeddingsApiService;
import org.openapitools.api.impl.EmbeddingsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-11-03T06:33:59.727428422Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class EmbeddingsApiServiceFactory {
    private static final EmbeddingsApiService service = new EmbeddingsApiServiceImpl();

    public static EmbeddingsApiService getEmbeddingsApi() {
        return service;
    }
}
