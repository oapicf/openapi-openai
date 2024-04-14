package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.ChatCompletionResponseMessage;
import org.openapitools.vertxweb.server.model.CreateChatCompletionResponseChoicesInnerLogprobs;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateChatCompletionResponseChoicesInner   {
  


  public enum FinishReasonEnum {
    STOP("stop"),
    LENGTH("length"),
    TOOL_CALLS("tool_calls"),
    CONTENT_FILTER("content_filter"),
    FUNCTION_CALL("function_call");

    private String value;

    FinishReasonEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private FinishReasonEnum finishReason;
  private Integer index;
  private ChatCompletionResponseMessage message;
  private CreateChatCompletionResponseChoicesInnerLogprobs logprobs;

  public CreateChatCompletionResponseChoicesInner () {

  }

  public CreateChatCompletionResponseChoicesInner (FinishReasonEnum finishReason, Integer index, ChatCompletionResponseMessage message, CreateChatCompletionResponseChoicesInnerLogprobs logprobs) {
    this.finishReason = finishReason;
    this.index = index;
    this.message = message;
    this.logprobs = logprobs;
  }

    
  @JsonProperty("finish_reason")
  public FinishReasonEnum getFinishReason() {
    return finishReason;
  }
  public void setFinishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
  }

    
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

    
  @JsonProperty("message")
  public ChatCompletionResponseMessage getMessage() {
    return message;
  }
  public void setMessage(ChatCompletionResponseMessage message) {
    this.message = message;
  }

    
  @JsonProperty("logprobs")
  public CreateChatCompletionResponseChoicesInnerLogprobs getLogprobs() {
    return logprobs;
  }
  public void setLogprobs(CreateChatCompletionResponseChoicesInnerLogprobs logprobs) {
    this.logprobs = logprobs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionResponseChoicesInner createChatCompletionResponseChoicesInner = (CreateChatCompletionResponseChoicesInner) o;
    return Objects.equals(finishReason, createChatCompletionResponseChoicesInner.finishReason) &&
        Objects.equals(index, createChatCompletionResponseChoicesInner.index) &&
        Objects.equals(message, createChatCompletionResponseChoicesInner.message) &&
        Objects.equals(logprobs, createChatCompletionResponseChoicesInner.logprobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finishReason, index, message, logprobs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionResponseChoicesInner {\n");
    
    sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    logprobs: ").append(toIndentedString(logprobs)).append("\n");
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
