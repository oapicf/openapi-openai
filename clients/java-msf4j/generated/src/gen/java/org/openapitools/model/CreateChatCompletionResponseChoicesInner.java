package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionResponseMessage;

/**
 * CreateChatCompletionResponseChoicesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-16T01:12:44.741883350Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateChatCompletionResponseChoicesInner   {
  @JsonProperty("index")
  private Integer index;

  @JsonProperty("message")
  private ChatCompletionResponseMessage message;

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

  public CreateChatCompletionResponseChoicesInner index(Integer index) {
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

  public CreateChatCompletionResponseChoicesInner message(ChatCompletionResponseMessage message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public ChatCompletionResponseMessage getMessage() {
    return message;
  }

  public void setMessage(ChatCompletionResponseMessage message) {
    this.message = message;
  }

  public CreateChatCompletionResponseChoicesInner finishReason(FinishReasonEnum finishReason) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

