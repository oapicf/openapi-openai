package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.MessageDeltaContentTextObjectTextAnnotationsInner;

@Canonical
class MessageDeltaContentTextObjectText {
    /* The data that makes up the text. */
    String value
    
    List<MessageDeltaContentTextObjectTextAnnotationsInner> annotations
}
