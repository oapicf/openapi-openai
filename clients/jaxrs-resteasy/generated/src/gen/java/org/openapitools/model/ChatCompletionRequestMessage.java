package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionRequestMessageFunctionCall;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-16T01:13:37.006745963Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ChatCompletionRequestMessage   {
  

  /**
   * The role of the messages author. One of &#x60;system&#x60;, &#x60;user&#x60;, &#x60;assistant&#x60;, or &#x60;function&#x60;.
   */
  public enum RoleEnum {
    SYSTEM("system"),

        USER("user"),

        ASSISTANT("assistant"),

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
  private ChatCompletionRequestMessageFunctionCall functionCall;

  /**
   * The role of the messages author. One of &#x60;system&#x60;, &#x60;user&#x60;, &#x60;assistant&#x60;, or &#x60;function&#x60;.
   **/
  
  @ApiModelProperty(required = true, value = "The role of the messages author. One of `system`, `user`, `assistant`, or `function`.")
  @JsonProperty("role")
  @NotNull
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   * The contents of the message. &#x60;content&#x60; is required for all messages except assistant messages with function calls.
   **/
  
  @ApiModelProperty(value = "The contents of the message. `content` is required for all messages except assistant messages with function calls.")
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  /**
   * The name of the author of this message. &#x60;name&#x60; is required if role is &#x60;function&#x60;, and it should be the name of the function whose response is in the &#x60;content&#x60;. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.
   **/
  
  @ApiModelProperty(value = "The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("function_call")
  @Valid
  public ChatCompletionRequestMessageFunctionCall getFunctionCall() {
    return functionCall;
  }
  public void setFunctionCall(ChatCompletionRequestMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionRequestMessage chatCompletionRequestMessage = (ChatCompletionRequestMessage) o;
    return Objects.equals(this.role, chatCompletionRequestMessage.role) &&
        Objects.equals(this.content, chatCompletionRequestMessage.content) &&
        Objects.equals(this.name, chatCompletionRequestMessage.name) &&
        Objects.equals(this.functionCall, chatCompletionRequestMessage.functionCall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, content, name, functionCall);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestMessage {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    functionCall: ").append(toIndentedString(functionCall)).append("\n");
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

