package org.openapitools.api.factories;

import org.openapitools.api.OrganizationApiService;
import org.openapitools.api.impl.OrganizationApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T14:09:10.882541726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class OrganizationApiServiceFactory {
    private static final OrganizationApiService service = new OrganizationApiServiceImpl();

    public static OrganizationApiService getOrganizationApi() {
        return service;
    }
}
