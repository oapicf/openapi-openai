package org.openapitools.api.factories;

import org.openapitools.api.AssistantsApiService;
import org.openapitools.api.impl.AssistantsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-04-14T13:41:38.036864137Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AssistantsApiServiceFactory {
    private static final AssistantsApiService service = new AssistantsApiServiceImpl();

    public static AssistantsApiService getAssistantsApi() {
        return service;
    }
}
