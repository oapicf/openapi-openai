package org.openapitools.api.factories;

import org.openapitools.api.FineTuningApiService;
import org.openapitools.api.impl.FineTuningApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-04-14T13:41:38.036864137Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FineTuningApiServiceFactory {
    private static final FineTuningApiService service = new FineTuningApiServiceImpl();

    public static FineTuningApiService getFineTuningApi() {
        return service;
    }
}
