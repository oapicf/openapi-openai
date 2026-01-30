package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CreateMessageRequestAttachmentsInner;
import org.openapitools.model.MessageObjectContentInner;
import org.openapitools.model.MessageObjectIncompleteDetails;

@Canonical
class MessageObject {
    /* The identifier, which can be referenced in API endpoints. */
    String id

    enum ObjectEnum {
    
        THREAD_MESSAGE("thread.message")
    
        private final String value
    
        ObjectEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The object type, which is always `thread.message`. */
    ObjectEnum _object
    /* The Unix timestamp (in seconds) for when the message was created. */
    Integer createdAt
    /* The [thread](/docs/api-reference/threads) ID that this message belongs to. */
    String threadId

    enum StatusEnum {
    
        IN_PROGRESS("in_progress"),
        
        INCOMPLETE("incomplete"),
        
        COMPLETED("completed")
    
        private final String value
    
        StatusEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The status of the message, which can be either `in_progress`, `incomplete`, or `completed`. */
    StatusEnum status
    
    MessageObjectIncompleteDetails incompleteDetails
    /* The Unix timestamp (in seconds) for when the message was completed. */
    Integer completedAt
    /* The Unix timestamp (in seconds) for when the message was marked as incomplete. */
    Integer incompleteAt

    enum RoleEnum {
    
        USER("user"),
        
        ASSISTANT("assistant")
    
        private final String value
    
        RoleEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The entity that produced the message. One of `user` or `assistant`. */
    RoleEnum role
    /* The content of the message in array of text and/or images. */
    List<MessageObjectContentInner> content = new ArrayList<>()
    /* If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. */
    String assistantId
    /* The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints. */
    String runId
    /* A list of files attached to the message, and the tools they were added to. */
    List<CreateMessageRequestAttachmentsInner> attachments
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    Object metadata
}
