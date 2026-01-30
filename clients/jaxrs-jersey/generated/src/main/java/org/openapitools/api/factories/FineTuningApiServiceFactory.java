package org.openapitools.api.factories;

import org.openapitools.api.FineTuningApiService;
import org.openapitools.api.impl.FineTuningApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T14:09:10.882541726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuningApiServiceFactory {
    private static final FineTuningApiService service = new FineTuningApiServiceImpl();

    public static FineTuningApiService getFineTuningApi() {
        return service;
    }
}
