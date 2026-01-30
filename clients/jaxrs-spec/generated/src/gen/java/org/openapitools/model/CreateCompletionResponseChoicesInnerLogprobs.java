package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CreateCompletionResponse_choices_inner_logprobs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateCompletionResponseChoicesInnerLogprobs   {
  private @Valid List<Integer> textOffset = new ArrayList<>();
  private @Valid List<BigDecimal> tokenLogprobs = new ArrayList<>();
  private @Valid List<String> tokens = new ArrayList<>();
  private @Valid List<Map<String, BigDecimal>> topLogprobs = new ArrayList<>();

  public CreateCompletionResponseChoicesInnerLogprobs() {
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

  @JsonProperty("text_offset")
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

  public CreateCompletionResponseChoicesInnerLogprobs removeTextOffsetItem(Integer textOffsetItem) {
    if (textOffsetItem != null && this.textOffset != null) {
      this.textOffset.remove(textOffsetItem);
    }

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
  @Valid public List<@Valid BigDecimal> getTokenLogprobs() {
    return tokenLogprobs;
  }

  @JsonProperty("token_logprobs")
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

  public CreateCompletionResponseChoicesInnerLogprobs removeTokenLogprobsItem(BigDecimal tokenLogprobsItem) {
    if (tokenLogprobsItem != null && this.tokenLogprobs != null) {
      this.tokenLogprobs.remove(tokenLogprobsItem);
    }

    return this;
  }
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

  @JsonProperty("tokens")
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

  public CreateCompletionResponseChoicesInnerLogprobs removeTokensItem(String tokensItem) {
    if (tokensItem != null && this.tokens != null) {
      this.tokens.remove(tokensItem);
    }

    return this;
  }
  /**
   **/
  public CreateCompletionResponseChoicesInnerLogprobs topLogprobs(List<Map<String, BigDecimal>> topLogprobs) {
    this.topLogprobs = topLogprobs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("top_logprobs")
  @Valid public List<@Valid Map<String, BigDecimal>> getTopLogprobs() {
    return topLogprobs;
  }

  @JsonProperty("top_logprobs")
  public void setTopLogprobs(List<Map<String, BigDecimal>> topLogprobs) {
    this.topLogprobs = topLogprobs;
  }

  public CreateCompletionResponseChoicesInnerLogprobs addTopLogprobsItem(Map<String, BigDecimal> topLogprobsItem) {
    if (this.topLogprobs == null) {
      this.topLogprobs = new ArrayList<>();
    }

    this.topLogprobs.add(topLogprobsItem);
    return this;
  }

  public CreateCompletionResponseChoicesInnerLogprobs removeTopLogprobsItem(Map<String, BigDecimal> topLogprobsItem) {
    if (topLogprobsItem != null && this.topLogprobs != null) {
      this.topLogprobs.remove(topLogprobsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

