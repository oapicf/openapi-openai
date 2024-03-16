package org.openapitools.api.factories;

import org.openapitools.api.ModelsApiService;
import org.openapitools.api.impl.ModelsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-16T01:13:32.134709667Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ModelsApiServiceFactory {
    private static final ModelsApiService service = new ModelsApiServiceImpl();

    public static ModelsApiService getModelsApi() {
        return service;
    }
}
