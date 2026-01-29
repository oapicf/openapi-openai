package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="A list of files attached to a `message`.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T10:45:28.938980301Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageFileObject   {
  
  private String id;

  /**
   * The object type, which is always &#x60;thread.message.file&#x60;.
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
  }

  private ObjectEnum _object;
  private Integer createdAt;
  private String messageId;

  /**
   * The identifier, which can be referenced in API endpoints.
   **/
  
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints.")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The object type, which is always &#x60;thread.message.file&#x60;.
   **/
  
  @ApiModelProperty(required = true, value = "The object type, which is always `thread.message.file`.")
  @JsonProperty("object")
  @NotNull
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * The Unix timestamp (in seconds) for when the message file was created.
   **/
  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the message file was created.")
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.
   **/
  
  @ApiModelProperty(required = true, value = "The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.")
  @JsonProperty("message_id")
  @NotNull
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

