package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ChatCompletionRequestUserMessageContent;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ChatCompletionRequestUserMessage  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private ChatCompletionRequestUserMessageContent content;

public enum RoleEnum {

USER(String.valueOf("user"));


    private String value;

    RoleEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
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

  @ApiModelProperty(required = true, value = "The role of the messages author, in this case `user`.")
 /**
   * The role of the messages author, in this case `user`.
  **/
  private RoleEnum role;

  @ApiModelProperty(value = "An optional name for the participant. Provides the model information to differentiate between participants of the same role.")
 /**
   * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
  **/
  private String name;
 /**
   * Get content
   * @return content
  **/
  @JsonProperty("content")
  @NotNull
  public ChatCompletionRequestUserMessageContent getContent() {
    return content;
  }

  public void setContent(ChatCompletionRequestUserMessageContent content) {
    this.content = content;
  }

  public ChatCompletionRequestUserMessage content(ChatCompletionRequestUserMessageContent content) {
    this.content = content;
    return this;
  }

 /**
   * The role of the messages author, in this case &#x60;user&#x60;.
   * @return role
  **/
  @JsonProperty("role")
  @NotNull
  public String getRole() {
    if (role == null) {
      return null;
    }
    return role.value();
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public ChatCompletionRequestUserMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

 /**
   * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChatCompletionRequestUserMessage name(String name) {
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
    ChatCompletionRequestUserMessage chatCompletionRequestUserMessage = (ChatCompletionRequestUserMessage) o;
    return Objects.equals(this.content, chatCompletionRequestUserMessage.content) &&
        Objects.equals(this.role, chatCompletionRequestUserMessage.role) &&
        Objects.equals(this.name, chatCompletionRequestUserMessage.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, role, name);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

