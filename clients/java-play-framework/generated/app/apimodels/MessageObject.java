package apimodels;

import apimodels.CreateMessageRequestAttachmentsInner;
import apimodels.MessageObjectContentInner;
import apimodels.MessageObjectIncompleteDetails;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Represents a message within a [thread](/docs/api-reference/threads).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MessageObject   {
  @JsonProperty("id")
  @NotNull

  private String id;

  /**
   * The object type, which is always `thread.message`.
   */
  public enum ObjectEnum {
    THREAD_MESSAGE("thread.message");

    private final String value;

    ObjectEnum(String value) {
      this.value = value;
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

  @JsonProperty("object")
  @NotNull

  private ObjectEnum _object;

  @JsonProperty("created_at")
  @NotNull

  private Integer createdAt;

  @JsonProperty("thread_id")
  @NotNull

  private String threadId;

  /**
   * The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
   */
  public enum StatusEnum {
    IN_PROGRESS("in_progress"),
    
    INCOMPLETE("incomplete"),
    
    COMPLETED("completed");

    private final String value;

    StatusEnum(String value) {
      this.value = value;
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

  @JsonProperty("status")
  @NotNull

  private StatusEnum status;

  @JsonProperty("incomplete_details")
  @NotNull
@Valid

  private MessageObjectIncompleteDetails incompleteDetails;

  @JsonProperty("completed_at")
  @NotNull

  private Integer completedAt;

  @JsonProperty("incomplete_at")
  @NotNull

  private Integer incompleteAt;

  /**
   * The entity that produced the message. One of `user` or `assistant`.
   */
  public enum RoleEnum {
    USER("user"),
    
    ASSISTANT("assistant");

    private final String value;

    RoleEnum(String value) {
      this.value = value;
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

  @JsonProperty("role")
  @NotNull

  private RoleEnum role;

  @JsonProperty("content")
  @NotNull
@Valid

  private List<MessageObjectContentInner> content = new ArrayList<>();

  @JsonProperty("assistant_id")
  @NotNull

  private String assistantId;

  @JsonProperty("run_id")
  @NotNull

  private String runId;

  @JsonProperty("attachments")
  @NotNull
@Valid

  private List<@Valid CreateMessageRequestAttachmentsInner> attachments = ;

  @JsonProperty("metadata")
  @NotNull

  private Object metadata;

  public MessageObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier, which can be referenced in API endpoints.
   * @return id
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
  public String getRunId() {
    return runId;
  }

  public void setRunId(String runId) {
    this.runId = runId;
  }

  public MessageObject attachments(List<@Valid CreateMessageRequestAttachmentsInner> attachments) {
    this.attachments = attachments;
    return this;
  }

  public MessageObject addAttachmentsItem(CreateMessageRequestAttachmentsInner attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * A list of files attached to the message, and the tools they were added to.
   * @return attachments
  **/
  public List<@Valid CreateMessageRequestAttachmentsInner> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<@Valid CreateMessageRequestAttachmentsInner> attachments) {
    this.attachments = attachments;
  }

  public MessageObject metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
  **/
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
        Objects.equals(attachments, messageObject.attachments) &&
        Objects.equals(metadata, messageObject.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, threadId, status, incompleteDetails, completedAt, incompleteAt, role, content, assistantId, runId, attachments, metadata);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

