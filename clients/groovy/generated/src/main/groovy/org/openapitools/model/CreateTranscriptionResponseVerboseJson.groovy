package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.TranscriptionSegment;
import org.openapitools.model.TranscriptionWord;

@Canonical
class CreateTranscriptionResponseVerboseJson {
    /* The language of the input audio. */
    String language
    /* The duration of the input audio. */
    String duration
    /* The transcribed text. */
    String text
    /* Extracted words and their corresponding timestamps. */
    List<TranscriptionWord> words = new ArrayList<>()
    /* Segments of the transcribed text and their corresponding details. */
    List<TranscriptionSegment> segments = new ArrayList<>()
}
