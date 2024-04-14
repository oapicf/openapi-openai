package org.openapitools.api.factories;

import org.openapitools.api.AssistantsApiService;
import org.openapitools.api.impl.AssistantsApiServiceImpl;

public class AssistantsApiServiceFactory {
    private static final AssistantsApiService service = new AssistantsApiServiceImpl();

    public static AssistantsApiService getAssistantsApi() {
        return service;
    }
}
