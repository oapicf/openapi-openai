package org.openapitools.api.factories;

import org.openapitools.api.ModerationsApiService;
import org.openapitools.api.impl.ModerationsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-03T11:08:40.472203335Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ModerationsApiServiceFactory {
    private static final ModerationsApiService service = new ModerationsApiServiceImpl();

    public static ModerationsApiService getModerationsApi() {
        return service;
    }
}
