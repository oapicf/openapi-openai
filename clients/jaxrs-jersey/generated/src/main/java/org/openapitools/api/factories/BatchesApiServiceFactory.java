package org.openapitools.api.factories;

import org.openapitools.api.BatchesApiService;
import org.openapitools.api.impl.BatchesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-26T05:16:07.346796379Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BatchesApiServiceFactory {
    private static final BatchesApiService service = new BatchesApiServiceImpl();

    public static BatchesApiService getBatchesApi() {
        return service;
    }
}
