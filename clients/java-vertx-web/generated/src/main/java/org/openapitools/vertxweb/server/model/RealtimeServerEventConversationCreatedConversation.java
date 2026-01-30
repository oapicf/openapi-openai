package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The conversation resource.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeServerEventConversationCreatedConversation   {
  
  private String id;
  private String _object;

  public RealtimeServerEventConversationCreatedConversation () {

  }

  public RealtimeServerEventConversationCreatedConversation (String id, String _object) {
    this.id = id;
    this._object = _object;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventConversationCreatedConversation realtimeServerEventConversationCreatedConversation = (RealtimeServerEventConversationCreatedConversation) o;
    return Objects.equals(id, realtimeServerEventConversationCreatedConversation.id) &&
        Objects.equals(_object, realtimeServerEventConversationCreatedConversation._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventConversationCreatedConversation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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
