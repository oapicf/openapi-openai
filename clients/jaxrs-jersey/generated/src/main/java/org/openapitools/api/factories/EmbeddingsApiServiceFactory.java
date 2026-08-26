package org.openapitools.api.factories;

import org.openapitools.api.EmbeddingsApiService;
import org.openapitools.api.impl.EmbeddingsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-26T05:16:07.346796379Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class EmbeddingsApiServiceFactory {
    private static final EmbeddingsApiService service = new EmbeddingsApiServiceImpl();

    public static EmbeddingsApiService getEmbeddingsApi() {
        return service;
    }
}
