package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CreateTranslationResponseJson;
import org.openapitools.model.CreateTranslationResponseVerboseJson;
import org.openapitools.model.TranscriptionSegment;

@Canonical
class CreateTranslation200Response {
    /* The translated text. */
    String text
    /* The language of the output translation (always `english`). */
    String language
    /* The duration of the input audio. */
    String duration
    /* Segments of the translated text and their corresponding details. */
    List<TranscriptionSegment> segments
}
