package org.openapitools.api.factories;

import org.openapitools.api.AudioApiService;
import org.openapitools.api.impl.AudioApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-11-03T06:33:59.727428422Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class AudioApiServiceFactory {
    private static final AudioApiService service = new AudioApiServiceImpl();

    public static AudioApiService getAudioApi() {
        return service;
    }
}
