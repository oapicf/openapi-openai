package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ChatCompletionTokenLogprobTopLogprobsInner  {
  
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
  public ChatCompletionTokenLogprobTopLogprobsInner token(String token) {
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
  public ChatCompletionTokenLogprobTopLogprobsInner logprob(BigDecimal logprob) {
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
  public ChatCompletionTokenLogprobTopLogprobsInner bytes(List<Integer> bytes) {
    this.bytes = bytes;
    return this;
  }

  /**
   * Adds a new item to the <code>bytes</code> list.
   */
  public ChatCompletionTokenLogprobTopLogprobsInner addBytesItem(Integer bytesItem) {
    this.bytes.add(bytesItem);
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
    ChatCompletionTokenLogprobTopLogprobsInner chatCompletionTokenLogprobTopLogprobsInner = (ChatCompletionTokenLogprobTopLogprobsInner) o;
    return Objects.equals(this.token, chatCompletionTokenLogprobTopLogprobsInner.token) &&
        Objects.equals(this.logprob, chatCompletionTokenLogprobTopLogprobsInner.logprob) &&
        Objects.equals(this.bytes, chatCompletionTokenLogprobTopLogprobsInner.bytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, logprob, bytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionTokenLogprobTopLogprobsInner {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    logprob: ").append(toIndentedString(logprob)).append("\n");
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
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

