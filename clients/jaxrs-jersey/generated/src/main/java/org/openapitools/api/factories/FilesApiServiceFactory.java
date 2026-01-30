package org.openapitools.api.factories;

import org.openapitools.api.FilesApiService;
import org.openapitools.api.impl.FilesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T14:09:10.882541726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FilesApiServiceFactory {
    private static final FilesApiService service = new FilesApiServiceImpl();

    public static FilesApiService getFilesApi() {
        return service;
    }
}
