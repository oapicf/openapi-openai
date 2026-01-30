package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import java.util.List;
import org.openapitools.vertxweb.server.model.ChatCompletionRequestMessageContentPartText;

/**
 * The contents of the developer message.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatCompletionRequestDeveloperMessageContent   {
  

  public ChatCompletionRequestDeveloperMessageContent () {

  }

  public ChatCompletionRequestDeveloperMessageContent () {
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionRequestDeveloperMessageContent chatCompletionRequestDeveloperMessageContent = (ChatCompletionRequestDeveloperMessageContent) o;return true;
  }

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestDeveloperMessageContent {\n");
    
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
