/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.CreateCompletionResponseChoicesInnerLogprobs;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateCompletionResponseChoicesInner {
  
  public enum FinishReasonEnum {
     stop,  length,  content_filter, 
  };
  @SerializedName("finish_reason")
  private FinishReasonEnum finishReason = null;
  @SerializedName("index")
  private Integer index = null;
  @SerializedName("logprobs")
  private CreateCompletionResponseChoicesInnerLogprobs logprobs = null;
  @SerializedName("text")
  private String text = null;

  /**
   * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
   **/
  @ApiModelProperty(required = true, value = "The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. ")
  public FinishReasonEnum getFinishReason() {
    return finishReason;
  }
  public void setFinishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CreateCompletionResponseChoicesInnerLogprobs getLogprobs() {
    return logprobs;
  }
  public void setLogprobs(CreateCompletionResponseChoicesInnerLogprobs logprobs) {
    this.logprobs = logprobs;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
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
    return (this.finishReason == null ? createCompletionResponseChoicesInner.finishReason == null : this.finishReason.equals(createCompletionResponseChoicesInner.finishReason)) &&
        (this.index == null ? createCompletionResponseChoicesInner.index == null : this.index.equals(createCompletionResponseChoicesInner.index)) &&
        (this.logprobs == null ? createCompletionResponseChoicesInner.logprobs == null : this.logprobs.equals(createCompletionResponseChoicesInner.logprobs)) &&
        (this.text == null ? createCompletionResponseChoicesInner.text == null : this.text.equals(createCompletionResponseChoicesInner.text));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.finishReason == null ? 0: this.finishReason.hashCode());
    result = 31 * result + (this.index == null ? 0: this.index.hashCode());
    result = 31 * result + (this.logprobs == null ? 0: this.logprobs.hashCode());
    result = 31 * result + (this.text == null ? 0: this.text.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompletionResponseChoicesInner {\n");
    
    sb.append("  finishReason: ").append(finishReason).append("\n");
    sb.append("  index: ").append(index).append("\n");
    sb.append("  logprobs: ").append(logprobs).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}