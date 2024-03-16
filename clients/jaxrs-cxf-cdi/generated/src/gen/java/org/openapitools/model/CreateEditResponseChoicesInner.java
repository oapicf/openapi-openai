package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateCompletionResponseChoicesInnerLogprobs;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class CreateEditResponseChoicesInner   {
  
  private String text;

  private Integer index;

  private CreateCompletionResponseChoicesInnerLogprobs logprobs;


public enum FinishReasonEnum {

    @JsonProperty("stop") STOP(String.valueOf("stop")), @JsonProperty("length") LENGTH(String.valueOf("length"));


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
  public CreateEditResponseChoicesInner text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   **/
  public CreateEditResponseChoicesInner index(Integer index) {
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
  public CreateEditResponseChoicesInner logprobs(CreateCompletionResponseChoicesInnerLogprobs logprobs) {
    this.logprobs = logprobs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("logprobs")
  public CreateCompletionResponseChoicesInnerLogprobs getLogprobs() {
    return logprobs;
  }
  public void setLogprobs(CreateCompletionResponseChoicesInnerLogprobs logprobs) {
    this.logprobs = logprobs;
  }


  /**
   **/
  public CreateEditResponseChoicesInner finishReason(FinishReasonEnum finishReason) {
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

