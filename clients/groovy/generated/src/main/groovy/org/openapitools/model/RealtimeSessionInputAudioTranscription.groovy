package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RealtimeSessionInputAudioTranscription {
    /* The model to use for transcription, `whisper-1` is the only currently  supported model.  */
    String model
}
