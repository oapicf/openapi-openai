package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import java.util.List;
import org.openapitools.vertxweb.server.model.ChatCompletionRequestAssistantMessageContentPart;

/**
 * The contents of the assistant message. Required unless &#x60;tool_calls&#x60; or &#x60;function_call&#x60; is specified. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatCompletionRequestAssistantMessageContent   {
  

  public ChatCompletionRequestAssistantMessageContent () {

  }

  public ChatCompletionRequestAssistantMessageContent () {
  }


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
