package org.openapitools.api.factories;

import org.openapitools.api.BatchesApiService;
import org.openapitools.api.impl.BatchesApiServiceImpl;

public class BatchesApiServiceFactory {
    private static final BatchesApiService service = new BatchesApiServiceImpl();

    public static BatchesApiService getBatchesApi() {
        return service;
    }
}
