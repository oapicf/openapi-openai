package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import java.util.List;
import org.openapitools.model.ChatCompletionRequestAssistantMessageContentPart;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The contents of the assistant message. Required unless &#x60;tool_calls&#x60; or &#x60;function_call&#x60; is specified. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified. ")
public class ChatCompletionRequestAssistantMessageContent   {
  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionRequestAssistantMessageContent chatCompletionRequestAssistantMessageContent = (ChatCompletionRequestAssistantMessageContent) o;return true;
  }

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestAssistantMessageContent {\n");
    
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

