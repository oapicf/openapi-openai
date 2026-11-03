package org.openapitools.api.factories;

import org.openapitools.api.RealtimeApiService;
import org.openapitools.api.impl.RealtimeApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-11-03T06:33:59.727428422Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class RealtimeApiServiceFactory {
    private static final RealtimeApiService service = new RealtimeApiServiceImpl();

    public static RealtimeApiService getRealtimeApi() {
        return service;
    }
}
