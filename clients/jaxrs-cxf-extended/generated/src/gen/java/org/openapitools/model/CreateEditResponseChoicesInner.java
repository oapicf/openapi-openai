package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateCompletionResponseChoicesInnerLogprobs;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateEditResponseChoicesInner  {
  
  @ApiModelProperty(value = "")
  private String text;

  @ApiModelProperty(value = "")
  private Integer index;

  @ApiModelProperty(value = "")
  @Valid
  private CreateCompletionResponseChoicesInnerLogprobs logprobs;

public enum FinishReasonEnum {

    @JsonProperty("stop") STOP(String.valueOf("stop")),
    @JsonProperty("length") LENGTH(String.valueOf("length"));

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
  * Get text
  * @return text
  */
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  /**
   * Sets the <code>text</code> property.
   */
 public void setText(String text) {
    this.text = text;
  }

  /**
   * Sets the <code>text</code> property.
   */
  public CreateEditResponseChoicesInner text(String text) {
    this.text = text;
    return this;
  }

 /**
  * Get index
  * @return index
  */
  @JsonProperty("index")
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
  public CreateEditResponseChoicesInner index(Integer index) {
    this.index = index;
    return this;
  }

 /**
  * Get logprobs
  * @return logprobs
  */
  @JsonProperty("logprobs")
  public CreateCompletionResponseChoicesInnerLogprobs getLogprobs() {
    return logprobs;
  }

  /**
   * Sets the <code>logprobs</code> property.
   */
 public void setLogprobs(CreateCompletionResponseChoicesInnerLogprobs logprobs) {
    this.logprobs = logprobs;
  }

  /**
   * Sets the <code>logprobs</code> property.
   */
  public CreateEditResponseChoicesInner logprobs(CreateCompletionResponseChoicesInnerLogprobs logprobs) {
    this.logprobs = logprobs;
    return this;
  }

 /**
  * Get finishReason
  * @return finishReason
  */
  @JsonProperty("finish_reason")
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
  public CreateEditResponseChoicesInner finishReason(FinishReasonEnum finishReason) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

