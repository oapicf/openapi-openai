package org.openapitools.api.factories;

import org.openapitools.api.ModerationsApiService;
import org.openapitools.api.impl.ModerationsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T10:45:25.331962823Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ModerationsApiServiceFactory {
    private static final ModerationsApiService service = new ModerationsApiServiceImpl();

    public static ModerationsApiService getModerationsApi() {
        return service;
    }
}
