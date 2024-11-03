package org.openapitools.api.factories;

import org.openapitools.api.EmbeddingsApiService;
import org.openapitools.api.impl.EmbeddingsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-03T11:08:40.472203335Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class EmbeddingsApiServiceFactory {
    private static final EmbeddingsApiService service = new EmbeddingsApiServiceImpl();

    public static EmbeddingsApiService getEmbeddingsApi() {
        return service;
    }
}
