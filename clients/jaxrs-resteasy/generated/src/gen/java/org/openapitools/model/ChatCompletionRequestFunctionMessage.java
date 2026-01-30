package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ChatCompletionRequestFunctionMessage   {
  

  /**
   * The role of the messages author, in this case &#x60;function&#x60;.
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
  }

  private RoleEnum role;
  private String content;
  private String name;

  /**
   * The role of the messages author, in this case &#x60;function&#x60;.
   **/
  
  @ApiModelProperty(required = true, value = "The role of the messages author, in this case `function`.")
  @JsonProperty("role")
  @NotNull
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   * The contents of the function message.
   **/
  
  @ApiModelProperty(required = true, value = "The contents of the function message.")
  @JsonProperty("content")
  @NotNull
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  /**
   * The name of the function to call.
   **/
  
  @ApiModelProperty(required = true, value = "The name of the function to call.")
  @JsonProperty("name")
  @NotNull
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

