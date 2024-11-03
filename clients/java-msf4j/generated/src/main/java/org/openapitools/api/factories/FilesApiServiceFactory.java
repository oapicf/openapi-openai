package org.openapitools.api.factories;

import org.openapitools.api.FilesApiService;
import org.openapitools.api.impl.FilesApiServiceImpl;

public class FilesApiServiceFactory {
    private static final FilesApiService service = new FilesApiServiceImpl();

    public static FilesApiService getFilesApi() {
        return service;
    }
}
