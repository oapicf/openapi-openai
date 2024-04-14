package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class TranscriptionWord {
    /* The text content of the word. */
    String word
    /* Start time of the word in seconds. */
    Float start
    /* End time of the word in seconds. */
    Float end
}
