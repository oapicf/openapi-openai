package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.MessageDeltaObjectDeltaContentInner;

/**
 * The delta containing the fields that have changed on the Message.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageDeltaObjectDelta   {
  


  public enum RoleEnum {
    USER("user"),
    ASSISTANT("assistant");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private RoleEnum role;
  private List<MessageDeltaObjectDeltaContentInner> content = new ArrayList<>();

  public MessageDeltaObjectDelta () {

  }

  public MessageDeltaObjectDelta (RoleEnum role, List<MessageDeltaObjectDeltaContentInner> content) {
    this.role = role;
    this.content = content;
  }

    
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

    
  @JsonProperty("content")
  public List<MessageDeltaObjectDeltaContentInner> getContent() {
    return content;
  }
  public void setContent(List<MessageDeltaObjectDeltaContentInner> content) {
    this.content = content;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageDeltaObjectDelta messageDeltaObjectDelta = (MessageDeltaObjectDelta) o;
    return Objects.equals(role, messageDeltaObjectDelta.role) &&
        Objects.equals(content, messageDeltaObjectDelta.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaObjectDelta {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
