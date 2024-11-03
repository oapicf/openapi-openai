package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation {
    /* The ID of the specific File the citation is from. */
    String fileId
    /* The specific quote in the file. */
    String quote
}
