package org.openapitools.api.factories;

import org.openapitools.api.ModelsApiService;
import org.openapitools.api.impl.ModelsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-11-03T06:33:59.727428422Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class ModelsApiServiceFactory {
    private static final ModelsApiService service = new ModelsApiServiceImpl();

    public static ModelsApiService getModelsApi() {
        return service;
    }
}
