package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * A list of files attached to a &#x60;message&#x60;.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "A list of files attached to a `message`.")
public class MessageFileObject   {
  
  private String id;


public enum ObjectEnum {

    @JsonProperty("thread.message.file") THREAD_MESSAGE_FILE(String.valueOf("thread.message.file"));


    private String value;

    ObjectEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
        for (ObjectEnum b : ObjectEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private ObjectEnum _object;

  private Integer createdAt;

  private String messageId;

  /**
   * The identifier, which can be referenced in API endpoints.
   **/
  public MessageFileObject id(String id) {
    this.id = id;
    return this;
  }

  
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
  public MessageFileObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
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
  public MessageFileObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
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
  public MessageFileObject messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  
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

