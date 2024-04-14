package org.openapitools.api.factories;

import org.openapitools.api.ThreadsApiService;
import org.openapitools.api.impl.ThreadsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-04-14T13:41:38.036864137Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ThreadsApiServiceFactory {
    private static final ThreadsApiService service = new ThreadsApiServiceImpl();

    public static ThreadsApiService getThreadsApi() {
        return service;
    }
}
