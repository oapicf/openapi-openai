package org.openapitools.api.factories;

import org.openapitools.api.ModerationsApiService;
import org.openapitools.api.impl.ModerationsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-26T05:16:07.346796379Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ModerationsApiServiceFactory {
    private static final ModerationsApiService service = new ModerationsApiServiceImpl();

    public static ModerationsApiService getModerationsApi() {
        return service;
    }
}
