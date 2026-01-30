package apimodels;

import apimodels.ChatCompletionRequestUserMessageContent;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Messages sent by an end user, containing prompts or additional context information. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ChatCompletionRequestUserMessage   {
  @JsonProperty("content")
  @NotNull
@Valid

  private ChatCompletionRequestUserMessageContent content;

  /**
   * The role of the messages author, in this case `user`.
   */
  public enum RoleEnum {
    USER("user");

    private final String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("role")
  @NotNull

  private RoleEnum role;

  @JsonProperty("name")
  
  private String name;

  public ChatCompletionRequestUserMessage content(ChatCompletionRequestUserMessageContent content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  public ChatCompletionRequestUserMessageContent getContent() {
    return content;
  }

  public void setContent(ChatCompletionRequestUserMessageContent content) {
    this.content = content;
  }

  public ChatCompletionRequestUserMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * The role of the messages author, in this case `user`.
   * @return role
  **/
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public ChatCompletionRequestUserMessage name(String name) {
    this.name = name;
    return this;
  }

   /**
   * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
   * @return name
  **/
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
    ChatCompletionRequestUserMessage chatCompletionRequestUserMessage = (ChatCompletionRequestUserMessage) o;
    return Objects.equals(content, chatCompletionRequestUserMessage.content) &&
        Objects.equals(role, chatCompletionRequestUserMessage.role) &&
        Objects.equals(name, chatCompletionRequestUserMessage.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, role, name);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestUserMessage {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

