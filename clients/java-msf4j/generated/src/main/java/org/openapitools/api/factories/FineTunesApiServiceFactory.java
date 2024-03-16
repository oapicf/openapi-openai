package org.openapitools.api.factories;

import org.openapitools.api.FineTunesApiService;
import org.openapitools.api.impl.FineTunesApiServiceImpl;

public class FineTunesApiServiceFactory {
    private static final FineTunesApiService service = new FineTunesApiServiceImpl();

    public static FineTunesApiService getFineTunesApi() {
        return service;
    }
}
