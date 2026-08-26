package org.openapitools.model;

import org.openapitools.model.ChatCompletionRequestSystemMessageContent;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, use &#x60;developer&#x60; messages for this purpose instead. 
 */
public class ChatCompletionRequestSystemMessage implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("content")
  private ChatCompletionRequestSystemMessageContent content;

  /**
   * The role of the messages author, in this case &#x60;system&#x60;.
   */
  @JsonProperty("role")
  private String role;

  /**
   * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
   */
  @JsonProperty("name")
  private String name;

  /**
   * 
   * @return content
   */
  public ChatCompletionRequestSystemMessageContent getContent() {
    return content;
  }

  public void setContent(ChatCompletionRequestSystemMessageContent content) {
    this.content = content;
  }

  /**
   * The role of the messages author, in this case &#x60;system&#x60;.
   * @return role
   */
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  /**
   * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionRequestSystemMessage chatCompletionRequestSystemMessage = (ChatCompletionRequestSystemMessage) o;
    return Objects.equals(this.content, chatCompletionRequestSystemMessage.content) &&
        Objects.equals(this.role, chatCompletionRequestSystemMessage.role) &&
        Objects.equals(this.name, chatCompletionRequestSystemMessage.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, role, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestSystemMessage {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
