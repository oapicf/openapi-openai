package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChatCompletionTokenLogprobTopLogprobsInner;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ChatCompletionTokenLogprob
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T10:48:36.973220935Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ChatCompletionTokenLogprob {

  private String token;

  private BigDecimal logprob;

  @Valid
  private JsonNullable<List<Integer>> bytes = JsonNullable.<List<Integer>>undefined();

  @Valid
  private List<@Valid ChatCompletionTokenLogprobTopLogprobsInner> topLogprobs = new ArrayList<>();

  public ChatCompletionTokenLogprob() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ChatCompletionTokenLogprob(String token, BigDecimal logprob, List<Integer> bytes, List<@Valid ChatCompletionTokenLogprobTopLogprobsInner> topLogprobs) {
    this.token = token;
    this.logprob = logprob;
    this.bytes = JsonNullable.of(bytes);
    this.topLogprobs = topLogprobs;
  }

  public ChatCompletionTokenLogprob token(String token) {
    this.token = token;
    return this;
  }

  /**
   * The token.
   * @return token
   */
  @NotNull 
  @Schema(name = "token", description = "The token.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public ChatCompletionTokenLogprob logprob(BigDecimal logprob) {
    this.logprob = logprob;
    return this;
  }

  /**
   * The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
   * @return logprob
   */
  @NotNull @Valid 
  @Schema(name = "logprob", description = "The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("logprob")
  public BigDecimal getLogprob() {
    return logprob;
  }

  public void setLogprob(BigDecimal logprob) {
    this.logprob = logprob;
  }

  public ChatCompletionTokenLogprob bytes(List<Integer> bytes) {
    this.bytes = JsonNullable.of(bytes);
    return this;
  }

  public ChatCompletionTokenLogprob addBytesItem(Integer bytesItem) {
    if (this.bytes == null || !this.bytes.isPresent()) {
      this.bytes = JsonNullable.of(new ArrayList<>());
    }
    this.bytes.get().add(bytesItem);
    return this;
  }

  /**
   * A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
   * @return bytes
   */
  @NotNull 
  @Schema(name = "bytes", description = "A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bytes")
  public JsonNullable<List<Integer>> getBytes() {
    return bytes;
  }

  public void setBytes(JsonNullable<List<Integer>> bytes) {
    this.bytes = bytes;
  }

  public ChatCompletionTokenLogprob topLogprobs(List<@Valid ChatCompletionTokenLogprobTopLogprobsInner> topLogprobs) {
    this.topLogprobs = topLogprobs;
    return this;
  }

  public ChatCompletionTokenLogprob addTopLogprobsItem(ChatCompletionTokenLogprobTopLogprobsInner topLogprobsItem) {
    if (this.topLogprobs == null) {
      this.topLogprobs = new ArrayList<>();
    }
    this.topLogprobs.add(topLogprobsItem);
    return this;
  }

  /**
   * List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.
   * @return topLogprobs
   */
  @NotNull @Valid 
  @Schema(name = "top_logprobs", description = "List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("top_logprobs")
  public List<@Valid ChatCompletionTokenLogprobTopLogprobsInner> getTopLogprobs() {
    return topLogprobs;
  }

  public void setTopLogprobs(List<@Valid ChatCompletionTokenLogprobTopLogprobsInner> topLogprobs) {
    this.topLogprobs = topLogprobs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionTokenLogprob chatCompletionTokenLogprob = (ChatCompletionTokenLogprob) o;
    return Objects.equals(this.token, chatCompletionTokenLogprob.token) &&
        Objects.equals(this.logprob, chatCompletionTokenLogprob.logprob) &&
        Objects.equals(this.bytes, chatCompletionTokenLogprob.bytes) &&
        Objects.equals(this.topLogprobs, chatCompletionTokenLogprob.topLogprobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, logprob, bytes, topLogprobs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionTokenLogprob {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    logprob: ").append(toIndentedString(logprob)).append("\n");
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
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

