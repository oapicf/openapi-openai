package org.openapitools.api.factories;

import org.openapitools.api.RealtimeApiService;
import org.openapitools.api.impl.RealtimeApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-26T05:16:07.346796379Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class RealtimeApiServiceFactory {
    private static final RealtimeApiService service = new RealtimeApiServiceImpl();

    public static RealtimeApiService getRealtimeApi() {
        return service;
    }
}
