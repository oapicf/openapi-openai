package org.openapitools.api.factories;

import org.openapitools.api.AudioApiService;
import org.openapitools.api.impl.AudioApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-16T01:13:32.134709667Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AudioApiServiceFactory {
    private static final AudioApiService service = new AudioApiServiceImpl();

    public static AudioApiService getAudioApi() {
        return service;
    }
}
