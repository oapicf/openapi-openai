package org.openapitools.api.factories;

import org.openapitools.api.FineTuningApiService;
import org.openapitools.api.impl.FineTuningApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-26T05:16:07.346796379Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class FineTuningApiServiceFactory {
    private static final FineTuningApiService service = new FineTuningApiServiceImpl();

    public static FineTuningApiService getFineTuningApi() {
        return service;
    }
}
