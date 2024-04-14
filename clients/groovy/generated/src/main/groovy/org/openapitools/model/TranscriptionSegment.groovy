package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class TranscriptionSegment {
    /* Unique identifier of the segment. */
    Integer id
    /* Seek offset of the segment. */
    Integer seek
    /* Start time of the segment in seconds. */
    Float start
    /* End time of the segment in seconds. */
    Float end
    /* Text content of the segment. */
    String text
    /* Array of token IDs for the text content. */
    List<Integer> tokens = new ArrayList<>()
    /* Temperature parameter used for generating the segment. */
    Float temperature
    /* Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. */
    Float avgLogprob
    /* Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. */
    Float compressionRatio
    /* Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent. */
    Float noSpeechProb
}
