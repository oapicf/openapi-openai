package org.openapitools.api.factories;

import org.openapitools.api.FineTunesApiService;
import org.openapitools.api.impl.FineTunesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-16T01:13:32.134709667Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FineTunesApiServiceFactory {
    private static final FineTunesApiService service = new FineTunesApiServiceImpl();

    public static FineTunesApiService getFineTunesApi() {
        return service;
    }
}
