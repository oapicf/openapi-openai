/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.MessageObjectContentInner;
import org.openapitools.client.model.MessageObjectIncompleteDetails;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Represents a message within a [thread](/docs/api-reference/threads).
 **/
@ApiModel(description = "Represents a message within a [thread](/docs/api-reference/threads).")
public class MessageObject {
  
  @SerializedName("id")
  private String id = null;
  public enum _objectEnum {
     thread.message, 
  };
  @SerializedName("object")
  private _objectEnum _object = null;
  @SerializedName("created_at")
  private Integer createdAt = null;
  @SerializedName("thread_id")
  private String threadId = null;
  public enum StatusEnum {
     in_progress,  incomplete,  completed, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("incomplete_details")
  private MessageObjectIncompleteDetails incompleteDetails = null;
  @SerializedName("completed_at")
  private Integer completedAt = null;
  @SerializedName("incomplete_at")
  private Integer incompleteAt = null;
  public enum RoleEnum {
     user,  assistant, 
  };
  @SerializedName("role")
  private RoleEnum role = null;
  @SerializedName("content")
  private List<MessageObjectContentInner> content = null;
  @SerializedName("assistant_id")
  private String assistantId = null;
  @SerializedName("run_id")
  private String runId = null;
  @SerializedName("file_ids")
  private List<String> fileIds = [];
  @SerializedName("metadata")
  private Object metadata = null;

  /**
   * The identifier, which can be referenced in API endpoints.
   **/
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The object type, which is always `thread.message`.
   **/
  @ApiModelProperty(required = true, value = "The object type, which is always `thread.message`.")
  public _objectEnum getObject() {
    return _object;
  }
  public void setObject(_objectEnum _object) {
    this._object = _object;
  }

  /**
   * The Unix timestamp (in seconds) for when the message was created.
   **/
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the message was created.")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The [thread](/docs/api-reference/threads) ID that this message belongs to.
   **/
  @ApiModelProperty(required = true, value = "The [thread](/docs/api-reference/threads) ID that this message belongs to.")
  public String getThreadId() {
    return threadId;
  }
  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

  /**
   * The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
   **/
  @ApiModelProperty(required = true, value = "The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public MessageObjectIncompleteDetails getIncompleteDetails() {
    return incompleteDetails;
  }
  public void setIncompleteDetails(MessageObjectIncompleteDetails incompleteDetails) {
    this.incompleteDetails = incompleteDetails;
  }

  /**
   * The Unix timestamp (in seconds) for when the message was completed.
   **/
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the message was completed.")
  public Integer getCompletedAt() {
    return completedAt;
  }
  public void setCompletedAt(Integer completedAt) {
    this.completedAt = completedAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the message was marked as incomplete.
   **/
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the message was marked as incomplete.")
  public Integer getIncompleteAt() {
    return incompleteAt;
  }
  public void setIncompleteAt(Integer incompleteAt) {
    this.incompleteAt = incompleteAt;
  }

  /**
   * The entity that produced the message. One of `user` or `assistant`.
   **/
  @ApiModelProperty(required = true, value = "The entity that produced the message. One of `user` or `assistant`.")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   * The content of the message in array of text and/or images.
   **/
  @ApiModelProperty(required = true, value = "The content of the message in array of text and/or images.")
  public List<MessageObjectContentInner> getContent() {
    return content;
  }
  public void setContent(List<MessageObjectContentInner> content) {
    this.content = content;
  }

  /**
   * If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
   **/
  @ApiModelProperty(required = true, value = "If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.")
  public String getAssistantId() {
    return assistantId;
  }
  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }

  /**
   * The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints.
   **/
  @ApiModelProperty(required = true, value = "The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints.")
  public String getRunId() {
    return runId;
  }
  public void setRunId(String runId) {
    this.runId = runId;
  }

  /**
   * A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
   **/
  @ApiModelProperty(required = true, value = "A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.")
  public List<String> getFileIds() {
    return fileIds;
  }
  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
   **/
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
    return (this.id == null ? messageObject.id == null : this.id.equals(messageObject.id)) &&
        (this._object == null ? messageObject._object == null : this._object.equals(messageObject._object)) &&
        (this.createdAt == null ? messageObject.createdAt == null : this.createdAt.equals(messageObject.createdAt)) &&
        (this.threadId == null ? messageObject.threadId == null : this.threadId.equals(messageObject.threadId)) &&
        (this.status == null ? messageObject.status == null : this.status.equals(messageObject.status)) &&
        (this.incompleteDetails == null ? messageObject.incompleteDetails == null : this.incompleteDetails.equals(messageObject.incompleteDetails)) &&
        (this.completedAt == null ? messageObject.completedAt == null : this.completedAt.equals(messageObject.completedAt)) &&
        (this.incompleteAt == null ? messageObject.incompleteAt == null : this.incompleteAt.equals(messageObject.incompleteAt)) &&
        (this.role == null ? messageObject.role == null : this.role.equals(messageObject.role)) &&
        (this.content == null ? messageObject.content == null : this.content.equals(messageObject.content)) &&
        (this.assistantId == null ? messageObject.assistantId == null : this.assistantId.equals(messageObject.assistantId)) &&
        (this.runId == null ? messageObject.runId == null : this.runId.equals(messageObject.runId)) &&
        (this.fileIds == null ? messageObject.fileIds == null : this.fileIds.equals(messageObject.fileIds)) &&
        (this.metadata == null ? messageObject.metadata == null : this.metadata.equals(messageObject.metadata));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.threadId == null ? 0: this.threadId.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.incompleteDetails == null ? 0: this.incompleteDetails.hashCode());
    result = 31 * result + (this.completedAt == null ? 0: this.completedAt.hashCode());
    result = 31 * result + (this.incompleteAt == null ? 0: this.incompleteAt.hashCode());
    result = 31 * result + (this.role == null ? 0: this.role.hashCode());
    result = 31 * result + (this.content == null ? 0: this.content.hashCode());
    result = 31 * result + (this.assistantId == null ? 0: this.assistantId.hashCode());
    result = 31 * result + (this.runId == null ? 0: this.runId.hashCode());
    result = 31 * result + (this.fileIds == null ? 0: this.fileIds.hashCode());
    result = 31 * result + (this.metadata == null ? 0: this.metadata.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageObject {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  threadId: ").append(threadId).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  incompleteDetails: ").append(incompleteDetails).append("\n");
    sb.append("  completedAt: ").append(completedAt).append("\n");
    sb.append("  incompleteAt: ").append(incompleteAt).append("\n");
    sb.append("  role: ").append(role).append("\n");
    sb.append("  content: ").append(content).append("\n");
    sb.append("  assistantId: ").append(assistantId).append("\n");
    sb.append("  runId: ").append(runId).append("\n");
    sb.append("  fileIds: ").append(fileIds).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
