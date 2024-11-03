package org.openapitools.api.factories;

import org.openapitools.api.ThreadsApiService;
import org.openapitools.api.impl.ThreadsApiServiceImpl;

public class ThreadsApiServiceFactory {
    private static final ThreadsApiService service = new ThreadsApiServiceImpl();

    public static ThreadsApiService getThreadsApi() {
        return service;
    }
}
