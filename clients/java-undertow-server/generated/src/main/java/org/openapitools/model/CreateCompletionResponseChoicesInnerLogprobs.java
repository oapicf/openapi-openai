/*
 * OpenAI API
 *
 * APIs for sampling from and fine-tuning language models
 *
 * OpenAPI document version: 2.0.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-16T01:12:58.923191288Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateCompletionResponseChoicesInnerLogprobs   {
  
  private List<String> tokens;
  private List<BigDecimal> tokenLogprobs;
  private List<Object> topLogprobs;
  private List<Integer> textOffset;

  /**
   */
  public CreateCompletionResponseChoicesInnerLogprobs tokens(List<String> tokens) {
    this.tokens = tokens;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tokens")
  public List<String> getTokens() {
    return tokens;
  }
  public void setTokens(List<String> tokens) {
    this.tokens = tokens;
  }

  /**
   */
  public CreateCompletionResponseChoicesInnerLogprobs tokenLogprobs(List<BigDecimal> tokenLogprobs) {
    this.tokenLogprobs = tokenLogprobs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("token_logprobs")
  public List<BigDecimal> getTokenLogprobs() {
    return tokenLogprobs;
  }
  public void setTokenLogprobs(List<BigDecimal> tokenLogprobs) {
    this.tokenLogprobs = tokenLogprobs;
  }

  /**
   */
  public CreateCompletionResponseChoicesInnerLogprobs topLogprobs(List<Object> topLogprobs) {
    this.topLogprobs = topLogprobs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("top_logprobs")
  public List<Object> getTopLogprobs() {
    return topLogprobs;
  }
  public void setTopLogprobs(List<Object> topLogprobs) {
    this.topLogprobs = topLogprobs;
  }

  /**
   */
  public CreateCompletionResponseChoicesInnerLogprobs textOffset(List<Integer> textOffset) {
    this.textOffset = textOffset;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("text_offset")
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
    return Objects.equals(tokens, createCompletionResponseChoicesInnerLogprobs.tokens) &&
        Objects.equals(tokenLogprobs, createCompletionResponseChoicesInnerLogprobs.tokenLogprobs) &&
        Objects.equals(topLogprobs, createCompletionResponseChoicesInnerLogprobs.topLogprobs) &&
        Objects.equals(textOffset, createCompletionResponseChoicesInnerLogprobs.textOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokens, tokenLogprobs, topLogprobs, textOffset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompletionResponseChoicesInnerLogprobs {\n");
    
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    tokenLogprobs: ").append(toIndentedString(tokenLogprobs)).append("\n");
    sb.append("    topLogprobs: ").append(toIndentedString(topLogprobs)).append("\n");
    sb.append("    textOffset: ").append(toIndentedString(textOffset)).append("\n");
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

