package org.openapitools.api.factories;

import org.openapitools.api.CompletionsApiService;
import org.openapitools.api.impl.CompletionsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-04-14T13:41:38.036864137Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CompletionsApiServiceFactory {
    private static final CompletionsApiService service = new CompletionsApiServiceImpl();

    public static CompletionsApiService getCompletionsApi() {
        return service;
    }
}
