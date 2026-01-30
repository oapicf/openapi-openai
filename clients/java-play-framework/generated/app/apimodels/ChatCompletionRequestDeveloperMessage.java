package apimodels;

import apimodels.ChatCompletionRequestDeveloperMessageContent;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, &#x60;developer&#x60; messages replace the previous &#x60;system&#x60; messages. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ChatCompletionRequestDeveloperMessage   {
  @JsonProperty("content")
  @NotNull
@Valid

  private ChatCompletionRequestDeveloperMessageContent content;

  /**
   * The role of the messages author, in this case `developer`.
   */
  public enum RoleEnum {
    DEVELOPER("developer");

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

  public ChatCompletionRequestDeveloperMessage content(ChatCompletionRequestDeveloperMessageContent content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  public ChatCompletionRequestDeveloperMessageContent getContent() {
    return content;
  }

  public void setContent(ChatCompletionRequestDeveloperMessageContent content) {
    this.content = content;
  }

  public ChatCompletionRequestDeveloperMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * The role of the messages author, in this case `developer`.
   * @return role
  **/
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public ChatCompletionRequestDeveloperMessage name(String name) {
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
    ChatCompletionRequestDeveloperMessage chatCompletionRequestDeveloperMessage = (ChatCompletionRequestDeveloperMessage) o;
    return Objects.equals(content, chatCompletionRequestDeveloperMessage.content) &&
        Objects.equals(role, chatCompletionRequestDeveloperMessage.role) &&
        Objects.equals(name, chatCompletionRequestDeveloperMessage.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, role, name);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestDeveloperMessage {\n");
    
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

