package org.openapitools.api.factories;

import org.openapitools.api.RealtimeApiService;
import org.openapitools.api.impl.RealtimeApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T14:09:10.882541726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeApiServiceFactory {
    private static final RealtimeApiService service = new RealtimeApiServiceImpl();

    public static RealtimeApiService getRealtimeApi() {
        return service;
    }
}
