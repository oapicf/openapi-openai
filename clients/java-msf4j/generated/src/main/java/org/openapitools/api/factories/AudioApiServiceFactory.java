package org.openapitools.api.factories;

import org.openapitools.api.AudioApiService;
import org.openapitools.api.impl.AudioApiServiceImpl;

public class AudioApiServiceFactory {
    private static final AudioApiService service = new AudioApiServiceImpl();

    public static AudioApiService getAudioApi() {
        return service;
    }
}
