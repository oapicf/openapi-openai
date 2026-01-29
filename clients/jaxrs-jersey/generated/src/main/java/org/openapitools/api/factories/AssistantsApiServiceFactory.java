package org.openapitools.api.factories;

import org.openapitools.api.AssistantsApiService;
import org.openapitools.api.impl.AssistantsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T10:45:25.331962823Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AssistantsApiServiceFactory {
    private static final AssistantsApiService service = new AssistantsApiServiceImpl();

    public static AssistantsApiService getAssistantsApi() {
        return service;
    }
}
