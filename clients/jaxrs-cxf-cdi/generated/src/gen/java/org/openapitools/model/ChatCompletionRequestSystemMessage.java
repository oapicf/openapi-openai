package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionRequestSystemMessageContent;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, use &#x60;developer&#x60; messages for this purpose instead. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, use `developer` messages for this purpose instead. ")
public class ChatCompletionRequestSystemMessage   {
  
  private ChatCompletionRequestSystemMessageContent content;


public enum RoleEnum {

    @JsonProperty("system") SYSTEM(String.valueOf("system"));


    private String value;

    RoleEnum(String v) {
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

  private RoleEnum role;

  private String name;

  /**
   **/
  public ChatCompletionRequestSystemMessage content(ChatCompletionRequestSystemMessageContent content) {
    this.content = content;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("content")
  @NotNull
  public ChatCompletionRequestSystemMessageContent getContent() {
    return content;
  }
  public void setContent(ChatCompletionRequestSystemMessageContent content) {
    this.content = content;
  }


  /**
   * The role of the messages author, in this case &#x60;system&#x60;.
   **/
  public ChatCompletionRequestSystemMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The role of the messages author, in this case `system`.")
  @JsonProperty("role")
  @NotNull
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }


  /**
   * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
   **/
  public ChatCompletionRequestSystemMessage name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "An optional name for the participant. Provides the model information to differentiate between participants of the same role.")
  @JsonProperty("name")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

