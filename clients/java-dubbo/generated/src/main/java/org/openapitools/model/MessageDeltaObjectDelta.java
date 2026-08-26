package org.openapitools.model;

import org.openapitools.model.MessageDeltaObjectDeltaContentInner;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * The delta containing the fields that have changed on the Message.
 */
public class MessageDeltaObjectDelta implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.
   */
  @JsonProperty("role")
  private String role;

  /**
   * The content of the message in array of text and/or images.
   */
  @JsonProperty("content")
  private List<MessageDeltaObjectDeltaContentInner> content = new ArrayList<>();

  /**
   * The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.
   * @return role
   */
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  /**
   * The content of the message in array of text and/or images.
   * @return content
   */
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
    return Objects.equals(this.role, messageDeltaObjectDelta.role) &&
        Objects.equals(this.content, messageDeltaObjectDelta.content);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
