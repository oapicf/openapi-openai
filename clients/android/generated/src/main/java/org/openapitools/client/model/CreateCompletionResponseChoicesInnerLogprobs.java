/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.math.BigDecimal;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateCompletionResponseChoicesInnerLogprobs {
  
  @SerializedName("tokens")
  private List<String> tokens = null;
  @SerializedName("token_logprobs")
  private List<BigDecimal> tokenLogprobs = null;
  @SerializedName("top_logprobs")
  private List<Object> topLogprobs = null;
  @SerializedName("text_offset")
  private List<Integer> textOffset = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getTokens() {
    return tokens;
  }
  public void setTokens(List<String> tokens) {
    this.tokens = tokens;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<BigDecimal> getTokenLogprobs() {
    return tokenLogprobs;
  }
  public void setTokenLogprobs(List<BigDecimal> tokenLogprobs) {
    this.tokenLogprobs = tokenLogprobs;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Object> getTopLogprobs() {
    return topLogprobs;
  }
  public void setTopLogprobs(List<Object> topLogprobs) {
    this.topLogprobs = topLogprobs;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Integer> getTextOffset() {
    return textOffset;
  }
  public void setTextOffset(List<Integer> textOffset) {
    this.textOffset = textOffset;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCompletionResponseChoicesInnerLogprobs createCompletionResponseChoicesInnerLogprobs = (CreateCompletionResponseChoicesInnerLogprobs) o;
    return (this.tokens == null ? createCompletionResponseChoicesInnerLogprobs.tokens == null : this.tokens.equals(createCompletionResponseChoicesInnerLogprobs.tokens)) &&
        (this.tokenLogprobs == null ? createCompletionResponseChoicesInnerLogprobs.tokenLogprobs == null : this.tokenLogprobs.equals(createCompletionResponseChoicesInnerLogprobs.tokenLogprobs)) &&
        (this.topLogprobs == null ? createCompletionResponseChoicesInnerLogprobs.topLogprobs == null : this.topLogprobs.equals(createCompletionResponseChoicesInnerLogprobs.topLogprobs)) &&
        (this.textOffset == null ? createCompletionResponseChoicesInnerLogprobs.textOffset == null : this.textOffset.equals(createCompletionResponseChoicesInnerLogprobs.textOffset));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.tokens == null ? 0: this.tokens.hashCode());
    result = 31 * result + (this.tokenLogprobs == null ? 0: this.tokenLogprobs.hashCode());
    result = 31 * result + (this.topLogprobs == null ? 0: this.topLogprobs.hashCode());
    result = 31 * result + (this.textOffset == null ? 0: this.textOffset.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompletionResponseChoicesInnerLogprobs {\n");
    
    sb.append("  tokens: ").append(tokens).append("\n");
    sb.append("  tokenLogprobs: ").append(tokenLogprobs).append("\n");
    sb.append("  topLogprobs: ").append(topLogprobs).append("\n");
    sb.append("  textOffset: ").append(textOffset).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}