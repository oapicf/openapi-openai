package apimodels;

import apimodels.MessageDeltaObjectDelta;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Represents a message delta i.e. any changed fields on a message during streaming. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MessageDeltaObject   {
  @JsonProperty("id")
  @NotNull

  private String id;

  /**
   * The object type, which is always `thread.message.delta`.
   */
  public enum ObjectEnum {
    THREAD_MESSAGE_DELTA("thread.message.delta");

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

  @JsonProperty("delta")
  @NotNull
@Valid

  private MessageDeltaObjectDelta delta;

  public MessageDeltaObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier of the message, which can be referenced in API endpoints.
   * @return id
  **/
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
    return Objects.equals(id, messageDeltaObject.id) &&
        Objects.equals(_object, messageDeltaObject._object) &&
        Objects.equals(delta, messageDeltaObject.delta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, delta);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

