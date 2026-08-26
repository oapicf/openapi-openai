package org.openapitools.model;

import org.openapitools.model.MessageDeltaObjectDelta;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Represents a message delta i.e. any changed fields on a message during streaming. 
 */
public class MessageDeltaObject implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The identifier of the message, which can be referenced in API endpoints.
   */
  @JsonProperty("id")
  private String id;

  /**
   * The object type, which is always &#x60;thread.message.delta&#x60;.
   */
  @JsonProperty("object")
  private String _object;

  @JsonProperty("delta")
  private MessageDeltaObjectDelta delta;

  /**
   * The identifier of the message, which can be referenced in API endpoints.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The object type, which is always &#x60;thread.message.delta&#x60;.
   * @return _object
   */
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * 
   * @return delta
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
