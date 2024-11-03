package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ChatCompletionTokenLogprob;

/**
 * Log probability information for the choice.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateChatCompletionResponseChoicesInnerLogprobs   {
  
  private List<ChatCompletionTokenLogprob> content;

  public CreateChatCompletionResponseChoicesInnerLogprobs () {

  }

  public CreateChatCompletionResponseChoicesInnerLogprobs (List<ChatCompletionTokenLogprob> content) {
    this.content = content;
  }

    
  @JsonProperty("content")
  public List<ChatCompletionTokenLogprob> getContent() {
    return content;
  }
  public void setContent(List<ChatCompletionTokenLogprob> content) {
    this.content = content;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionResponseChoicesInnerLogprobs createChatCompletionResponseChoicesInnerLogprobs = (CreateChatCompletionResponseChoicesInnerLogprobs) o;
    return Objects.equals(content, createChatCompletionResponseChoicesInnerLogprobs.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionResponseChoicesInnerLogprobs {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
