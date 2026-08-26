package org.openapitools.model;

import org.openapitools.model.ChatCompletionResponseMessage;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CreateChatCompletionFunctionResponseChoicesInner implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, or &#x60;function_call&#x60; if the model called a function. 
   */
  @JsonProperty("finish_reason")
  private String finishReason;

  /**
   * The index of the choice in the list of choices.
   */
  @JsonProperty("index")
  private Integer index;

  @JsonProperty("message")
  private ChatCompletionResponseMessage message;

  /**
   * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, or &#x60;function_call&#x60; if the model called a function. 
   * @return finishReason
   */
  public String getFinishReason() {
    return finishReason;
  }

  public void setFinishReason(String finishReason) {
    this.finishReason = finishReason;
  }

  /**
   * The index of the choice in the list of choices.
   * @return index
   */
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * 
   * @return message
   */
  public ChatCompletionResponseMessage getMessage() {
    return message;
  }

  public void setMessage(ChatCompletionResponseMessage message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionFunctionResponseChoicesInner createChatCompletionFunctionResponseChoicesInner = (CreateChatCompletionFunctionResponseChoicesInner) o;
    return Objects.equals(this.finishReason, createChatCompletionFunctionResponseChoicesInner.finishReason) &&
        Objects.equals(this.index, createChatCompletionFunctionResponseChoicesInner.index) &&
        Objects.equals(this.message, createChatCompletionFunctionResponseChoicesInner.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finishReason, index, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionFunctionResponseChoicesInner {\n");
    
    sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
