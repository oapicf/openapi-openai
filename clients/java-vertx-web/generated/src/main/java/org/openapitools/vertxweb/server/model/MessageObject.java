package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.MessageObjectContentInner;
import org.openapitools.vertxweb.server.model.MessageObjectIncompleteDetails;

/**
 * Represents a message within a [thread](/docs/api-reference/threads).
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageObject   {
  
  private String id;


  public enum ObjectEnum {
    THREAD_MESSAGE("thread.message");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ObjectEnum _object;
  private Integer createdAt;
  private String threadId;


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
      return value;
    }
  }

  private StatusEnum status;
  private MessageObjectIncompleteDetails incompleteDetails;
  private Integer completedAt;
  private Integer incompleteAt;


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
      return value;
    }
  }

  private RoleEnum role;
  private List<MessageObjectContentInner> content = new ArrayList<>();
  private String assistantId;
  private String runId;
  private List<String> fileIds = new ArrayList<>();
  private Object metadata;

  public MessageObject () {

  }

  public MessageObject (String id, ObjectEnum _object, Integer createdAt, String threadId, StatusEnum status, MessageObjectIncompleteDetails incompleteDetails, Integer completedAt, Integer incompleteAt, RoleEnum role, List<MessageObjectContentInner> content, String assistantId, String runId, List<String> fileIds, Object metadata) {
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
    this.fileIds = fileIds;
    this.metadata = metadata;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

    
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("thread_id")
  public String getThreadId() {
    return threadId;
  }
  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

    
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

    
  @JsonProperty("incomplete_details")
  public MessageObjectIncompleteDetails getIncompleteDetails() {
    return incompleteDetails;
  }
  public void setIncompleteDetails(MessageObjectIncompleteDetails incompleteDetails) {
    this.incompleteDetails = incompleteDetails;
  }

    
  @JsonProperty("completed_at")
  public Integer getCompletedAt() {
    return completedAt;
  }
  public void setCompletedAt(Integer completedAt) {
    this.completedAt = completedAt;
  }

    
  @JsonProperty("incomplete_at")
  public Integer getIncompleteAt() {
    return incompleteAt;
  }
  public void setIncompleteAt(Integer incompleteAt) {
    this.incompleteAt = incompleteAt;
  }

    
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

    
  @JsonProperty("content")
  public List<MessageObjectContentInner> getContent() {
    return content;
  }
  public void setContent(List<MessageObjectContentInner> content) {
    this.content = content;
  }

    
  @JsonProperty("assistant_id")
  public String getAssistantId() {
    return assistantId;
  }
  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }

    
  @JsonProperty("run_id")
  public String getRunId() {
    return runId;
  }
  public void setRunId(String runId) {
    this.runId = runId;
  }

    
  @JsonProperty("file_ids")
  public List<String> getFileIds() {
    return fileIds;
  }
  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

    
  @JsonProperty("metadata")
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
    return Objects.equals(id, messageObject.id) &&
        Objects.equals(_object, messageObject._object) &&
        Objects.equals(createdAt, messageObject.createdAt) &&
        Objects.equals(threadId, messageObject.threadId) &&
        Objects.equals(status, messageObject.status) &&
        Objects.equals(incompleteDetails, messageObject.incompleteDetails) &&
        Objects.equals(completedAt, messageObject.completedAt) &&
        Objects.equals(incompleteAt, messageObject.incompleteAt) &&
        Objects.equals(role, messageObject.role) &&
        Objects.equals(content, messageObject.content) &&
        Objects.equals(assistantId, messageObject.assistantId) &&
        Objects.equals(runId, messageObject.runId) &&
        Objects.equals(fileIds, messageObject.fileIds) &&
        Objects.equals(metadata, messageObject.metadata);
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
