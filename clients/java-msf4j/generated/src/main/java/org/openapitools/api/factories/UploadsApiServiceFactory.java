package org.openapitools.api.factories;

import org.openapitools.api.UploadsApiService;
import org.openapitools.api.impl.UploadsApiServiceImpl;

public class UploadsApiServiceFactory {
    private static final UploadsApiService service = new UploadsApiServiceImpl();

    public static UploadsApiService getUploadsApi() {
        return service;
    }
}
