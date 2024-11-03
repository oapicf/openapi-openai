package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ChatCompletionRequestFunctionMessage  {
  
public enum RoleEnum {

FUNCTION(String.valueOf("function"));


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

  @ApiModelProperty(required = true, value = "The role of the messages author, in this case `function`.")
 /**
   * The role of the messages author, in this case `function`.
  **/
  private RoleEnum role;

  @ApiModelProperty(required = true, value = "The contents of the function message.")
 /**
   * The contents of the function message.
  **/
  private String content;

  @ApiModelProperty(required = true, value = "The name of the function to call.")
 /**
   * The name of the function to call.
  **/
  private String name;
 /**
   * The role of the messages author, in this case &#x60;function&#x60;.
   * @return role
  **/
  @JsonProperty("role")
  public String getRole() {
    if (role == null) {
      return null;
    }
    return role.value();
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public ChatCompletionRequestFunctionMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

 /**
   * The contents of the function message.
   * @return content
  **/
  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public ChatCompletionRequestFunctionMessage content(String content) {
    this.content = content;
    return this;
  }

 /**
   * The name of the function to call.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChatCompletionRequestFunctionMessage name(String name) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

