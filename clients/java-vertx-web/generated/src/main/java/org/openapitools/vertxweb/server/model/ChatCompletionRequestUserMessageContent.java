package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import java.util.List;
import org.openapitools.vertxweb.server.model.ChatCompletionRequestUserMessageContentPart;

/**
 * The contents of the user message. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatCompletionRequestUserMessageContent   {
  

  public ChatCompletionRequestUserMessageContent () {

  }

  public ChatCompletionRequestUserMessageContent () {
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionRequestUserMessageContent chatCompletionRequestUserMessageContent = (ChatCompletionRequestUserMessageContent) o;return true;
  }

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestUserMessageContent {\n");
    
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
