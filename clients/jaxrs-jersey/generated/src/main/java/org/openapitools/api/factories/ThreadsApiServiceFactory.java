package org.openapitools.api.factories;

import org.openapitools.api.ThreadsApiService;
import org.openapitools.api.impl.ThreadsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-26T05:16:07.346796379Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ThreadsApiServiceFactory {
    private static final ThreadsApiService service = new ThreadsApiServiceImpl();

    public static ThreadsApiService getThreadsApi() {
        return service;
    }
}
