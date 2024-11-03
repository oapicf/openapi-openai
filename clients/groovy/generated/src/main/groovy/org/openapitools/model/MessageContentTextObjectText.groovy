package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.MessageContentTextObjectTextAnnotationsInner;

@Canonical
class MessageContentTextObjectText {
    /* The data that makes up the text. */
    String value
    
    List<MessageContentTextObjectTextAnnotationsInner> annotations = new ArrayList<>()
}
