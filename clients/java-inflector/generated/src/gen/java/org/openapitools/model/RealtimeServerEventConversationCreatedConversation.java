package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * The conversation resource.
 **/

@ApiModel(description = "The conversation resource.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventConversationCreatedConversation   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("object")
  private String _object;

  /**
   * The unique ID of the conversation.
   **/
  public RealtimeServerEventConversationCreatedConversation id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "The unique ID of the conversation.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The object type, must be `realtime.conversation`.
   **/
  public RealtimeServerEventConversationCreatedConversation _object(String _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(value = "The object type, must be `realtime.conversation`.")
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

