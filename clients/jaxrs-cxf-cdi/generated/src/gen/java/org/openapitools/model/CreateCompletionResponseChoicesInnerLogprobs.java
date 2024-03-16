package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class CreateCompletionResponseChoicesInnerLogprobs   {
  
  private List<String> tokens;

  private List<BigDecimal> tokenLogprobs;

  private List<Object> topLogprobs;

  private List<Integer> textOffset;

  /**
   **/
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

  public CreateCompletionResponseChoicesInnerLogprobs addTokensItem(String tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<>();
    }
    this.tokens.add(tokensItem);
    return this;
  }


  /**
   **/
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

  public CreateCompletionResponseChoicesInnerLogprobs addTokenLogprobsItem(BigDecimal tokenLogprobsItem) {
    if (this.tokenLogprobs == null) {
      this.tokenLogprobs = new ArrayList<>();
    }
    this.tokenLogprobs.add(tokenLogprobsItem);
    return this;
  }


  /**
   **/
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

  public CreateCompletionResponseChoicesInnerLogprobs addTopLogprobsItem(Object topLogprobsItem) {
    if (this.topLogprobs == null) {
      this.topLogprobs = new ArrayList<>();
    }
    this.topLogprobs.add(topLogprobsItem);
    return this;
  }


  /**
   **/
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

  public CreateCompletionResponseChoicesInnerLogprobs addTextOffsetItem(Integer textOffsetItem) {
    if (this.textOffset == null) {
      this.textOffset = new ArrayList<>();
    }
    this.textOffset.add(textOffsetItem);
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
    CreateCompletionResponseChoicesInnerLogprobs createCompletionResponseChoicesInnerLogprobs = (CreateCompletionResponseChoicesInnerLogprobs) o;
    return Objects.equals(this.tokens, createCompletionResponseChoicesInnerLogprobs.tokens) &&
        Objects.equals(this.tokenLogprobs, createCompletionResponseChoicesInnerLogprobs.tokenLogprobs) &&
        Objects.equals(this.topLogprobs, createCompletionResponseChoicesInnerLogprobs.topLogprobs) &&
        Objects.equals(this.textOffset, createCompletionResponseChoicesInnerLogprobs.textOffset);
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

