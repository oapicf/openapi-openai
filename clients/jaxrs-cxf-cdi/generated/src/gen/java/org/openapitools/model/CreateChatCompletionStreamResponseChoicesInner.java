package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionStreamResponseDelta;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class CreateChatCompletionStreamResponseChoicesInner   {
  
  private Integer index;

  private ChatCompletionStreamResponseDelta delta;


public enum FinishReasonEnum {

    @JsonProperty("stop") STOP(String.valueOf("stop")), @JsonProperty("length") LENGTH(String.valueOf("length")), @JsonProperty("function_call") FUNCTION_CALL(String.valueOf("function_call"));


    private String value;

    FinishReasonEnum(String v) {
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

  private FinishReasonEnum finishReason;

  /**
   **/
  public CreateChatCompletionStreamResponseChoicesInner index(Integer index) {
    this.index = index;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }


  /**
   **/
  public CreateChatCompletionStreamResponseChoicesInner delta(ChatCompletionStreamResponseDelta delta) {
    this.delta = delta;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("delta")
  public ChatCompletionStreamResponseDelta getDelta() {
    return delta;
  }
  public void setDelta(ChatCompletionStreamResponseDelta delta) {
    this.delta = delta;
  }


  /**
   **/
  public CreateChatCompletionStreamResponseChoicesInner finishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("finish_reason")
  public FinishReasonEnum getFinishReason() {
    return finishReason;
  }
  public void setFinishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
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
    return Objects.equals(this.index, createChatCompletionStreamResponseChoicesInner.index) &&
        Objects.equals(this.delta, createChatCompletionStreamResponseChoicesInner.delta) &&
        Objects.equals(this.finishReason, createChatCompletionStreamResponseChoicesInner.finishReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, delta, finishReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionStreamResponseChoicesInner {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
    sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
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

