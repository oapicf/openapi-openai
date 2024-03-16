package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionStreamResponseDelta;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-03-16T01:13:41.666812110Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateChatCompletionStreamResponseChoicesInner   {
  
  private Integer index;
  private ChatCompletionStreamResponseDelta delta;

  /**
   * Gets or Sets finishReason
   */
  public enum FinishReasonEnum {
    STOP("stop"),

        LENGTH("length"),

        FUNCTION_CALL("function_call");
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

  /**
   **/
  
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

