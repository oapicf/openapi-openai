package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.MessageObjectContentInner;
import com.prokarma.pkmst.model.MessageObjectIncompleteDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Represents a message within a [thread](/docs/api-reference/threads).
 */
@ApiModel(description = "Represents a message within a [thread](/docs/api-reference/threads).")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T10:45:02.588292416Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageObject   {
  @JsonProperty("id")
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

    @Override
    @JsonValue
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

  @JsonProperty("object")
  private ObjectEnum _object;

  @JsonProperty("created_at")
  private Integer createdAt;

  @JsonProperty("thread_id")
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

    @Override
    @JsonValue
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

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("incomplete_details")
  private MessageObjectIncompleteDetails incompleteDetails;

  @JsonProperty("completed_at")
  private Integer completedAt;

  @JsonProperty("incomplete_at")
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

    @Override
    @JsonValue
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

  @JsonProperty("role")
  private RoleEnum role;

  @JsonProperty("content")
  
  private List<MessageObjectContentInner> content = new ArrayList<>();

  @JsonProperty("assistant_id")
  private String assistantId;

  @JsonProperty("run_id")
  private String runId;

  @JsonProperty("file_ids")
  
  private List<String> fileIds = new ArrayList<>();

  @JsonProperty("metadata")
  private Object metadata;

  public MessageObject id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier, which can be referenced in API endpoints.
   * @return id
   */
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MessageObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always `thread.message`.
   * @return _object
   */
  @ApiModelProperty(required = true, value = "The object type, which is always `thread.message`.")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public MessageObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the message was created.
   * @return createdAt
   */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the message was created.")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public MessageObject threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

  /**
   * The [thread](/docs/api-reference/threads) ID that this message belongs to.
   * @return threadId
   */
  @ApiModelProperty(required = true, value = "The [thread](/docs/api-reference/threads) ID that this message belongs to.")
  public String getThreadId() {
    return threadId;
  }

  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

  public MessageObject status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
   * @return status
   */
  @ApiModelProperty(required = true, value = "The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public MessageObject incompleteDetails(MessageObjectIncompleteDetails incompleteDetails) {
    this.incompleteDetails = incompleteDetails;
    return this;
  }

  /**
   * Get incompleteDetails
   * @return incompleteDetails
   */
  @ApiModelProperty(required = true, value = "")
  public MessageObjectIncompleteDetails getIncompleteDetails() {
    return incompleteDetails;
  }

  public void setIncompleteDetails(MessageObjectIncompleteDetails incompleteDetails) {
    this.incompleteDetails = incompleteDetails;
  }

  public MessageObject completedAt(Integer completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the message was completed.
   * @return completedAt
   */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the message was completed.")
  public Integer getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(Integer completedAt) {
    this.completedAt = completedAt;
  }

  public MessageObject incompleteAt(Integer incompleteAt) {
    this.incompleteAt = incompleteAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the message was marked as incomplete.
   * @return incompleteAt
   */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the message was marked as incomplete.")
  public Integer getIncompleteAt() {
    return incompleteAt;
  }

  public void setIncompleteAt(Integer incompleteAt) {
    this.incompleteAt = incompleteAt;
  }

  public MessageObject role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * The entity that produced the message. One of `user` or `assistant`.
   * @return role
   */
  @ApiModelProperty(required = true, value = "The entity that produced the message. One of `user` or `assistant`.")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public MessageObject content(List<MessageObjectContentInner> content) {
    this.content = content;
    return this;
  }

  public MessageObject addContentItem(MessageObjectContentInner contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * The content of the message in array of text and/or images.
   * @return content
   */
  @ApiModelProperty(required = true, value = "The content of the message in array of text and/or images.")
  public List<MessageObjectContentInner> getContent() {
    return content;
  }

  public void setContent(List<MessageObjectContentInner> content) {
    this.content = content;
  }

  public MessageObject assistantId(String assistantId) {
    this.assistantId = assistantId;
    return this;
  }

  /**
   * If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
   * @return assistantId
   */
  @ApiModelProperty(required = true, value = "If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.")
  public String getAssistantId() {
    return assistantId;
  }

  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }

  public MessageObject runId(String runId) {
    this.runId = runId;
    return this;
  }

  /**
   * The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints.
   * @return runId
   */
  @ApiModelProperty(required = true, value = "The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints.")
  public String getRunId() {
    return runId;
  }

  public void setRunId(String runId) {
    this.runId = runId;
  }

  public MessageObject fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public MessageObject addFileIdsItem(String fileIdsItem) {
    if (this.fileIds == null) {
      this.fileIds = new ArrayList<>();
    }
    this.fileIds.add(fileIdsItem);
    return this;
  }

  /**
   * A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
   * @return fileIds
   */
  @ApiModelProperty(required = true, value = "A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.")
  public List<String> getFileIds() {
    return fileIds;
  }

  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  public MessageObject metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
   * @return metadata
   */
  @ApiModelProperty(required = true, value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

