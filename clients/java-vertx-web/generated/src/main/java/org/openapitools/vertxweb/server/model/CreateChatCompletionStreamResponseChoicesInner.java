package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ChatCompletionStreamResponseDelta;
import org.openapitools.vertxweb.server.model.CreateChatCompletionResponseChoicesInnerLogprobs;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateChatCompletionStreamResponseChoicesInner   {
  
  private ChatCompletionStreamResponseDelta delta;
  private CreateChatCompletionResponseChoicesInnerLogprobs logprobs;


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

  public CreateChatCompletionStreamResponseChoicesInner () {

  }

  public CreateChatCompletionStreamResponseChoicesInner (ChatCompletionStreamResponseDelta delta, CreateChatCompletionResponseChoicesInnerLogprobs logprobs, FinishReasonEnum finishReason, Integer index) {
    this.delta = delta;
    this.logprobs = logprobs;
    this.finishReason = finishReason;
    this.index = index;
  }

    
  @JsonProperty("delta")
  public ChatCompletionStreamResponseDelta getDelta() {
    return delta;
  }
  public void setDelta(ChatCompletionStreamResponseDelta delta) {
    this.delta = delta;
  }

    
  @JsonProperty("logprobs")
  public CreateChatCompletionResponseChoicesInnerLogprobs getLogprobs() {
    return logprobs;
  }
  public void setLogprobs(CreateChatCompletionResponseChoicesInnerLogprobs logprobs) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionStreamResponseChoicesInner createChatCompletionStreamResponseChoicesInner = (CreateChatCompletionStreamResponseChoicesInner) o;
    return Objects.equals(delta, createChatCompletionStreamResponseChoicesInner.delta) &&
        Objects.equals(logprobs, createChatCompletionStreamResponseChoicesInner.logprobs) &&
        Objects.equals(finishReason, createChatCompletionStreamResponseChoicesInner.finishReason) &&
        Objects.equals(index, createChatCompletionStreamResponseChoicesInner.index);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
