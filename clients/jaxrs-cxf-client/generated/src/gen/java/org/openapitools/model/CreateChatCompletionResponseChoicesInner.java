package org.openapitools.model;

import org.openapitools.model.ChatCompletionResponseMessage;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateChatCompletionResponseChoicesInner  {
  
  @ApiModelProperty(value = "")
  private Integer index;

  @ApiModelProperty(value = "")
  private ChatCompletionResponseMessage message;

public enum FinishReasonEnum {

STOP(String.valueOf("stop")), LENGTH(String.valueOf("length")), FUNCTION_CALL(String.valueOf("function_call"));


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

  @ApiModelProperty(value = "")
  private FinishReasonEnum finishReason;
 /**
   * Get index
   * @return index
  **/
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public CreateChatCompletionResponseChoicesInner index(Integer index) {
    this.index = index;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public ChatCompletionResponseMessage getMessage() {
    return message;
  }

  public void setMessage(ChatCompletionResponseMessage message) {
    this.message = message;
  }

  public CreateChatCompletionResponseChoicesInner message(ChatCompletionResponseMessage message) {
    this.message = message;
    return this;
  }

 /**
   * Get finishReason
   * @return finishReason
  **/
  @JsonProperty("finish_reason")
  public String getFinishReason() {
    if (finishReason == null) {
      return null;
    }
    return finishReason.value();
  }

  public void setFinishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
  }

  public CreateChatCompletionResponseChoicesInner finishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
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
    CreateChatCompletionResponseChoicesInner createChatCompletionResponseChoicesInner = (CreateChatCompletionResponseChoicesInner) o;
    return Objects.equals(this.index, createChatCompletionResponseChoicesInner.index) &&
        Objects.equals(this.message, createChatCompletionResponseChoicesInner.message) &&
        Objects.equals(this.finishReason, createChatCompletionResponseChoicesInner.finishReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, message, finishReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionResponseChoicesInner {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
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

