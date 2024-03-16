package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionStreamResponseDelta;

/**
 * CreateChatCompletionStreamResponseChoicesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-16T01:12:44.741883350Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateChatCompletionStreamResponseChoicesInner   {
  @JsonProperty("index")
  private Integer index;

  @JsonProperty("delta")
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

    @JsonCreator
    public static FinishReasonEnum fromValue(String text) {
      for (FinishReasonEnum b : FinishReasonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("finish_reason")
  private FinishReasonEnum finishReason;

  public CreateChatCompletionStreamResponseChoicesInner index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @ApiModelProperty(value = "")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public CreateChatCompletionStreamResponseChoicesInner delta(ChatCompletionStreamResponseDelta delta) {
    this.delta = delta;
    return this;
  }

   /**
   * Get delta
   * @return delta
  **/
  @ApiModelProperty(value = "")
  public ChatCompletionStreamResponseDelta getDelta() {
    return delta;
  }

  public void setDelta(ChatCompletionStreamResponseDelta delta) {
    this.delta = delta;
  }

  public CreateChatCompletionStreamResponseChoicesInner finishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
    return this;
  }

   /**
   * Get finishReason
   * @return finishReason
  **/
  @ApiModelProperty(value = "")
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

