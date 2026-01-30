package org.openapitools.api.factories;

import org.openapitools.api.CompletionsApiService;
import org.openapitools.api.impl.CompletionsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T14:09:10.882541726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CompletionsApiServiceFactory {
    private static final CompletionsApiService service = new CompletionsApiServiceImpl();

    public static CompletionsApiService getCompletionsApi() {
        return service;
    }
}
