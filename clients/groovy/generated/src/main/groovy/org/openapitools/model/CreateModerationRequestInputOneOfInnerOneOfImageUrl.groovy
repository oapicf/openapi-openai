package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;

@Canonical
class CreateModerationRequestInputOneOfInnerOneOfImageUrl {
    /* Either a URL of the image or the base64 encoded image data. */
    URI url
}
