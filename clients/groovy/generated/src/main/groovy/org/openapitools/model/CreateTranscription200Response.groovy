package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CreateTranscriptionResponseJson;
import org.openapitools.model.CreateTranscriptionResponseVerboseJson;
import org.openapitools.model.TranscriptionSegment;
import org.openapitools.model.TranscriptionWord;

@Canonical
class CreateTranscription200Response {
    /* The transcribed text. */
    String text
    /* The language of the input audio. */
    String language
    /* The duration of the input audio. */
    String duration
    /* Extracted words and their corresponding timestamps. */
    List<TranscriptionWord> words
    /* Segments of the transcribed text and their corresponding details. */
    List<TranscriptionSegment> segments
}
