package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatCompletionStreamResponseDelta;
import org.openapitools.model.CreateChatCompletionResponseChoicesInnerLogprobs;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CreateChatCompletionStreamResponse_choices_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateChatCompletionStreamResponseChoicesInner   {
  private ChatCompletionStreamResponseDelta delta;
  private CreateChatCompletionResponseChoicesInnerLogprobs logprobs;
  public enum FinishReasonEnum {

    STOP(String.valueOf("stop")), LENGTH(String.valueOf("length")), TOOL_CALLS(String.valueOf("tool_calls")), CONTENT_FILTER(String.valueOf("content_filter")), FUNCTION_CALL(String.valueOf("function_call"));


    private String value;

    FinishReasonEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static FinishReasonEnum fromString(String s) {
        for (FinishReasonEnum b : FinishReasonEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        return null;
    }

    @JsonCreator
    public static FinishReasonEnum fromValue(String value) {
        for (FinishReasonEnum b : FinishReasonEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}

  private FinishReasonEnum finishReason;
  private Integer index;

  public CreateChatCompletionStreamResponseChoicesInner() {
  }

  @JsonCreator
  public CreateChatCompletionStreamResponseChoicesInner(
    @JsonProperty(required = true, value = "delta") ChatCompletionStreamResponseDelta delta,
    @JsonProperty(required = true, value = "finish_reason") FinishReasonEnum finishReason,
    @JsonProperty(required = true, value = "index") Integer index
  ) {
    this.delta = delta;
    this.finishReason = finishReason;
    this.index = index;
  }

  /**
   **/
  public CreateChatCompletionStreamResponseChoicesInner delta(ChatCompletionStreamResponseDelta delta) {
    this.delta = delta;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "delta")
  @NotNull @Valid public ChatCompletionStreamResponseDelta getDelta() {
    return delta;
  }

  @JsonProperty(required = true, value = "delta")
  public void setDelta(ChatCompletionStreamResponseDelta delta) {
    this.delta = delta;
  }

  /**
   **/
  public CreateChatCompletionStreamResponseChoicesInner logprobs(CreateChatCompletionResponseChoicesInnerLogprobs logprobs) {
    this.logprobs = logprobs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("logprobs")
  @Valid public CreateChatCompletionResponseChoicesInnerLogprobs getLogprobs() {
    return logprobs;
  }

  @JsonProperty("logprobs")
  public void setLogprobs(CreateChatCompletionResponseChoicesInnerLogprobs logprobs) {
    this.logprobs = logprobs;
  }

  /**
   * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, &#x60;tool_calls&#x60; if the model called a tool, or &#x60;function_call&#x60; (deprecated) if the model called a function. 
   **/
  public CreateChatCompletionStreamResponseChoicesInner finishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. ")
  @JsonProperty(required = true, value = "finish_reason")
  @NotNull public FinishReasonEnum getFinishReason() {
    return finishReason;
  }

  @JsonProperty(required = true, value = "finish_reason")
  public void setFinishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
  }

  /**
   * The index of the choice in the list of choices.
   **/
  public CreateChatCompletionStreamResponseChoicesInner index(Integer index) {
    this.index = index;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The index of the choice in the list of choices.")
  @JsonProperty(required = true, value = "index")
  @NotNull public Integer getIndex() {
    return index;
  }

  @JsonProperty(required = true, value = "index")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

