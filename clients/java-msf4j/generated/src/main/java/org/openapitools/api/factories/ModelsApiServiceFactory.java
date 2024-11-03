package org.openapitools.api.factories;

import org.openapitools.api.ModelsApiService;
import org.openapitools.api.impl.ModelsApiServiceImpl;

public class ModelsApiServiceFactory {
    private static final ModelsApiService service = new ModelsApiServiceImpl();

    public static ModelsApiService getModelsApi() {
        return service;
    }
}
