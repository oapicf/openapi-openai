package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ChatCompletionResponseMessage;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateChatCompletionFunctionResponseChoicesInner  {
  
public enum FinishReasonEnum {

    @JsonProperty("stop") STOP(String.valueOf("stop")),
    @JsonProperty("length") LENGTH(String.valueOf("length")),
    @JsonProperty("function_call") FUNCTION_CALL(String.valueOf("function_call")),
    @JsonProperty("content_filter") CONTENT_FILTER(String.valueOf("content_filter"));

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
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. 
  */
  @ApiModelProperty(required = true, value = "The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. ")
  private FinishReasonEnum finishReason;

 /**
  * The index of the choice in the list of choices.
  */
  @ApiModelProperty(required = true, value = "The index of the choice in the list of choices.")
  private Integer index;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ChatCompletionResponseMessage message;
 /**
  * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, or &#x60;function_call&#x60; if the model called a function. 
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
  public CreateChatCompletionFunctionResponseChoicesInner finishReason(FinishReasonEnum finishReason) {
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
  public CreateChatCompletionFunctionResponseChoicesInner index(Integer index) {
    this.index = index;
    return this;
  }

 /**
  * Get message
  * @return message
  */
  @JsonProperty("message")
  @NotNull
  public ChatCompletionResponseMessage getMessage() {
    return message;
  }

  /**
   * Sets the <code>message</code> property.
   */
 public void setMessage(ChatCompletionResponseMessage message) {
    this.message = message;
  }

  /**
   * Sets the <code>message</code> property.
   */
  public CreateChatCompletionFunctionResponseChoicesInner message(ChatCompletionResponseMessage message) {
    this.message = message;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

