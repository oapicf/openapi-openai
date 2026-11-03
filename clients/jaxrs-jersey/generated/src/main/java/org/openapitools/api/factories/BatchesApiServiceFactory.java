package org.openapitools.api.factories;

import org.openapitools.api.BatchesApiService;
import org.openapitools.api.impl.BatchesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-11-03T06:33:59.727428422Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class BatchesApiServiceFactory {
    private static final BatchesApiService service = new BatchesApiServiceImpl();

    public static BatchesApiService getBatchesApi() {
        return service;
    }
}
