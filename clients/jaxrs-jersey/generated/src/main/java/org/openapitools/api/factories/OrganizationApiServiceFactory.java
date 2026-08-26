package org.openapitools.api.factories;

import org.openapitools.api.OrganizationApiService;
import org.openapitools.api.impl.OrganizationApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-26T05:16:07.346796379Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrganizationApiServiceFactory {
    private static final OrganizationApiService service = new OrganizationApiServiceImpl();

    public static OrganizationApiService getOrganizationApi() {
        return service;
    }
}
