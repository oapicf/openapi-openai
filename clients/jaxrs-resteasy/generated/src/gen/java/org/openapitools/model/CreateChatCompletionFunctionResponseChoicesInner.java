package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionResponseMessage;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-04-14T13:41:51.736364282Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateChatCompletionFunctionResponseChoicesInner   {
  

  /**
   * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, or &#x60;function_call&#x60; if the model called a function. 
   */
  public enum FinishReasonEnum {
    STOP("stop"),

        LENGTH("length"),

        FUNCTION_CALL("function_call"),

        CONTENT_FILTER("content_filter");
    private String value;

    FinishReasonEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private FinishReasonEnum finishReason;
  private Integer index;
  private ChatCompletionResponseMessage message;

  /**
   * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, or &#x60;function_call&#x60; if the model called a function. 
   **/
  
  @ApiModelProperty(required = true, value = "The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. ")
  @JsonProperty("finish_reason")
  @NotNull
  public FinishReasonEnum getFinishReason() {
    return finishReason;
  }
  public void setFinishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
  }

  /**
   * The index of the choice in the list of choices.
   **/
  
  @ApiModelProperty(required = true, value = "The index of the choice in the list of choices.")
  @JsonProperty("index")
  @NotNull
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("message")
  @NotNull
  @Valid
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

