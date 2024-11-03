package org.openapitools.api.factories;

import org.openapitools.api.ThreadsApiService;
import org.openapitools.api.impl.ThreadsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-03T11:08:40.472203335Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ThreadsApiServiceFactory {
    private static final ThreadsApiService service = new ThreadsApiServiceImpl();

    public static ThreadsApiService getThreadsApi() {
        return service;
    }
}
