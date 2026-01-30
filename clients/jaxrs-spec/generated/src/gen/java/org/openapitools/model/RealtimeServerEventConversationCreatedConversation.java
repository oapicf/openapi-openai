package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The conversation resource.
 **/
@ApiModel(description = "The conversation resource.")
@JsonTypeName("RealtimeServerEventConversationCreated_conversation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventConversationCreatedConversation   {
  private String id;
  private String _object;

  public RealtimeServerEventConversationCreatedConversation() {
  }

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

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The object type, must be &#x60;realtime.conversation&#x60;.
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

  @JsonProperty("object")
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
    return Objects.equals(this.id, realtimeServerEventConversationCreatedConversation.id) &&
        Objects.equals(this._object, realtimeServerEventConversationCreatedConversation._object);
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

