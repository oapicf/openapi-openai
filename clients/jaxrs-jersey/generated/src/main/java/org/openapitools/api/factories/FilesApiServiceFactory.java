package org.openapitools.api.factories;

import org.openapitools.api.FilesApiService;
import org.openapitools.api.impl.FilesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-16T01:13:32.134709667Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FilesApiServiceFactory {
    private static final FilesApiService service = new FilesApiServiceImpl();

    public static FilesApiService getFilesApi() {
        return service;
    }
}
