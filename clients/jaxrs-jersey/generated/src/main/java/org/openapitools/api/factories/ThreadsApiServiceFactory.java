package org.openapitools.api.factories;

import org.openapitools.api.ThreadsApiService;
import org.openapitools.api.impl.ThreadsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T14:09:10.882541726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ThreadsApiServiceFactory {
    private static final ThreadsApiService service = new ThreadsApiServiceImpl();

    public static ThreadsApiService getThreadsApi() {
        return service;
    }
}
