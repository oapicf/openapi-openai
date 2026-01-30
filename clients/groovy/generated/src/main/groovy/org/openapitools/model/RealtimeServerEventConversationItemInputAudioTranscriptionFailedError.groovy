package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RealtimeServerEventConversationItemInputAudioTranscriptionFailedError {
    /* The type of error. */
    String type
    /* Error code, if any. */
    String code
    /* A human-readable error message. */
    String message
    /* Parameter related to the error, if any. */
    String param
}
