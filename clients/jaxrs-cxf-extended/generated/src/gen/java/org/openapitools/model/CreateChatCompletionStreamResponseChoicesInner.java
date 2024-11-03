package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatCompletionStreamResponseDelta;
import org.openapitools.model.CreateChatCompletionResponseChoicesInnerLogprobs;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateChatCompletionStreamResponseChoicesInner  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private ChatCompletionStreamResponseDelta delta;

  @ApiModelProperty(value = "")
  @Valid
  private CreateChatCompletionResponseChoicesInnerLogprobs logprobs;

public enum FinishReasonEnum {

    @JsonProperty("stop") STOP(String.valueOf("stop")),
    @JsonProperty("length") LENGTH(String.valueOf("length")),
    @JsonProperty("tool_calls") TOOL_CALLS(String.valueOf("tool_calls")),
    @JsonProperty("content_filter") CONTENT_FILTER(String.valueOf("content_filter")),
    @JsonProperty("function_call") FUNCTION_CALL(String.valueOf("function_call"));

    private String value;

    FinishReasonEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FinishReasonEnum fromValue(String value) {
        for (FinishReasonEnum b : FinishReasonEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}

 /**
  * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
  */
  @ApiModelProperty(required = true, value = "The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. ")
  private FinishReasonEnum finishReason;

 /**
  * The index of the choice in the list of choices.
  */
  @ApiModelProperty(required = true, value = "The index of the choice in the list of choices.")
  private Integer index;
 /**
  * Get delta
  * @return delta
  */
  @JsonProperty("delta")
  @NotNull
  public ChatCompletionStreamResponseDelta getDelta() {
    return delta;
  }

  /**
   * Sets the <code>delta</code> property.
   */
 public void setDelta(ChatCompletionStreamResponseDelta delta) {
    this.delta = delta;
  }

  /**
   * Sets the <code>delta</code> property.
   */
  public CreateChatCompletionStreamResponseChoicesInner delta(ChatCompletionStreamResponseDelta delta) {
    this.delta = delta;
    return this;
  }

 /**
  * Get logprobs
  * @return logprobs
  */
  @JsonProperty("logprobs")
  public CreateChatCompletionResponseChoicesInnerLogprobs getLogprobs() {
    return logprobs;
  }

  /**
   * Sets the <code>logprobs</code> property.
   */
 public void setLogprobs(CreateChatCompletionResponseChoicesInnerLogprobs logprobs) {
    this.logprobs = logprobs;
  }

  /**
   * Sets the <code>logprobs</code> property.
   */
  public CreateChatCompletionStreamResponseChoicesInner logprobs(CreateChatCompletionResponseChoicesInnerLogprobs logprobs) {
    this.logprobs = logprobs;
    return this;
  }

 /**
  * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, &#x60;tool_calls&#x60; if the model called a tool, or &#x60;function_call&#x60; (deprecated) if the model called a function. 
  * @return finishReason
  */
  @JsonProperty("finish_reason")
  @NotNull
  public String getFinishReason() {
    return finishReason == null ? null : finishReason.value();
  }

  /**
   * Sets the <code>finishReason</code> property.
   */
 public void setFinishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
  }

  /**
   * Sets the <code>finishReason</code> property.
   */
  public CreateChatCompletionStreamResponseChoicesInner finishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
    return this;
  }

 /**
  * The index of the choice in the list of choices.
  * @return index
  */
  @JsonProperty("index")
  @NotNull
  public Integer getIndex() {
    return index;
  }

  /**
   * Sets the <code>index</code> property.
   */
 public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Sets the <code>index</code> property.
   */
  public CreateChatCompletionStreamResponseChoicesInner index(Integer index) {
    this.index = index;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

