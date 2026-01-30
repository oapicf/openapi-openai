package org.openapitools.api.factories;

import org.openapitools.api.RealtimeApiService;
import org.openapitools.api.impl.RealtimeApiServiceImpl;

public class RealtimeApiServiceFactory {
    private static final RealtimeApiService service = new RealtimeApiServiceImpl();

    public static RealtimeApiService getRealtimeApi() {
        return service;
    }
}
