package org.openapitools.api.factories;

import org.openapitools.api.EmbeddingsApiService;
import org.openapitools.api.impl.EmbeddingsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-04-14T13:41:38.036864137Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class EmbeddingsApiServiceFactory {
    private static final EmbeddingsApiService service = new EmbeddingsApiServiceImpl();

    public static EmbeddingsApiService getEmbeddingsApi() {
        return service;
    }
}
