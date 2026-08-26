package org.openapitools.api.factories;

import org.openapitools.api.ModelsApiService;
import org.openapitools.api.impl.ModelsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-26T05:16:07.346796379Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ModelsApiServiceFactory {
    private static final ModelsApiService service = new ModelsApiServiceImpl();

    public static ModelsApiService getModelsApi() {
        return service;
    }
}
