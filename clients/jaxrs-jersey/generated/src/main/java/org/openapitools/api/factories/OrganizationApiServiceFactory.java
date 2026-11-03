package org.openapitools.api.factories;

import org.openapitools.api.OrganizationApiService;
import org.openapitools.api.impl.OrganizationApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-11-03T06:33:59.727428422Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class OrganizationApiServiceFactory {
    private static final OrganizationApiService service = new OrganizationApiServiceImpl();

    public static OrganizationApiService getOrganizationApi() {
        return service;
    }
}
