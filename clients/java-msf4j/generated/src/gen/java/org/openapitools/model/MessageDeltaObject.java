package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageDeltaObjectDelta;

/**
 * Represents a message delta i.e. any changed fields on a message during streaming. 
 */
@ApiModel(description = "Represents a message delta i.e. any changed fields on a message during streaming. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T10:44:59.856749186Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageDeltaObject   {
  @JsonProperty("id")
  private String id;

  /**
   * The object type, which is always `thread.message.delta`.
   */
  public enum ObjectEnum {
    THREAD_MESSAGE_DELTA("thread.message.delta");

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

  @JsonProperty("delta")
  private MessageDeltaObjectDelta delta;

  public MessageDeltaObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier of the message, which can be referenced in API endpoints.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The identifier of the message, which can be referenced in API endpoints.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MessageDeltaObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

   /**
   * The object type, which is always `thread.message.delta`.
   * @return _object
  **/
  @ApiModelProperty(required = true, value = "The object type, which is always `thread.message.delta`.")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public MessageDeltaObject delta(MessageDeltaObjectDelta delta) {
    this.delta = delta;
    return this;
  }

   /**
   * Get delta
   * @return delta
  **/
  @ApiModelProperty(required = true, value = "")
  public MessageDeltaObjectDelta getDelta() {
    return delta;
  }

  public void setDelta(MessageDeltaObjectDelta delta) {
    this.delta = delta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageDeltaObject messageDeltaObject = (MessageDeltaObject) o;
    return Objects.equals(this.id, messageDeltaObject.id) &&
        Objects.equals(this._object, messageDeltaObject._object) &&
        Objects.equals(this.delta, messageDeltaObject.delta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, delta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
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

