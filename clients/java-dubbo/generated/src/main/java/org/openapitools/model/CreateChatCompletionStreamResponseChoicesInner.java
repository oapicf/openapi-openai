package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatCompletionStreamResponseDelta;
import org.openapitools.model.CreateChatCompletionResponseChoicesInnerLogprobs;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CreateChatCompletionStreamResponseChoicesInner implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("delta")
  private ChatCompletionStreamResponseDelta delta;

  @JsonProperty("logprobs")
  private CreateChatCompletionResponseChoicesInnerLogprobs logprobs;

  /**
   * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, &#x60;tool_calls&#x60; if the model called a tool, or &#x60;function_call&#x60; (deprecated) if the model called a function. 
   */
  @JsonProperty("finish_reason")
  private String finishReason;

  /**
   * The index of the choice in the list of choices.
   */
  @JsonProperty("index")
  private Integer index;

  /**
   * 
   * @return delta
   */
  public ChatCompletionStreamResponseDelta getDelta() {
    return delta;
  }

  public void setDelta(ChatCompletionStreamResponseDelta delta) {
    this.delta = delta;
  }

  /**
   * 
   * @return logprobs
   */
  public CreateChatCompletionResponseChoicesInnerLogprobs getLogprobs() {
    return logprobs;
  }

  public void setLogprobs(CreateChatCompletionResponseChoicesInnerLogprobs logprobs) {
    this.logprobs = logprobs;
  }

  /**
   * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, &#x60;tool_calls&#x60; if the model called a tool, or &#x60;function_call&#x60; (deprecated) if the model called a function. 
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionStreamResponseChoicesInner createChatCompletionStreamResponseChoicesInner = (CreateChatCompletionStreamResponseChoicesInner) o;
    return Objects.equals(this.delta, createChatCompletionStreamResponseChoicesInner.delta) &&
        Objects.equals(this.logprobs, createChatCompletionStreamResponseChoicesInner.logprobs) &&
        Objects.equals(this.finishReason, createChatCompletionStreamResponseChoicesInner.finishReason) &&
        Objects.equals(this.index, createChatCompletionStreamResponseChoicesInner.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delta, logprobs, finishReason, index);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionStreamResponseChoicesInner {\n");
    
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
    sb.append("    logprobs: ").append(toIndentedString(logprobs)).append("\n");
    sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
