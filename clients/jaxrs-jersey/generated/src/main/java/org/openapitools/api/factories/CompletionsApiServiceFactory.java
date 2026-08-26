package org.openapitools.api.factories;

import org.openapitools.api.CompletionsApiService;
import org.openapitools.api.impl.CompletionsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-26T05:16:07.346796379Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CompletionsApiServiceFactory {
    private static final CompletionsApiService service = new CompletionsApiServiceImpl();

    public static CompletionsApiService getCompletionsApi() {
        return service;
    }
}
