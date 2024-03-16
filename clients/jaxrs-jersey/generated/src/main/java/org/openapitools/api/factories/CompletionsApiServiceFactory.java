package org.openapitools.api.factories;

import org.openapitools.api.CompletionsApiService;
import org.openapitools.api.impl.CompletionsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-16T01:13:32.134709667Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CompletionsApiServiceFactory {
    private static final CompletionsApiService service = new CompletionsApiServiceImpl();

    public static CompletionsApiService getCompletionsApi() {
        return service;
    }
}
