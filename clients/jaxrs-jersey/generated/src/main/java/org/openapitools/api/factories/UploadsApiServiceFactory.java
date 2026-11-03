package org.openapitools.api.factories;

import org.openapitools.api.UploadsApiService;
import org.openapitools.api.impl.UploadsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-11-03T06:33:59.727428422Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class UploadsApiServiceFactory {
    private static final UploadsApiService service = new UploadsApiServiceImpl();

    public static UploadsApiService getUploadsApi() {
        return service;
    }
}
