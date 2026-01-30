package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RealtimeServerEventConversationCreatedConversation {
    /* The unique ID of the conversation. */
    String id
    /* The object type, must be `realtime.conversation`. */
    String _object
}
