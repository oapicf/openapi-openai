package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class Image {
    /* The base64-encoded JSON of the generated image, if `response_format` is `b64_json`. */
    String b64Json
    /* The URL of the generated image, if `response_format` is `url` (default). */
    String url
    /* The prompt that was used to generate the image, if there was any revision to the prompt. */
    String revisedPrompt
}
