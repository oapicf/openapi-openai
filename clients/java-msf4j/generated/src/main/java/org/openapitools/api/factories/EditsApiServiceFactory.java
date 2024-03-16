package org.openapitools.api.factories;

import org.openapitools.api.EditsApiService;
import org.openapitools.api.impl.EditsApiServiceImpl;

public class EditsApiServiceFactory {
    private static final EditsApiService service = new EditsApiServiceImpl();

    public static EditsApiService getEditsApi() {
        return service;
    }
}
