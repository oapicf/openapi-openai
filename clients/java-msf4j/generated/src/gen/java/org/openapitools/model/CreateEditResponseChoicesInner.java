package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateCompletionResponseChoicesInnerLogprobs;

/**
 * CreateEditResponseChoicesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-16T01:12:44.741883350Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateEditResponseChoicesInner   {
  @JsonProperty("text")
  private String text;

  @JsonProperty("index")
  private Integer index;

  @JsonProperty("logprobs")
  private CreateCompletionResponseChoicesInnerLogprobs logprobs;

  /**
   * Gets or Sets finishReason
   */
  public enum FinishReasonEnum {
    STOP("stop"),
    
    LENGTH("length");

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

  public CreateEditResponseChoicesInner text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public CreateEditResponseChoicesInner index(Integer index) {
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

  public CreateEditResponseChoicesInner logprobs(CreateCompletionResponseChoicesInnerLogprobs logprobs) {
    this.logprobs = logprobs;
    return this;
  }

   /**
   * Get logprobs
   * @return logprobs
  **/
  @ApiModelProperty(value = "")
  public CreateCompletionResponseChoicesInnerLogprobs getLogprobs() {
    return logprobs;
  }

  public void setLogprobs(CreateCompletionResponseChoicesInnerLogprobs logprobs) {
    this.logprobs = logprobs;
  }

  public CreateEditResponseChoicesInner finishReason(FinishReasonEnum finishReason) {
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
    CreateEditResponseChoicesInner createEditResponseChoicesInner = (CreateEditResponseChoicesInner) o;
    return Objects.equals(this.text, createEditResponseChoicesInner.text) &&
        Objects.equals(this.index, createEditResponseChoicesInner.index) &&
        Objects.equals(this.logprobs, createEditResponseChoicesInner.logprobs) &&
        Objects.equals(this.finishReason, createEditResponseChoicesInner.finishReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, index, logprobs, finishReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEditResponseChoicesInner {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    logprobs: ").append(toIndentedString(logprobs)).append("\n");
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

