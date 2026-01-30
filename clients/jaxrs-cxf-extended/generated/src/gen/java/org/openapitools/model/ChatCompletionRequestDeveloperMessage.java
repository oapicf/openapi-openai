package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ChatCompletionRequestDeveloperMessageContent;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, `developer` messages replace the previous `system` messages. 
 */
@ApiModel(description="Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, `developer` messages replace the previous `system` messages. ")

public class ChatCompletionRequestDeveloperMessage  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private ChatCompletionRequestDeveloperMessageContent content;

public enum RoleEnum {

    @JsonProperty("developer") DEVELOPER(String.valueOf("developer"));

    private String value;

    RoleEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RoleEnum fromValue(String value) {
        for (RoleEnum b : RoleEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The role of the messages author, in this case `developer`.
  */
  @ApiModelProperty(required = true, value = "The role of the messages author, in this case `developer`.")
  private RoleEnum role;

 /**
  * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
  */
  @ApiModelProperty(value = "An optional name for the participant. Provides the model information to differentiate between participants of the same role.")
  private String name;
 /**
  * Get content
  * @return content
  */
  @JsonProperty("content")
  @NotNull
  public ChatCompletionRequestDeveloperMessageContent getContent() {
    return content;
  }

  /**
   * Sets the <code>content</code> property.
   */
 public void setContent(ChatCompletionRequestDeveloperMessageContent content) {
    this.content = content;
  }

  /**
   * Sets the <code>content</code> property.
   */
  public ChatCompletionRequestDeveloperMessage content(ChatCompletionRequestDeveloperMessageContent content) {
    this.content = content;
    return this;
  }

 /**
  * The role of the messages author, in this case &#x60;developer&#x60;.
  * @return role
  */
  @JsonProperty("role")
  @NotNull
  public String getRole() {
    return role == null ? null : role.value();
  }

  /**
   * Sets the <code>role</code> property.
   */
 public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   * Sets the <code>role</code> property.
   */
  public ChatCompletionRequestDeveloperMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

 /**
  * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public ChatCompletionRequestDeveloperMessage name(String name) {
    this.name = name;
    return this;
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
    return Objects.equals(this.content, chatCompletionRequestDeveloperMessage.content) &&
        Objects.equals(this.role, chatCompletionRequestDeveloperMessage.role) &&
        Objects.equals(this.name, chatCompletionRequestDeveloperMessage.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, role, name);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

