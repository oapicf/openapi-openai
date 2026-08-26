package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CreateMessageRequestAttachmentsInner;
import org.openapitools.server.model.MessageObjectContentInner;
import org.openapitools.server.model.MessageObjectIncompleteDetails;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Represents a message within a [thread](/docs/api-reference/threads).
 */
public class MessageObject   {

    private String id;

    /**
    * The object type, which is always `thread.message`.
    */
    public enum ObjectEnum {
        THREAD_MESSAGE("thread.message");

        private String value;

        ObjectEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static ObjectEnum fromValue(String text) {
            for (ObjectEnum b : ObjectEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private ObjectEnum _object;
    private Integer createdAt;
    private String threadId;

    /**
    * The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
    */
    public enum StatusEnum {
        IN_PROGRESS("in_progress"),
        INCOMPLETE("incomplete"),
        COMPLETED("completed");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private StatusEnum status;
    private MessageObjectIncompleteDetails incompleteDetails;
    private Integer completedAt;
    private Integer incompleteAt;

    /**
    * The entity that produced the message. One of `user` or `assistant`.
    */
    public enum RoleEnum {
        USER("user"),
        ASSISTANT("assistant");

        private String value;

        RoleEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static RoleEnum fromValue(String text) {
            for (RoleEnum b : RoleEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private RoleEnum role;
    private List<MessageObjectContentInner> content = new ArrayList<>();
    private String assistantId;
    private String runId;
    private List<@Valid CreateMessageRequestAttachmentsInner> attachments;
    private Object metadata;

    /**
     * Default constructor.
     */
    public MessageObject() {
    // JSON-B / Jackson
    }

    /**
     * Create MessageObject.
     *
     * @param id The identifier, which can be referenced in API endpoints.
     * @param _object The object type, which is always &#x60;thread.message&#x60;.
     * @param createdAt The Unix timestamp (in seconds) for when the message was created.
     * @param threadId The [thread](/docs/api-reference/threads) ID that this message belongs to.
     * @param status The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;.
     * @param incompleteDetails incompleteDetails
     * @param completedAt The Unix timestamp (in seconds) for when the message was completed.
     * @param incompleteAt The Unix timestamp (in seconds) for when the message was marked as incomplete.
     * @param role The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.
     * @param content The content of the message in array of text and/or images.
     * @param assistantId If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
     * @param runId The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints.
     * @param attachments A list of files attached to the message, and the tools they were added to.
     * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
     */
    public MessageObject(
        String id, 
        ObjectEnum _object, 
        Integer createdAt, 
        String threadId, 
        StatusEnum status, 
        MessageObjectIncompleteDetails incompleteDetails, 
        Integer completedAt, 
        Integer incompleteAt, 
        RoleEnum role, 
        List<MessageObjectContentInner> content, 
        String assistantId, 
        String runId, 
        List<@Valid CreateMessageRequestAttachmentsInner> attachments, 
        Object metadata
    ) {
        this.id = id;
        this._object = _object;
        this.createdAt = createdAt;
        this.threadId = threadId;
        this.status = status;
        this.incompleteDetails = incompleteDetails;
        this.completedAt = completedAt;
        this.incompleteAt = incompleteAt;
        this.role = role;
        this.content = content;
        this.assistantId = assistantId;
        this.runId = runId;
        this.attachments = attachments;
        this.metadata = metadata;
    }



    /**
     * The identifier, which can be referenced in API endpoints.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The object type, which is always `thread.message`.
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * The Unix timestamp (in seconds) for when the message was created.
     * @return createdAt
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The [thread](/docs/api-reference/threads) ID that this message belongs to.
     * @return threadId
     */
    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    /**
     * The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * Get incompleteDetails
     * @return incompleteDetails
     */
    public MessageObjectIncompleteDetails getIncompleteDetails() {
        return incompleteDetails;
    }

    public void setIncompleteDetails(MessageObjectIncompleteDetails incompleteDetails) {
        this.incompleteDetails = incompleteDetails;
    }

    /**
     * The Unix timestamp (in seconds) for when the message was completed.
     * @return completedAt
     */
    public Integer getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(Integer completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * The Unix timestamp (in seconds) for when the message was marked as incomplete.
     * @return incompleteAt
     */
    public Integer getIncompleteAt() {
        return incompleteAt;
    }

    public void setIncompleteAt(Integer incompleteAt) {
        this.incompleteAt = incompleteAt;
    }

    /**
     * The entity that produced the message. One of `user` or `assistant`.
     * @return role
     */
    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    /**
     * The content of the message in array of text and/or images.
     * @return content
     */
    public List<MessageObjectContentInner> getContent() {
        return content;
    }

    public void setContent(List<MessageObjectContentInner> content) {
        this.content = content;
    }

    /**
     * If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
     * @return assistantId
     */
    public String getAssistantId() {
        return assistantId;
    }

    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    /**
     * The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints.
     * @return runId
     */
    public String getRunId() {
        return runId;
    }

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * A list of files attached to the message, and the tools they were added to.
     * @return attachments
     */
    public List<@Valid CreateMessageRequestAttachmentsInner> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<@Valid CreateMessageRequestAttachmentsInner> attachments) {
        this.attachments = attachments;
    }

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
     * @return metadata
     */
    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageObject {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    incompleteDetails: ").append(toIndentedString(incompleteDetails)).append("\n");
        sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
        sb.append("    incompleteAt: ").append(toIndentedString(incompleteAt)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
        sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
        sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

