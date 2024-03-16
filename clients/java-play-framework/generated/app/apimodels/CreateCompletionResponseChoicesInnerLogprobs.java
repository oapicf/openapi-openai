package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateCompletionResponseChoicesInnerLogprobs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-16T01:12:54.315235707Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateCompletionResponseChoicesInnerLogprobs   {
  @JsonProperty("tokens")
  
  private List<String> tokens = null;

  @JsonProperty("token_logprobs")
  @Valid

  private List<BigDecimal> tokenLogprobs = null;

  @JsonProperty("top_logprobs")
  
  private List<Object> topLogprobs = null;

  @JsonProperty("text_offset")
  
  private List<Integer> textOffset = null;

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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

