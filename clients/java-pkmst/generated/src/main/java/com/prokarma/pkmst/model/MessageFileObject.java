package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * A list of files attached to a &#x60;message&#x60;.
 */
@ApiModel(description = "A list of files attached to a `message`.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T10:45:02.588292416Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageFileObject   {
  @JsonProperty("id")
  private String id;

  /**
   * The object type, which is always `thread.message.file`.
   */
  public enum ObjectEnum {
    THREAD_MESSAGE_FILE("thread.message.file");

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

  @JsonProperty("message_id")
  private String messageId;

  public MessageFileObject id(String id) {
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

  public MessageFileObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always `thread.message.file`.
   * @return _object
   */
  @ApiModelProperty(required = true, value = "The object type, which is always `thread.message.file`.")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public MessageFileObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the message file was created.
   * @return createdAt
   */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the message file was created.")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public MessageFileObject messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  /**
   * The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.
   * @return messageId
   */
  @ApiModelProperty(required = true, value = "The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.")
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageFileObject messageFileObject = (MessageFileObject) o;
    return Objects.equals(this.id, messageFileObject.id) &&
        Objects.equals(this._object, messageFileObject._object) &&
        Objects.equals(this.createdAt, messageFileObject.createdAt) &&
        Objects.equals(this.messageId, messageFileObject.messageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, messageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageFileObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
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

