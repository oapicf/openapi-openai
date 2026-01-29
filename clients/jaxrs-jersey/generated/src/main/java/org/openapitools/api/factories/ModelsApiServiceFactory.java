package org.openapitools.api.factories;

import org.openapitools.api.ModelsApiService;
import org.openapitools.api.impl.ModelsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T10:45:25.331962823Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ModelsApiServiceFactory {
    private static final ModelsApiService service = new ModelsApiServiceImpl();

    public static ModelsApiService getModelsApi() {
        return service;
    }
}
