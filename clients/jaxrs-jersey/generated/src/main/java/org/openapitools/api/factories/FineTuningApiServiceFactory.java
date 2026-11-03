package org.openapitools.api.factories;

import org.openapitools.api.FineTuningApiService;
import org.openapitools.api.impl.FineTuningApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-11-03T06:33:59.727428422Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class FineTuningApiServiceFactory {
    private static final FineTuningApiService service = new FineTuningApiServiceImpl();

    public static FineTuningApiService getFineTuningApi() {
        return service;
    }
}
