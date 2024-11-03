package org.openapitools.api.factories;

import org.openapitools.api.FineTuningApiService;
import org.openapitools.api.impl.FineTuningApiServiceImpl;

public class FineTuningApiServiceFactory {
    private static final FineTuningApiService service = new FineTuningApiServiceImpl();

    public static FineTuningApiService getFineTuningApi() {
        return service;
    }
}
