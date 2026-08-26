package org.openapitools.model;

import org.openapitools.model.ChatCompletionTokenLogprob;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Log probability information for the choice.
 */
public class CreateChatCompletionResponseChoicesInnerLogprobs implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * A list of message content tokens with log probability information.
   */
  @JsonProperty("content")
  private List<ChatCompletionTokenLogprob> content;

  /**
   * A list of message refusal tokens with log probability information.
   */
  @JsonProperty("refusal")
  private List<ChatCompletionTokenLogprob> refusal;

  /**
   * A list of message content tokens with log probability information.
   * @return content
   */
  public List<ChatCompletionTokenLogprob> getContent() {
    return content;
  }

  public void setContent(List<ChatCompletionTokenLogprob> content) {
    this.content = content;
  }

  /**
   * A list of message refusal tokens with log probability information.
   * @return refusal
   */
  public List<ChatCompletionTokenLogprob> getRefusal() {
    return refusal;
  }

  public void setRefusal(List<ChatCompletionTokenLogprob> refusal) {
    this.refusal = refusal;
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
    return Objects.equals(this.content, createChatCompletionResponseChoicesInnerLogprobs.content) &&
        Objects.equals(this.refusal, createChatCompletionResponseChoicesInnerLogprobs.refusal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, refusal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionResponseChoicesInnerLogprobs {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    refusal: ").append(toIndentedString(refusal)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
