package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateCompletionResponseChoicesInnerLogprobs  {
  
  @ApiModelProperty(value = "")
  private List<Integer> textOffset = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private List<BigDecimal> tokenLogprobs = new ArrayList<>();

  @ApiModelProperty(value = "")
  private List<String> tokens = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private List<Map<String, BigDecimal>> topLogprobs = new ArrayList<>();
 /**
  * Get textOffset
  * @return textOffset
  */
  @JsonProperty("text_offset")
  public List<Integer> getTextOffset() {
    return textOffset;
  }

  /**
   * Sets the <code>textOffset</code> property.
   */
 public void setTextOffset(List<Integer> textOffset) {
    this.textOffset = textOffset;
  }

  /**
   * Sets the <code>textOffset</code> property.
   */
  public CreateCompletionResponseChoicesInnerLogprobs textOffset(List<Integer> textOffset) {
    this.textOffset = textOffset;
    return this;
  }

  /**
   * Adds a new item to the <code>textOffset</code> list.
   */
  public CreateCompletionResponseChoicesInnerLogprobs addTextOffsetItem(Integer textOffsetItem) {
    this.textOffset.add(textOffsetItem);
    return this;
  }

 /**
  * Get tokenLogprobs
  * @return tokenLogprobs
  */
  @JsonProperty("token_logprobs")
  public List<BigDecimal> getTokenLogprobs() {
    return tokenLogprobs;
  }

  /**
   * Sets the <code>tokenLogprobs</code> property.
   */
 public void setTokenLogprobs(List<BigDecimal> tokenLogprobs) {
    this.tokenLogprobs = tokenLogprobs;
  }

  /**
   * Sets the <code>tokenLogprobs</code> property.
   */
  public CreateCompletionResponseChoicesInnerLogprobs tokenLogprobs(List<BigDecimal> tokenLogprobs) {
    this.tokenLogprobs = tokenLogprobs;
    return this;
  }

  /**
   * Adds a new item to the <code>tokenLogprobs</code> list.
   */
  public CreateCompletionResponseChoicesInnerLogprobs addTokenLogprobsItem(BigDecimal tokenLogprobsItem) {
    this.tokenLogprobs.add(tokenLogprobsItem);
    return this;
  }

 /**
  * Get tokens
  * @return tokens
  */
  @JsonProperty("tokens")
  public List<String> getTokens() {
    return tokens;
  }

  /**
   * Sets the <code>tokens</code> property.
   */
 public void setTokens(List<String> tokens) {
    this.tokens = tokens;
  }

  /**
   * Sets the <code>tokens</code> property.
   */
  public CreateCompletionResponseChoicesInnerLogprobs tokens(List<String> tokens) {
    this.tokens = tokens;
    return this;
  }

  /**
   * Adds a new item to the <code>tokens</code> list.
   */
  public CreateCompletionResponseChoicesInnerLogprobs addTokensItem(String tokensItem) {
    this.tokens.add(tokensItem);
    return this;
  }

 /**
  * Get topLogprobs
  * @return topLogprobs
  */
  @JsonProperty("top_logprobs")
  public List<Map<String, BigDecimal>> getTopLogprobs() {
    return topLogprobs;
  }

  /**
   * Sets the <code>topLogprobs</code> property.
   */
 public void setTopLogprobs(List<Map<String, BigDecimal>> topLogprobs) {
    this.topLogprobs = topLogprobs;
  }

  /**
   * Sets the <code>topLogprobs</code> property.
   */
  public CreateCompletionResponseChoicesInnerLogprobs topLogprobs(List<Map<String, BigDecimal>> topLogprobs) {
    this.topLogprobs = topLogprobs;
    return this;
  }

  /**
   * Adds a new item to the <code>topLogprobs</code> list.
   */
  public CreateCompletionResponseChoicesInnerLogprobs addTopLogprobsItem(Map<String, BigDecimal> topLogprobsItem) {
    this.topLogprobs.add(topLogprobsItem);
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
    return Objects.equals(this.textOffset, createCompletionResponseChoicesInnerLogprobs.textOffset) &&
        Objects.equals(this.tokenLogprobs, createCompletionResponseChoicesInnerLogprobs.tokenLogprobs) &&
        Objects.equals(this.tokens, createCompletionResponseChoicesInnerLogprobs.tokens) &&
        Objects.equals(this.topLogprobs, createCompletionResponseChoicesInnerLogprobs.topLogprobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textOffset, tokenLogprobs, tokens, topLogprobs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompletionResponseChoicesInnerLogprobs {\n");
    
    sb.append("    textOffset: ").append(toIndentedString(textOffset)).append("\n");
    sb.append("    tokenLogprobs: ").append(toIndentedString(tokenLogprobs)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    topLogprobs: ").append(toIndentedString(topLogprobs)).append("\n");
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

