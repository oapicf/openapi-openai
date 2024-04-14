package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MessageObjectContentInner;
import org.openapitools.model.MessageObjectIncompleteDetails;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Represents a message within a [thread](/docs/api-reference/threads).
 **/
@ApiModel(description="Represents a message within a [thread](/docs/api-reference/threads).")

public class MessageObject  {
  
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints.")
 /**
   * The identifier, which can be referenced in API endpoints.
  **/
  private String id;

public enum ObjectEnum {

THREAD_MESSAGE(String.valueOf("thread.message"));


    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ObjectEnum fromValue(String value) {
        for (ObjectEnum b : ObjectEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "The object type, which is always `thread.message`.")
 /**
   * The object type, which is always `thread.message`.
  **/
  private ObjectEnum _object;

  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the message was created.")
 /**
   * The Unix timestamp (in seconds) for when the message was created.
  **/
  private Integer createdAt;

  @ApiModelProperty(required = true, value = "The [thread](/docs/api-reference/threads) ID that this message belongs to.")
 /**
   * The [thread](/docs/api-reference/threads) ID that this message belongs to.
  **/
  private String threadId;

public enum StatusEnum {

IN_PROGRESS(String.valueOf("in_progress")), INCOMPLETE(String.valueOf("incomplete")), COMPLETED(String.valueOf("completed"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.")
 /**
   * The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
  **/
  private StatusEnum status;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private MessageObjectIncompleteDetails incompleteDetails;

  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the message was completed.")
 /**
   * The Unix timestamp (in seconds) for when the message was completed.
  **/
  private Integer completedAt;

  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the message was marked as incomplete.")
 /**
   * The Unix timestamp (in seconds) for when the message was marked as incomplete.
  **/
  private Integer incompleteAt;

public enum RoleEnum {

USER(String.valueOf("user")), ASSISTANT(String.valueOf("assistant"));


    private String value;

    RoleEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String value) {
        for (RoleEnum b : RoleEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "The entity that produced the message. One of `user` or `assistant`.")
 /**
   * The entity that produced the message. One of `user` or `assistant`.
  **/
  private RoleEnum role;

  @ApiModelProperty(required = true, value = "The content of the message in array of text and/or images.")
  @Valid
 /**
   * The content of the message in array of text and/or images.
  **/
  private List<MessageObjectContentInner> content = new ArrayList<>();

  @ApiModelProperty(required = true, value = "If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.")
 /**
   * If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
  **/
  private String assistantId;

  @ApiModelProperty(required = true, value = "The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints.")
 /**
   * The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints.
  **/
  private String runId;

  @ApiModelProperty(required = true, value = "A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.")
 /**
   * A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
  **/
  private List<String> fileIds = new ArrayList<>();

  @ApiModelProperty(required = true, value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ")
 /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
  **/
  private Object metadata;
 /**
   * The identifier, which can be referenced in API endpoints.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MessageObject id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The object type, which is always &#x60;thread.message&#x60;.
   * @return _object
  **/
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    if (_object == null) {
      return null;
    }
    return _object.value();
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public MessageObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the message was created.
   * @return createdAt
  **/
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public MessageObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
   * The [thread](/docs/api-reference/threads) ID that this message belongs to.
   * @return threadId
  **/
  @JsonProperty("thread_id")
  @NotNull
  public String getThreadId() {
    return threadId;
  }

  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

  public MessageObject threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

 /**
   * The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;.
   * @return status
  **/
  @JsonProperty("status")
  @NotNull
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public MessageObject status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get incompleteDetails
   * @return incompleteDetails
  **/
  @JsonProperty("incomplete_details")
  @NotNull
  public MessageObjectIncompleteDetails getIncompleteDetails() {
    return incompleteDetails;
  }

  public void setIncompleteDetails(MessageObjectIncompleteDetails incompleteDetails) {
    this.incompleteDetails = incompleteDetails;
  }

  public MessageObject incompleteDetails(MessageObjectIncompleteDetails incompleteDetails) {
    this.incompleteDetails = incompleteDetails;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the message was completed.
   * @return completedAt
  **/
  @JsonProperty("completed_at")
  @NotNull
  public Integer getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(Integer completedAt) {
    this.completedAt = completedAt;
  }

  public MessageObject completedAt(Integer completedAt) {
    this.completedAt = completedAt;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the message was marked as incomplete.
   * @return incompleteAt
  **/
  @JsonProperty("incomplete_at")
  @NotNull
  public Integer getIncompleteAt() {
    return incompleteAt;
  }

  public void setIncompleteAt(Integer incompleteAt) {
    this.incompleteAt = incompleteAt;
  }

  public MessageObject incompleteAt(Integer incompleteAt) {
    this.incompleteAt = incompleteAt;
    return this;
  }

 /**
   * The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.
   * @return role
  **/
  @JsonProperty("role")
  @NotNull
  public String getRole() {
    if (role == null) {
      return null;
    }
    return role.value();
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public MessageObject role(RoleEnum role) {
    this.role = role;
    return this;
  }

 /**
   * The content of the message in array of text and/or images.
   * @return content
  **/
  @JsonProperty("content")
  @NotNull
  public List<MessageObjectContentInner> getContent() {
    return content;
  }

  public void setContent(List<MessageObjectContentInner> content) {
    this.content = content;
  }

  public MessageObject content(List<MessageObjectContentInner> content) {
    this.content = content;
    return this;
  }

  public MessageObject addContentItem(MessageObjectContentInner contentItem) {
    this.content.add(contentItem);
    return this;
  }

 /**
   * If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
   * @return assistantId
  **/
  @JsonProperty("assistant_id")
  @NotNull
  public String getAssistantId() {
    return assistantId;
  }

  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }

  public MessageObject assistantId(String assistantId) {
    this.assistantId = assistantId;
    return this;
  }

 /**
   * The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints.
   * @return runId
  **/
  @JsonProperty("run_id")
  @NotNull
  public String getRunId() {
    return runId;
  }

  public void setRunId(String runId) {
    this.runId = runId;
  }

  public MessageObject runId(String runId) {
    this.runId = runId;
    return this;
  }

 /**
   * A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
   * @return fileIds
  **/
  @JsonProperty("file_ids")
  @NotNull
 @Size(max=10)  public List<String> getFileIds() {
    return fileIds;
  }

  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  public MessageObject fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public MessageObject addFileIdsItem(String fileIdsItem) {
    this.fileIds.add(fileIdsItem);
    return this;
  }

 /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
   * @return metadata
  **/
  @JsonProperty("metadata")
  @NotNull
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public MessageObject metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageObject messageObject = (MessageObject) o;
    return Objects.equals(this.id, messageObject.id) &&
        Objects.equals(this._object, messageObject._object) &&
        Objects.equals(this.createdAt, messageObject.createdAt) &&
        Objects.equals(this.threadId, messageObject.threadId) &&
        Objects.equals(this.status, messageObject.status) &&
        Objects.equals(this.incompleteDetails, messageObject.incompleteDetails) &&
        Objects.equals(this.completedAt, messageObject.completedAt) &&
        Objects.equals(this.incompleteAt, messageObject.incompleteAt) &&
        Objects.equals(this.role, messageObject.role) &&
        Objects.equals(this.content, messageObject.content) &&
        Objects.equals(this.assistantId, messageObject.assistantId) &&
        Objects.equals(this.runId, messageObject.runId) &&
        Objects.equals(this.fileIds, messageObject.fileIds) &&
        Objects.equals(this.metadata, messageObject.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, threadId, status, incompleteDetails, completedAt, incompleteAt, role, content, assistantId, runId, fileIds, metadata);
  }

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
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

