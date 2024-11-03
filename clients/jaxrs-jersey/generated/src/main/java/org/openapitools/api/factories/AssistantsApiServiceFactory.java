package org.openapitools.api.factories;

import org.openapitools.api.AssistantsApiService;
import org.openapitools.api.impl.AssistantsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-03T11:08:40.472203335Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AssistantsApiServiceFactory {
    private static final AssistantsApiService service = new AssistantsApiServiceImpl();

    public static AssistantsApiService getAssistantsApi() {
        return service;
    }
}
