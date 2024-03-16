package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateCompletionResponseChoicesInnerLogprobs
 */

@JsonTypeName("CreateCompletionResponse_choices_inner_logprobs")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-16T01:17:43.141820780Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateCompletionResponseChoicesInnerLogprobs {

  @Valid
  private List<String> tokens;

  @Valid
  private List<BigDecimal> tokenLogprobs;

  @Valid
  private List<Object> topLogprobs;

  @Valid
  private List<Integer> textOffset;

  public CreateCompletionResponseChoicesInnerLogprobs tokens(List<String> tokens) {
    this.tokens = tokens;
    return this;
  }

  public CreateCompletionResponseChoicesInnerLogprobs addTokensItem(String tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

  /**
   * Get tokens
   * @return tokens
  */
  
  @Schema(name = "tokens", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tokens")
  public List<String> getTokens() {
    return tokens;
  }

  public void setTokens(List<String> tokens) {
    this.tokens = tokens;
  }

  public CreateCompletionResponseChoicesInnerLogprobs tokenLogprobs(List<BigDecimal> tokenLogprobs) {
    this.tokenLogprobs = tokenLogprobs;
    return this;
  }

  public CreateCompletionResponseChoicesInnerLogprobs addTokenLogprobsItem(BigDecimal tokenLogprobsItem) {
    if (this.tokenLogprobs == null) {
      this.tokenLogprobs = new ArrayList<>();
    }
    this.tokenLogprobs.add(tokenLogprobsItem);
    return this;
  }

  /**
   * Get tokenLogprobs
   * @return tokenLogprobs
  */
  @Valid 
  @Schema(name = "token_logprobs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("token_logprobs")
  public List<BigDecimal> getTokenLogprobs() {
    return tokenLogprobs;
  }

  public void setTokenLogprobs(List<BigDecimal> tokenLogprobs) {
    this.tokenLogprobs = tokenLogprobs;
  }

  public CreateCompletionResponseChoicesInnerLogprobs topLogprobs(List<Object> topLogprobs) {
    this.topLogprobs = topLogprobs;
    return this;
  }

  public CreateCompletionResponseChoicesInnerLogprobs addTopLogprobsItem(Object topLogprobsItem) {
    if (this.topLogprobs == null) {
      this.topLogprobs = new ArrayList<>();
    }
    this.topLogprobs.add(topLogprobsItem);
    return this;
  }

  /**
   * Get topLogprobs
   * @return topLogprobs
  */
  
  @Schema(name = "top_logprobs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("top_logprobs")
  public List<Object> getTopLogprobs() {
    return topLogprobs;
  }

  public void setTopLogprobs(List<Object> topLogprobs) {
    this.topLogprobs = topLogprobs;
  }

  public CreateCompletionResponseChoicesInnerLogprobs textOffset(List<Integer> textOffset) {
    this.textOffset = textOffset;
    return this;
  }

  public CreateCompletionResponseChoicesInnerLogprobs addTextOffsetItem(Integer textOffsetItem) {
    if (this.textOffset == null) {
      this.textOffset = new ArrayList<>();
    }
    this.textOffset.add(textOffsetItem);
    return this;
  }

  /**
   * Get textOffset
   * @return textOffset
  */
  
  @Schema(name = "text_offset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

