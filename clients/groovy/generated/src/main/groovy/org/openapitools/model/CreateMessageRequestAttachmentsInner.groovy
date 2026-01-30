package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CreateMessageRequestAttachmentsInnerToolsInner;

@Canonical
class CreateMessageRequestAttachmentsInner {
    /* The ID of the file to attach to the message. */
    String fileId
    /* The tools to add this file to. */
    List<CreateMessageRequestAttachmentsInnerToolsInner> tools = new ArrayList<>()
}
