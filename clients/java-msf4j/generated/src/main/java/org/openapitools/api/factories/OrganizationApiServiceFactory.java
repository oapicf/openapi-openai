package org.openapitools.api.factories;

import org.openapitools.api.OrganizationApiService;
import org.openapitools.api.impl.OrganizationApiServiceImpl;

public class OrganizationApiServiceFactory {
    private static final OrganizationApiService service = new OrganizationApiServiceImpl();

    public static OrganizationApiService getOrganizationApi() {
        return service;
    }
}
