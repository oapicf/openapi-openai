package org.openapitools.api.factories;

import org.openapitools.api.ImagesApiService;
import org.openapitools.api.impl.ImagesApiServiceImpl;

public class ImagesApiServiceFactory {
    private static final ImagesApiService service = new ImagesApiServiceImpl();

    public static ImagesApiService getImagesApi() {
        return service;
    }
}
