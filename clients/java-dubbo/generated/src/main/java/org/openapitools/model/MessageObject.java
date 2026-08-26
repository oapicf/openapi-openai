package org.openapitools.model;

import org.openapitools.model.CreateMessageRequestAttachmentsInner;
import org.openapitools.model.MessageObjectContentInner;
import org.openapitools.model.MessageObjectIncompleteDetails;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Represents a message within a [thread](/docs/api-reference/threads).
 */
public class MessageObject implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The identifier, which can be referenced in API endpoints.
   */
  @JsonProperty("id")
  private String id;

  /**
   * The object type, which is always &#x60;thread.message&#x60;.
   */
  @JsonProperty("object")
  private String _object;

  /**
   * The Unix timestamp (in seconds) for when the message was created.
   */
  @JsonProperty("created_at")
  private Integer createdAt;

  /**
   * The [thread](/docs/api-reference/threads) ID that this message belongs to.
   */
  @JsonProperty("thread_id")
  private String threadId;

  /**
   * The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;.
   */
  @JsonProperty("status")
  private String status;

  @JsonProperty("incomplete_details")
  private MessageObjectIncompleteDetails incompleteDetails;

  /**
   * The Unix timestamp (in seconds) for when the message was completed.
   */
  @JsonProperty("completed_at")
  private Integer completedAt;

  /**
   * The Unix timestamp (in seconds) for when the message was marked as incomplete.
   */
  @JsonProperty("incomplete_at")
  private Integer incompleteAt;

  /**
   * The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.
   */
  @JsonProperty("role")
  private String role;

  /**
   * The content of the message in array of text and/or images.
   */
  @JsonProperty("content")
  private List<MessageObjectContentInner> content = new ArrayList<>();

  /**
   * If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
   */
  @JsonProperty("assistant_id")
  private String assistantId;

  /**
   * The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints.
   */
  @JsonProperty("run_id")
  private String runId;

  /**
   * A list of files attached to the message, and the tools they were added to.
   */
  @JsonProperty("attachments")
  private List<CreateMessageRequestAttachmentsInner> attachments;

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   */
  @JsonProperty("metadata")
  private Object metadata;

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
   * The object type, which is always &#x60;thread.message&#x60;.
   * @return _object
   */
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
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
   * The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;.
   * @return status
   */
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * 
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
   * The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.
   * @return role
   */
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
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
   * The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints.
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
  public List<CreateMessageRequestAttachmentsInner> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<CreateMessageRequestAttachmentsInner> attachments) {
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
        Objects.equals(this.attachments, messageObject.attachments) &&
        Objects.equals(this.metadata, messageObject.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, threadId, status, incompleteDetails, completedAt, incompleteAt, role, content, assistantId, runId, attachments, metadata);
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
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
