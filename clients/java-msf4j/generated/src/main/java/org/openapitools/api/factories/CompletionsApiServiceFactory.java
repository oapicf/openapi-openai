package org.openapitools.api.factories;

import org.openapitools.api.CompletionsApiService;
import org.openapitools.api.impl.CompletionsApiServiceImpl;

public class CompletionsApiServiceFactory {
    private static final CompletionsApiService service = new CompletionsApiServiceImpl();

    public static CompletionsApiService getCompletionsApi() {
        return service;
    }
}
