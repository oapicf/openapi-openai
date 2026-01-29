package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.MessageDeltaObjectDelta;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Represents a message delta i.e. any changed fields on a message during streaming. 
 */
@ApiModel(description="Represents a message delta i.e. any changed fields on a message during streaming. ")

public class MessageDeltaObject  {
  
 /**
  * The identifier of the message, which can be referenced in API endpoints.
  */
  @ApiModelProperty(required = true, value = "The identifier of the message, which can be referenced in API endpoints.")
  private String id;

public enum ObjectEnum {

    @JsonProperty("thread.message.delta") THREAD_MESSAGE_DELTA(String.valueOf("thread.message.delta"));

    private String value;

    ObjectEnum (String v) {
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

 /**
  * The object type, which is always `thread.message.delta`.
  */
  @ApiModelProperty(required = true, value = "The object type, which is always `thread.message.delta`.")
  private ObjectEnum _object;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private MessageDeltaObjectDelta delta;
 /**
  * The identifier of the message, which can be referenced in API endpoints.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public MessageDeltaObject id(String id) {
    this.id = id;
    return this;
  }

 /**
  * The object type, which is always &#x60;thread.message.delta&#x60;.
  * @return _object
  */
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object == null ? null : _object.value();
  }

  /**
   * Sets the <code>_object</code> property.
   */
 public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * Sets the <code>_object</code> property.
   */
  public MessageDeltaObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
  * Get delta
  * @return delta
  */
  @JsonProperty("delta")
  @NotNull
  public MessageDeltaObjectDelta getDelta() {
    return delta;
  }

  /**
   * Sets the <code>delta</code> property.
   */
 public void setDelta(MessageDeltaObjectDelta delta) {
    this.delta = delta;
  }

  /**
   * Sets the <code>delta</code> property.
   */
  public MessageDeltaObject delta(MessageDeltaObjectDelta delta) {
    this.delta = delta;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

