package org.openapitools.model;

import org.openapitools.model.CreateCompletionResponseChoicesInnerLogprobs;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateCompletionResponseChoicesInner  {
  
public enum FinishReasonEnum {

STOP(String.valueOf("stop")), LENGTH(String.valueOf("length")), CONTENT_FILTER(String.valueOf("content_filter"));


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
  * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
  */
  @ApiModelProperty(required = true, value = "The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. ")

  private FinishReasonEnum finishReason;

  @ApiModelProperty(required = true, value = "")

  private Integer index;

  @ApiModelProperty(required = true, value = "")

  private CreateCompletionResponseChoicesInnerLogprobs logprobs;

  @ApiModelProperty(required = true, value = "")

  private String text;
 /**
   * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, or &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters. 
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

  public CreateCompletionResponseChoicesInner finishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
    return this;
  }

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

  public CreateCompletionResponseChoicesInner index(Integer index) {
    this.index = index;
    return this;
  }

 /**
   * Get logprobs
   * @return logprobs
  **/
  @JsonProperty("logprobs")
  public CreateCompletionResponseChoicesInnerLogprobs getLogprobs() {
    return logprobs;
  }

  public void setLogprobs(CreateCompletionResponseChoicesInnerLogprobs logprobs) {
    this.logprobs = logprobs;
  }

  public CreateCompletionResponseChoicesInner logprobs(CreateCompletionResponseChoicesInnerLogprobs logprobs) {
    this.logprobs = logprobs;
    return this;
  }

 /**
   * Get text
   * @return text
  **/
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public CreateCompletionResponseChoicesInner text(String text) {
    this.text = text;
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
    CreateCompletionResponseChoicesInner createCompletionResponseChoicesInner = (CreateCompletionResponseChoicesInner) o;
    return Objects.equals(this.finishReason, createCompletionResponseChoicesInner.finishReason) &&
        Objects.equals(this.index, createCompletionResponseChoicesInner.index) &&
        Objects.equals(this.logprobs, createCompletionResponseChoicesInner.logprobs) &&
        Objects.equals(this.text, createCompletionResponseChoicesInner.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finishReason, index, logprobs, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompletionResponseChoicesInner {\n");
    
    sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    logprobs: ").append(toIndentedString(logprobs)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

