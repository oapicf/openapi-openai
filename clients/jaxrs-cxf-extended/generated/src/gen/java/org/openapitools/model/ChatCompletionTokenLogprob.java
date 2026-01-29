package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChatCompletionTokenLogprobTopLogprobsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ChatCompletionTokenLogprob  {
  
 /**
  * The token.
  */
  @ApiModelProperty(required = true, value = "The token.")
  private String token;

 /**
  * The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
  */
  @ApiModelProperty(required = true, value = "The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.")
  @Valid
  private BigDecimal logprob;

 /**
  * A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
  */
  @ApiModelProperty(required = true, value = "A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.")
  private List<Integer> bytes;

 /**
  * List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.
  */
  @ApiModelProperty(required = true, value = "List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.")
  @Valid
  private List<@Valid ChatCompletionTokenLogprobTopLogprobsInner> topLogprobs = new ArrayList<>();
 /**
  * The token.
  * @return token
  */
  @JsonProperty("token")
  @NotNull
  public String getToken() {
    return token;
  }

  /**
   * Sets the <code>token</code> property.
   */
 public void setToken(String token) {
    this.token = token;
  }

  /**
   * Sets the <code>token</code> property.
   */
  public ChatCompletionTokenLogprob token(String token) {
    this.token = token;
    return this;
  }

 /**
  * The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely.
  * @return logprob
  */
  @JsonProperty("logprob")
  @NotNull
  public BigDecimal getLogprob() {
    return logprob;
  }

  /**
   * Sets the <code>logprob</code> property.
   */
 public void setLogprob(BigDecimal logprob) {
    this.logprob = logprob;
  }

  /**
   * Sets the <code>logprob</code> property.
   */
  public ChatCompletionTokenLogprob logprob(BigDecimal logprob) {
    this.logprob = logprob;
    return this;
  }

 /**
  * A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be &#x60;null&#x60; if there is no bytes representation for the token.
  * @return bytes
  */
  @JsonProperty("bytes")
  @NotNull
  public List<Integer> getBytes() {
    return bytes;
  }

  /**
   * Sets the <code>bytes</code> property.
   */
 public void setBytes(List<Integer> bytes) {
    this.bytes = bytes;
  }

  /**
   * Sets the <code>bytes</code> property.
   */
  public ChatCompletionTokenLogprob bytes(List<Integer> bytes) {
    this.bytes = bytes;
    return this;
  }

  /**
   * Adds a new item to the <code>bytes</code> list.
   */
  public ChatCompletionTokenLogprob addBytesItem(Integer bytesItem) {
    this.bytes.add(bytesItem);
    return this;
  }

 /**
  * List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested &#x60;top_logprobs&#x60; returned.
  * @return topLogprobs
  */
  @JsonProperty("top_logprobs")
  @NotNull
  public List<@Valid ChatCompletionTokenLogprobTopLogprobsInner> getTopLogprobs() {
    return topLogprobs;
  }

  /**
   * Sets the <code>topLogprobs</code> property.
   */
 public void setTopLogprobs(List<@Valid ChatCompletionTokenLogprobTopLogprobsInner> topLogprobs) {
    this.topLogprobs = topLogprobs;
  }

  /**
   * Sets the <code>topLogprobs</code> property.
   */
  public ChatCompletionTokenLogprob topLogprobs(List<@Valid ChatCompletionTokenLogprobTopLogprobsInner> topLogprobs) {
    this.topLogprobs = topLogprobs;
    return this;
  }

  /**
   * Adds a new item to the <code>topLogprobs</code> list.
   */
  public ChatCompletionTokenLogprob addTopLogprobsItem(ChatCompletionTokenLogprobTopLogprobsInner topLogprobsItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

