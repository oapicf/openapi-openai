package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ChatCompletionRequestFunctionMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-03T11:07:10.127704480Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ChatCompletionRequestFunctionMessage   {
  /**
   * The role of the messages author, in this case `function`.
   */
  public enum RoleEnum {
    FUNCTION("function");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String text) {
      for (RoleEnum b : RoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("role")
  private RoleEnum role;

  @JsonProperty("content")
  private String content;

  @JsonProperty("name")
  private String name;

  public ChatCompletionRequestFunctionMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * The role of the messages author, in this case `function`.
   * @return role
  **/
  @ApiModelProperty(required = true, value = "The role of the messages author, in this case `function`.")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public ChatCompletionRequestFunctionMessage content(String content) {
    this.content = content;
    return this;
  }

   /**
   * The contents of the function message.
   * @return content
  **/
  @ApiModelProperty(required = true, value = "The contents of the function message.")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public ChatCompletionRequestFunctionMessage name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the function to call.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the function to call.")
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
    ChatCompletionRequestFunctionMessage chatCompletionRequestFunctionMessage = (ChatCompletionRequestFunctionMessage) o;
    return Objects.equals(this.role, chatCompletionRequestFunctionMessage.role) &&
        Objects.equals(this.content, chatCompletionRequestFunctionMessage.content) &&
        Objects.equals(this.name, chatCompletionRequestFunctionMessage.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, content, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestFunctionMessage {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

